package controlsueldos;



public class Empresa {

	public static void main(String[] args) {
		int id = 567487;
		String nombre = "Empresa ABC S.A.";
		int cuit =30684648;
		//ArrayList listaEmpleados;
		int horastrab;
		int horastotal;
		double preciohora=150;
		double sueldo;
		double sueldototal=0;
		int cantemp = 0;
		
		Empleado emp = new Empleado();		
		Contador con = new Contador();
		Gerente ger = new Gerente();
		
		System.out.println("------------------------------");
		
		System.out.println("Empresa: " + nombre);
		
		System.out.println("------------------------------");			
		
		for (int i=1 ; i<=7 ; i++) {
				horastrab = emp.obtieneEmpleado (i);
				horastotal = + horastrab;
				sueldo = con.calculaSueldo(horastrab,preciohora);
				sueldototal = + sueldo;
				++ cantemp;
				System.out.println("---");	
		}

		System.out.println("------------------------------");	
		
		ger.reporteDeSueldosTotal(cantemp,sueldototal);

		System.out.println("------------------------------");	
	}
}
