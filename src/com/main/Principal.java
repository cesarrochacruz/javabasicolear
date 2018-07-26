package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.calculadora.*;

public class Principal {

	public static void main(String[] args) {
				
		int valorA = 5;
		int valorB = 10;
		double resultado = 0;		
				
		System.out.println("Resultado de");
		
		Suma suma = new Suma();
		resultado = suma.operacion(valorA, valorB);
		System.out.println(" Suma: " + resultado);

		Resta resta = new Resta();
		resultado = resta.operacion(valorA, valorB);		
		System.out.println(" Resta: " + resultado);
		
		Multiplicacion multi = new Multiplicacion();
		resultado = multi.operacion(valorA, valorB);
		System.out.println(" Multiplicacion: " + resultado);

		Division div = new Division();
		resultado = div.operacion(valorA, valorB);
		System.out.println(" Divicion: " + resultado);
		
		//Ejercicio 2 de ciclos y arreglos
		resultado = multi.MultiplicacionPorCiclos(valorA, valorB);	
		System.out.println(" Multiplicacion(ciclos): " + resultado);	
		
		//Ejercicio 3 de listas
		
		//3.1 List
		List<Integer> vec = new ArrayList<Integer>();
		vec.add(valorA);
		vec.add(valorB);
		resultado = suma.sumarContenidoArreglo(vec);
		System.out.println(" Suma(List): "+resultado);

		//3.2 Set
		Set<Integer> set = new HashSet<>(Arrays.asList(valorA, valorB));
		resultado = suma.sumarContenidoArreglo(set);
		System.out.println(" Suma(Set): "+resultado);
		
		//3.3 Map
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0, valorA);
		map.put(1, valorB);
		resultado = suma.sumarContenidoArreglo(map);
		System.out.println(" Suma(Map): "+resultado);
	}

}
