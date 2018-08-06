package com.calculadora;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

public class Suma {
	public Suma() {
	}

	public int operacion(int a,int b) {
			int resultado = 0;
			resultado = a + b;
			return resultado;
		
	}
	
	public ArrayList ArmarLista (int[] cadena){
        int i = 0;
		ArrayList<Integer> lista = new ArrayList<Integer>();

        while(i<cadena.length){
        	lista.add(cadena[i]);	
        	++i;		
        }

        return lista;
	
	}
	
	public int sumarContenidoLista (ArrayList<Integer> lista){
		int resultado = 0;
        int i = 0;
        
        while(i<lista.size()){
        	resultado = resultado + lista.get(i);	
        	++i;		
        }

        return resultado;
	
	}


	public HashSet ArmarSet (int[] cadena){
        int i = 0;
        HashSet<Integer> coleccionSet = new HashSet<Integer>();

        while(i<cadena.length){
        	coleccionSet.add(cadena[i]);	
        	++i;		
        }

        return coleccionSet;
	
	}	


	public int sumarContenidoSet(HashSet<Integer> coleccion){
		
		Iterator<Integer> itr = coleccion.iterator();
		int resultado = 0;
		while(itr.hasNext())
		{
			resultado = resultado + itr.next();
		}
		
	    return resultado;
	}
	
	
	public HashMap ArmarMap (int[] cadena){
        int i = 0;
        HashMap<Integer,Integer> coleccionMap = new HashMap<Integer,Integer>();

        while(i<cadena.length){
        	coleccionMap.put(i,cadena[i]);	
        	++i;		
        }

        return coleccionMap;
	
	}		
	
	public int sumarContenidoColeccionMap(HashMap<Integer,Integer> coleccion){
		int resultado = 0;
        
        for(Integer i : coleccion.keySet()){
			resultado = resultado + coleccion.get(i);		
        }
	      return resultado;
	}

	
}	

	
