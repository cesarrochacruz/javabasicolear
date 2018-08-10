package com.main;

import com.calculadora.Suma;
import com.calculadora.Resta;
import com.calculadora.Multiplicacion;
import com.calculadora.Division;


public class Principal {

	public static void main(String[] args) {
		
	
		int valorAint = 15;
		int valorBint= 10;
		int resultadoInt = 0;
		
		System.out.println("valor A : "+valorAint);
		System.out.println("valor B : "+valorBint);
		
		//SUMA DE VALORES INT A Y B 
		Suma suma = new Suma();
		resultadoInt = suma.operacion(valorAint, valorBint);
		System.out.println("Resultado de suma int: " + resultadoInt);
		
		//RESTA DE VALORES INT A Y B 
		Resta resta = new Resta();
		resultadoInt = resta.operacion(valorAint, valorBint);
		System.out.println("Resultado de Resta int: " + resultadoInt);
		
		//MULTIPLICACION DE VALORES INT A Y B 
		Multiplicacion multiplicacion = new Multiplicacion();
		resultadoInt = multiplicacion.operacion(valorAint,valorBint);
		System.out.println("Resultado de multiplicacion int: " + resultadoInt);

		//DIVISION DE VALORES INT A Y B 
		Division division = new Division();
		resultadoInt = division.operacion(valorAint, valorAint);
		System.out.println("Resultado de division int: "+ resultadoInt);
		
		

		double valorAdouble = 1.4;
		double valorBdouble= 10.1;
		double resultadoDouble = 0;
		
		System.out.println("valor A : "+valorAdouble);
		System.out.println("valor B : "+valorBdouble);
		
		//SUMA DE VALORES DOUBLE A Y B 
		resultadoDouble = suma.operacion(valorAdouble, valorBdouble);
		System.out.println("Resultado de suma Double: " + resultadoDouble);
		
		//RESTA DE VALORES INT A Y B 
		resultadoDouble = resta.operacion(valorAdouble, valorBdouble);
		System.out.println("Resultado de Resta Double : " + resultadoDouble);
		
		//MULTIPLICACION DE VALORES INT A Y B 
		resultadoDouble = multiplicacion.operacion(valorAdouble,valorBdouble);
		System.out.println("Resultado de multiplicacion Double: " + resultadoDouble);

		//DIVISION DE VALORES INT A Y B 
		resultadoDouble = division.operacion(valorAdouble, valorBdouble);
		System.out.println("Resultado de division Double "+ resultadoDouble);
		
		// SUMAR VALORES DE UN ARREGLO 
		int resultado;
		int sumar[] = {4,3,5,7,10,1};
		
		resultado =  suma.sumarArreglo(sumar);
		System.out.println("Resultado de suma de arreglos : "+resultado);
		
	}

}
