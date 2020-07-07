package com.upeu.edu.pe.sismocaed.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.upeu.edu.pe.sismocaed.entity.Opcion;
@Repository
public interface OpcionDao extends CrudRepository <Opcion, Long>{

}
