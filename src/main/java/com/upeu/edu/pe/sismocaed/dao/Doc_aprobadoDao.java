package com.upeu.edu.pe.sismocaed.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.upeu.edu.pe.sismocaed.entity.Doc_aprobado;
@Repository
public interface Doc_aprobadoDao extends CrudRepository <Doc_aprobado, Long> {

}
