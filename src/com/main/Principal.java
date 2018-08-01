package com.main;

import com.calculadora.Suma;
import com.calculadora.Resta;
import com.calculadora.Multipli;
import com.calculadora.Division;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		
		int valorA = 4;
		int valorB= 2;
		int resultado = 0;
		int ValorC = 0;
		float resultadof = 0;
		int[] ValorD = new int[5];
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		System.out.println("Parametro 1: " + valorA);
		System.out.println("Parametro 2: " + valorB);
		
		
		Suma suma = new Suma();
		resultado = suma.operacion(valorA, valorB);
		ValorC = resultado;
		System.out.println("Resultado de suma: " + resultado);	
		
		Resta resta = new Resta();
		resultado = resta.operacion(valorA, valorB);
		System.out.println("Resultado de resta: " + resultado);
		
		Multipli multipli = new Multipli();
		resultado = multipli.operacion(valorA, valorB);
		System.out.println("Resultado de multiplicacion: " + resultado);
		
		resultado = multipli.operacion(valorA, valorB, ValorC);
		System.out.println("Resultado de multiplicacion multiplicado por suma: " + resultado);
		
		resultado = multipli.operacionfor(valorA, valorB);
		System.out.println("Resultado de multiplicacion con FOR: " + resultado);
		
		resultado = multipli.operacionwhile(valorA, valorB);
		System.out.println("Resultado de multiplicacion con WHILE: " + resultado);
		
		Division division = new Division();
		resultadof = division.operacion(valorA, valorB);
		System.out.println("Resultado de division: " + resultadof);
		
		
        for(int i=0;i<ValorD.length;++i){
        	ValorD[i]= ((int) (Math.random() * 10) + 1); //Obtengo números random
        }
		
		res = suma.sumarContenidoArreglo(ValorD);
		System.out.println("Resultado de sumarContenidoArreglo: " + res);
		
		resultado = suma.sumarContenidoLista(res);
		System.out.println("Resultado de sumarContenidoLista: " + resultado);
	}

}
