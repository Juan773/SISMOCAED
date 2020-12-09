package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.upeu.edu.pe.sismocaed.entity.Vacantes;
import com.upeu.edu.pe.sismocaed.service.VacantesService;

@Service
public class VacanteService {
	
	Cloudinary cloudinary;
	@Autowired
	VacantesService vacantesService;
	
	private Map<String, String> valueMap = new HashMap<>();

	public VacanteService() {
		valueMap.put("cloud_name", "dndwycubq");
		valueMap.put("api_key", "545761586218496");
		valueMap.put("api_secret", "xj2raBJho7YSrm1IAqsm2LOwD0E");
		cloudinary = new Cloudinary(valueMap);
	}
	
	public Map upload(MultipartFile imagen, Vacantes vacantes) throws IOException{
		File file = convert(imagen);
		Map result = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
		vacantesService.save(vacantes);
		file.delete();
		return result;
	}
	
	public Map delete(String id) throws IOException{
		Map result = cloudinary.uploader().upload(id, ObjectUtils.emptyMap());
		return result;
	}
	
	private File convert(MultipartFile imagen) throws IOException{
		File file = new File(imagen.getOriginalFilename());
		FileOutputStream fo = new FileOutputStream(file);
		fo.write(imagen.getBytes());
		fo.close();
		return file;
	}
	
}
