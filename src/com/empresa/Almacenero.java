package com.empresa;

public class Almacenero extends Empleado {

	public static final String CARGO_ALMACENERO="Almacenero";
	//private static String cargo;	
	
	public Almacenero(Integer idEmpleado, String nombreCompleto, Integer fechaNacimiento, 
			Double precioHora, Integer fechaIngreso, Boolean lider) {
		super(idEmpleado, nombreCompleto, fechaNacimiento, precioHora, fechaIngreso, lider);
		this.cargo=CARGO_ALMACENERO;
	}

	@Override
	public String getCargo() {
		return cargo;
	}

	@Override
	public void setCargo() {
		this.cargo=CARGO_ALMACENERO;
	}

}
