package com.recargas.db.entity;

public class RecargaEntity {
	
	private String Operador;
	private Integer cantidad;
	private Integer valor;
	private String asesor;
	
	
	public String getOperador() {
		return Operador;
	}
	public void setOperador(String operador) {
		Operador = operador;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public String getAsesor() {
		return asesor;
	}
	public void setAsesor(String asesor) {
		this.asesor = asesor;
	}

}
