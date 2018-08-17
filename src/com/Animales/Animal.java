package com.Animales;

public  abstract  class Animal {

	public static void main(String[] args) {

	Delfin delfin1 = new Delfin();

	Gaviota gaviota1 = new Gaviota();

	Leon leon1 = new Leon();

	System.out.println("El delfin tiene " + delfin1.obtienePatas() +" patas");

	System.out.println("La gaviota tiene " + gaviota1.obtienePatas() +" patas"); 

	System.out.println("El leon tiene " + leon1.obtienePatas() +" patas"); 

	System.out.println("---------------");

	
	System.out.println("El delfin se comunica asi: " + delfin1.obtieneSonido());

	System.out.println("La gaviota se comunica asi: " + gaviota1.obtieneSonido());

	System.out.println("El leon se comunica asi: " + leon1.obtieneSonido());

	System.out.println("---------------");

	
	System.out.println("El delfin es de color " + delfin1.obtieneColor());
	
	System.out.println("La gaviota es de color " + gaviota1.obtieneColor());
	
	System.out.println("El leon es de color " + leon1.obtieneColor());

	System.out.println("---------------");
	
	
	}     
}
