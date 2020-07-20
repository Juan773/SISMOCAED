package com.upeu.edu.pe.sismocaed.dao;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.upeu.edu.pe.sismocaed.entity.Detalle_convo;


@Repository
public interface Detalle_convoDao extends CrudRepository<Detalle_convo,Long>{
   
}
