package com.empresa;

import java.util.HashMap;

import com.util.EmpresaUtil;
import com.util.Util;

public class Gerente extends Empleado {	
	
	public static final String CARGO_GERENTE="Gerente";
	//private static String cargo;
	
	public Gerente(Integer idEmpleado, String nombreCompleto, Integer fechaNacimiento, Double precioHora, Integer fechaIngreso, Boolean lider) {
		super(idEmpleado, nombreCompleto, fechaNacimiento, precioHora, fechaIngreso, lider);
		this.cargo=CARGO_GERENTE;
	}

	@Override
	public void setCargo() {
		this.cargo=CARGO_GERENTE;
	}

	@Override
	public void showEmpleado() {
		System.out.println("DATOS EMPLEADO");
		System.out.println("Cargo: "+cargo);
		super.showEmpleado();
	}

	/*
	 * Imprime reporte de sueldos
	 */
	public static void reporteDeSueldos(HashMap<Integer,Empleado> listaEmpleados){
		Double cero=0.00;
		Double sueldoGerente=cero;
		Double sueldoContador=cero;
		Double sueldoAlmacenero=cero;

		//Imprimir reporte de sueldos
		System.out.println("REPORTE DE SUELDOS\n");
		for(Integer key : listaEmpleados.keySet()){
			System.out.println("Cargo: " +EmpresaUtil.nvl(listaEmpleados.get(key).getCargo()));
			System.out.println("Nombre: "+EmpresaUtil.nvl(listaEmpleados.get(key).getNombreCompleto()));
			System.out.println("Sueldo: "+EmpresaUtil.nvl(listaEmpleados.get(key).getSueldo()));
			if (listaEmpleados.get(key).getHoraTrabajo()==null) {
				System.out.println("No tiene horas reportadas");
			}
			System.out.println();
			//TODO: cambiar cargos
			if (listaEmpleados.get(key).getCargo().equals(CARGO_GERENTE)) {
				sueldoGerente += Util.nvl(listaEmpleados.get(key).getSueldo(),cero);
			} else if (listaEmpleados.get(key).getCargo().equals(Contador.CARGO_CONTADOR)) {
				sueldoContador += Util.nvl(listaEmpleados.get(key).getSueldo(),cero);
			} else if (listaEmpleados.get(key).getCargo().equals(Almacenero.CARGO_ALMACENERO)) {
				sueldoAlmacenero += Util.nvl(listaEmpleados.get(key).getSueldo(),cero);
			}
		}
		
		System.out.println("");
		System.out.println("Total sueldos Gerentes: "   +sueldoGerente);
		System.out.println("Total sueldos Contadores: " +sueldoContador);
		System.out.println("Total sueldos Almaceneros: "+sueldoAlmacenero);
		System.out.println("Total sueldos: "+ (sueldoGerente+sueldoContador+sueldoAlmacenero));
	}
	


}
