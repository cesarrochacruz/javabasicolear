package controlsueldos;

public class Contador {

	public double calculaSueldo (double horaTrabajo, double preciohora){
		double sueldo = horaTrabajo * preciohora;
		
		System.out.println("Horas Trabajadas: " + horaTrabajo);	
		System.out.println("Precio Hora: " + preciohora);	
		System.out.println("Empleado Sueldo: " + sueldo);
		return sueldo;
	}
	
}
