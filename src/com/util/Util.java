package com.util;

import java.util.Random;

public class Util {

    public static Double round2Decimals(double d) {        
        return (double) Math.round(d*100)/100;
    }    
    
    public static <T> T nvl(T arg0, T arg1) {
        return (arg0 == null)?arg1:arg0;
    }  	

    public static Integer getRamdonNumber(int min, int max){
        if (min >= max) {
            throw new IllegalArgumentException("El minimo debe ser mayor al maximo");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
      
}
