package com.calculadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Clase aritmetica para acumulacion incremental
 */
public class Suma implements IAcumula{

	public Suma(){		
	}
	
	public int operacion(int a,int b) {
			return a + b;		
	}

	public float operacion(float a, float b){
		return a + b;
	}
	
	public long operacion(long a, long b){
		return a + b;
	}
	
	public double operacion(double a, double b){
		return a + b;
	}

//	public double sumarContenidoArreglo(ArrayList<Integer> vec){
//		double resultado = 0;
////		for (Integer i : vec) resultado += i;
//		int i = 0;
//		while (i < vec.size()){
//			resultado += vec.get(i);
//			i++;
//		}
//		return resultado;
//	}
	
	public double sumarContenidoArreglo(List<Integer> vec){
		double resultado = 0;
		int i = 0;
		while (i < vec.size()){
			resultado += vec.get(i);
			i++;
		}
		return resultado;
	}

	public double sumarContenidoArreglo(Set<Integer> vec){
		double resultado = 0;
		//for (Integer i : vec) resultado += i;
		Iterator<Integer> iterator = vec.iterator();
		while (iterator.hasNext()){
			resultado += iterator.next();
		}
		return resultado;		
	}

	public double sumarContenidoArreglo(Map<Integer,Integer> vec){
		double resultado = 0;
		for(Integer key : vec.keySet()){
			resultado += vec.get(key);
		}
		return resultado;			
	}
	
}
