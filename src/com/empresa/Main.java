package com.empresa;

import java.util.HashMap;
import com.util.Util;

public class Main {

	public static void main(String[] args) {
		Integer idEmpresa=0;
		HashMap<Integer,Empleado> le = new HashMap<Integer,Empleado>();
		//Crear empresa
		Empresa e = new Empresa(++idEmpresa, "LEARSOFT", 30699385731L, le);
					
		//1)registrar los empleados solicitados
		e = loadEmpresaEmpleados(e);
		
		//2)los empleados registran sus horas trabajadas
		for (Integer id : e.getListaEmpleados().keySet()) {
			e.getListaEmpleados().get(id).setHoraTrabajo(Util.getRamdonNumber(1,180));		
		}
		
		//3)los contadores realizan los pagos respectivos
		Contador.calcularSueldo(e.getListaEmpleados());
		
		//4)el gerente imprime cuanto le cuestan sus empleados
		Gerente.reporteDeSueldos(e.getListaEmpleados());
	}
	
	private static Empresa loadEmpresaEmpleados (Empresa e) {
		final Double PRECIO_HORA=190.00;
		Integer idEmpleado=0;		
		//Gerente
		e.addEmpleado(++idEmpleado, new Gerente(idEmpleado, "Cesar Rocha", 19001231, PRECIO_HORA, 20171201, true));
		//Contadores
		e.addEmpleado(++idEmpleado, new Contador(idEmpleado, "Contador "+idEmpleado, 19801101, PRECIO_HORA, 20180101, true));
		e.addEmpleado(++idEmpleado, new Contador(idEmpleado, "Contador "+idEmpleado, 19810120, PRECIO_HORA, 20180201, false));
		//Almacenero
		e.addEmpleado(++idEmpleado, new Almacenero(idEmpleado, "Almacenero "+idEmpleado, 19850404, PRECIO_HORA, 20190701, true));
		e.addEmpleado(++idEmpleado, new Almacenero(idEmpleado, "Almacenero "+idEmpleado, 19860311, PRECIO_HORA, 20190801, false));
		e.addEmpleado(++idEmpleado, new Almacenero(idEmpleado, "Almacenero "+idEmpleado, 19901101, PRECIO_HORA, 20190801, false));
		e.addEmpleado(++idEmpleado, new Almacenero(idEmpleado, "Almacenero "+idEmpleado, 19920204, PRECIO_HORA, 20190801, false));
		e.addEmpleado(++idEmpleado, new Almacenero(idEmpleado, "Almacenero "+idEmpleado, 19831211, PRECIO_HORA, 20190801, false));
		return e;
	}

}
