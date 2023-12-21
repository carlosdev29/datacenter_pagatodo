package com.recargas.controller.dto;

public class RecargaDTOResponse {
	
	private String asesorName;
	private Integer valorRecarga;
	private Integer cantidadRecarga;
	private String operador;
	private StatusResponse statusResponse;
	
	public String getAsesorName() {
		return asesorName;
	}
	public void setAsesorName(String asesorName) {
		this.asesorName = asesorName;
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
	public StatusResponse getStatusResponse() {
		return statusResponse;
	}
	public void setStatusResponse(StatusResponse statusResponse) {
		this.statusResponse = statusResponse;
	}
	
	
	
	

}
