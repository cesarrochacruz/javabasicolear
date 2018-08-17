package com.animal;

public class Terrestrial extends Animal{

	public Terrestrial(String name) {
		super(name);
	}

	@Override
	public String getMove() {
		return "camina";
	}
	

}
