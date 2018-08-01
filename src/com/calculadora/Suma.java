package com.calculadora;

import java.util.ArrayList;

public class Suma {
	public Suma() {
	}

	public int operacion(int a,int b) {
			int resultado = 0;
			resultado = a + b;
			return resultado;
		
	}
	
	public ArrayList sumarContenidoArreglo (int[] cadena){
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
	
	
}	

	
