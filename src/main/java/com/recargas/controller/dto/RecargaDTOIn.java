package com.recargas.controller.dto;

public class RecargaDTOIn {
	
	private String asesorName;
	private String documentUser;
	private Integer valorRecarga;
	private Integer cantidadRecarga;
	private String operador;
	
	public String getAsesorName() {
		return asesorName;
	}
	public void setAsesorName(String asesorName) {
		this.asesorName = asesorName;
	}
	public String getDocumentUser() {
		return documentUser;
	}
	public void setDocumentUser(String documentUser) {
		this.documentUser = documentUser;
	}
	public Integer getValorRecarga() {
		return valorRecarga;
	}
	public void setValorRecarga(Integer valorRecarga) {
		this.valorRecarga = valorRecarga;
	}
	public Integer getCantidadRecarga() {
		return cantidadRecarga;
	}
	public void setCantidadRecarga(Integer cantidadRecarga) {
		this.cantidadRecarga = cantidadRecarga;
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	
	
	

}
