package com.animal;

public class Seagull extends Flaying {

	private String pens;	
	
	public Seagull(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void setColorHair(String pens) {
		this.pens=pens;
	}
	
	public String getColorHair(){
		return pens;
	}
	
}
