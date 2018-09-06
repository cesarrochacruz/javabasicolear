package com.empresa;

public abstract class Empleado implements IEmpleado{

	private Integer idEmpleado;
	private String nombreCompleto;
	private Integer fechaNacimiento;
	private Double sueldo;
	private Integer horaTrabajo;
	private Double precioHora;
	private Integer fechaIngreso;
	private Boolean lider;
	protected String cargo;
	
	public Empleado(Integer idEmpleado, String nombreCompleto, Integer fechaNacimiento, Double precioHora, Integer fechaIngreso, Boolean lider) {
		this.idEmpleado = idEmpleado;
		this.nombreCompleto = nombreCompleto;
		this.fechaNacimiento = fechaNacimiento;
		this.precioHora = precioHora;
		this.fechaIngreso = fechaIngreso;
		this.lider = lider;
	}	
	
	@Override
	public Double getSueldo() {
		return this.sueldo;
	}

	@Override
	public void setSueldo(Double sueldo) {
		this.sueldo=sueldo;
	}

	@Override
	public Integer getFechaingreso() {
		return fechaIngreso;
	}

	@Override
	public void setFechaIngreso(Integer fechaIngreso) {
		this.fechaIngreso=fechaIngreso;
	}

	public String getCargo() {
		return cargo;
	}		
	
	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Integer getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Integer fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getHoraTrabajo() {
		return horaTrabajo;
	}

	public void setHoraTrabajo(Integer horaTrabajo) {
		this.horaTrabajo = horaTrabajo;
	}

	public Double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(Double precioHora) {
		this.precioHora = precioHora;
	}	
	
	public Boolean getLider() {
		return lider;
	}

	public void setLider(Boolean lider) {
		this.lider = lider;
	}	
	
	@Override
	public void showEmpleado() {

		if (lider) {
			System.out.println("Lider de grupo");
		}		
		System.out.println("Id: "+idEmpleado);
		System.out.println("Nombre completo: "+nombreCompleto);
		System.out.println("Fecha de nacimiento: "+fechaNacimiento);
		System.out.println("Sueldo: "+sueldo);
		System.out.println("Horas de trabajo: "+horaTrabajo);
		System.out.println("Precio hora: "+precioHora);
		
	}

}
