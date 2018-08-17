package com.animal;

public class Dolphin extends Sea {

	private String water;
	
	public Dolphin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void setSaltWater() {
		this.water="salada";
	}

	public void setFreshWater() {
		this.water="dulce";
	}
	
	public String getColorPens(){
		return water;
	}
}
