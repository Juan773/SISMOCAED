package com.upeu.edu.pe.sismocaed.message;

import com.upeu.edu.pe.sismocaed.entity.Convocatoria;
import com.upeu.edu.pe.sismocaed.entity.Postulante;

public class ResponseFile {
private Long iddetalle_convo;
private String url_solicitud;
private String fecha;
private String url_carta;
private String url_curriculum;
private String descripcion;
private Convocatoria idconvocatoria;
private Postulante idpostulante;
private long size;
public ResponseFile(Long iddetalle_convo,String url_solicitud, String fecha, String url_carta, String url_curriculum, String descripcion,
		Convocatoria idconvocatoria, Postulante idpostulante, long size) {
	super();
	this.iddetalle_convo = iddetalle_convo;
	this.url_solicitud = url_solicitud;
	this.fecha = fecha;
	this.url_carta = url_carta;
	this.url_curriculum = url_curriculum;
	this.descripcion = descripcion;
	this.idconvocatoria = idconvocatoria;
	this.idpostulante = idpostulante;
	this.size = size;
}
public Long getiddetalle_convo() {
	return iddetalle_convo;
}

public String getUrl_solicitud() {
	return url_solicitud;
}
public void setUrl_solicitud(String url_solicitud) {
	this.url_solicitud = url_solicitud;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public String getUrl_carta() {
	return url_carta;
}
public void setUrl_carta(String url_carta) {
	this.url_carta = url_carta;
}
public String getUrl_curriculum() {
	return url_curriculum;
}
public void setUrl_curriculum(String url_curriculum) {
	this.url_curriculum = url_curriculum;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public Convocatoria getIdconvocatoria() {
	return idconvocatoria;
}
public void setIdconvocatoria(Convocatoria idconvocatoria) {
	this.idconvocatoria = idconvocatoria;
}
public Postulante getIdpostulante() {
	return idpostulante;
}
public void setIdpostulante(Postulante idpostulante) {
	this.idpostulante = idpostulante;
}
public long getSize() {
	return size;
}
public void setSize(long size) {
	this.size = size;
}
	

}