package com.animal;

public class Lion extends Terrestrial {

	private String subspice;
	
	public Lion(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void setSubspiceAsian() {
		this.subspice="asiatica";
	}

	public void setSubspiceAfrican() {
		this.subspice="africa";
	}	
	
	public String getColorHair(){
		return subspice;
	}
}
