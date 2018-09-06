package com.empresa;

import java.util.HashMap;

public class Empresa {
	private Integer idEmpresa;
	private String nombre;
	private Long cuit;
	private HashMap<Integer,Empleado> listaEmpleados;
	
	public Empresa(Integer id, String nombre, Long cuit, HashMap<Integer,Empleado> listaEmpleados){
		this.idEmpresa=id;
		this.nombre=nombre;
		this.cuit=cuit;
		this.listaEmpleados=listaEmpleados;
	}
	
	public Integer getId() {
		return idEmpresa;
	}
	public void setId(Integer id) {
		this.idEmpresa = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getCuit() {
		return cuit;
	}
	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}
	public HashMap<Integer,Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(HashMap<Integer,Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public void showEmpresa(){
		System.out.println("DATOS EMPRESA");
		System.out.println("Id: "+idEmpresa+"\nNombre: "+nombre);
	}

	public void addEmpleado(Integer id, Empleado emp) {
		listaEmpleados.put(id, emp);
	}	
}
