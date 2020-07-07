package com.upeu.edu.pe.sismocaed.service;
import java.util.List;

import com.upeu.edu.pe.sismocaed.entity.Rol;
public interface RolService {
public List<Rol>findAll();
public Rol findById(Long idrol);
public Rol save(Rol rol);
public void delete (Long idrol);

}
