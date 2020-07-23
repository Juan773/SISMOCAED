package com.upeu.edu.pe.sismocaed.serviceImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;


@Service
public class PublicidService {

	 Cloudinary cloudinary;
	 
	 private Map<String, String> valuesMap = new HashMap<>();
	 
	 public PublicidService() {
       valuesMap.put("cloud_name", "ingenieria-de-sistemas");
	   valuesMap.put("api_key", "639162143254253");
	   valuesMap.put("api_secret", "ql5n09_Ai524v1SGzWY0Bipj6pQ");
	   cloudinary = new Cloudinary(valuesMap);
	 }
	 public Map upload(MultipartFile multipartFile) throws IOException {
		 File file = convert(multipartFile);
	     Map result = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
	     file.delete();
      return result;
	 }
	 public Map delete(String idpublicidad) throws IOException {
	        Map result = cloudinary.uploader().destroy(idpublicidad, ObjectUtils.emptyMap());
	        return result;
	 }
	 
	private File convert(MultipartFile multipartFile) throws IOException{
		// TODO Auto-generated method stub
		 File file = new File(multipartFile.getOriginalFilename());
	     FileOutputStream fo = new FileOutputStream(file);
	     fo.write(multipartFile.getBytes());
	     fo.close();
	   return file;
	}
}
	 

