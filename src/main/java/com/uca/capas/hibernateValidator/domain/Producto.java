package com.uca.capas.hibernateValidator.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	
	@Pattern(regexp = "[\\s]*[0-9]*[1-9]+",message="Ingresa el codigo del producto.")
	@Size(min=12,max=12, message ="El Codigo tiene que ser igual a 12 digitos.")
	String idProducto;
	
	@Pattern(regexp = "[\\s]*[0-9]*[1-9]+",message="Ingresa un numero")
	String existencia;
	
	@Size(min=1,max=100)
	String nombreProducto;
	
	@Size(min=1,max=100)
	String marca;
	
	@Size(min=1,max=500)
	String descripcion;
	
	@Pattern(regexp = "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$",message="La fecha tiene que ser en formato DD/MM/YYYY")
	String fecha;

	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public String getExistencia() {
		return existencia;
	}
	public void setExistencia(String existencia) {
		this.existencia = existencia;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	

}
