package com.util;

public class EmpresaUtil {
	
	private static final String UNKNOWN = "desconocido";
    
    public static <T> String nvl(T arg0) {
        return (arg0 == null)?UNKNOWN:arg0.toString();
    }
     
    
}
