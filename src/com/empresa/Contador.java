package com.empresa;

import java.util.HashMap;

import com.util.Util;

public class Contador extends Empleado {

	public static final String CARGO_CONTADOR="Contador";
	//private static String cargo;	
	
	public Contador(Integer idEmpleado, String nombreCompleto, Integer fechaNacimiento, Double precioHora,
			Integer fechaIngreso, Boolean lider) {
		super(idEmpleado, nombreCompleto, fechaNacimiento, precioHora, fechaIngreso, lider);
		this.cargo=CARGO_CONTADOR;
	}

	@Override
	public String getCargo() {
		return cargo;
	}

	@Override
	public void setCargo() {
		this.cargo=CARGO_CONTADOR;
	}

	public static void calcularSueldo(HashMap<Integer,Empleado> listaEmpleados){
		//Calcular sueldos
		for(Integer id : listaEmpleados.keySet()){
			Empleado emp = listaEmpleados.get(id); //Empleado
			emp.setSueldo(Util.nvl(emp.getHoraTrabajo(),0) * emp.getPrecioHora()); //Calculo sueldo
			listaEmpleados.put(id, emp);			
		}
		
	}	
	
}
