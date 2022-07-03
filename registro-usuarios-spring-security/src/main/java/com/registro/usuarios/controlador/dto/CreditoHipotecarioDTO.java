package com.registro.usuarios.controlador.dto;

public class CreditoHipotecarioDTO {
	
	private Long id;
	private Integer edad;
	private String salario;
	private Integer cuotas;
	private Integer trabajo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public Integer getCuotas() {
		return cuotas;
	}
	public void setCuotas(Integer cuotas) {
		this.cuotas = cuotas;
	}
	public Integer getTrabajo() {
		return trabajo;
	}
	public void setTrabajo(Integer trabajo) {
		this.trabajo = trabajo;
	}
	public CreditoHipotecarioDTO(Integer edad, String salario, Integer cuotas, Integer trabajo) {
		super();
		this.edad = edad;
		this.salario = salario;
		this.cuotas = cuotas;
		this.trabajo = trabajo;
	}
	
	public CreditoHipotecarioDTO() {
	}
	
}
