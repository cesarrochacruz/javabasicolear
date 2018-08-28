package controlsueldos;

public class Empleado {

	public int obtieneEmpleado(int id) {
		String nombreCopleto="EMPLEADO " + id;
		int horastrab = reportarHorasTrabajadas ();
		int dni = ((int) (Math.random() * 99999999)); //Obtengo números random;
		String cargo;
		
		if (id < 5) {
			cargo = "Almacenero";
		}else {
			if (id == 7) {
				cargo = "Gerente";				
			}else {
				cargo = "Contador";
			}
		}
		
		
		System.out.println("Empleado Nro: " + id);
		System.out.println("Empleado Nombre: " + nombreCopleto);
		System.out.println("Empleado DNI: " + dni);
		System.out.println("Empleado Cargo: " + cargo);
		return horastrab;
	}
	
	public int reportarHorasTrabajadas () {
		int horas = ((int) (Math.random() * 100) + 1); //Obtengo números random;
		return horas;
	}
	
}
