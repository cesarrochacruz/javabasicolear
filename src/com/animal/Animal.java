package com.animal;

public abstract class Animal implements IAnimal {

	private String name;
	
	public Animal(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name){
		this.name=name;
	}

	public abstract String getMove();

}
