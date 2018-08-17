package com.animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {

	public static void main(String[] args) {
		List<Animal> animal = new ArrayList<Animal>();

		for (int i = 0; i < 5; i++) {
			animal.add(new Lion("lion"+i));
			animal.add(new Seagull("gaviota"+i));
			animal.add(new Dolphin("esteve"+i));
		}
		
		for (Animal tmp : animal) {
			System.out.println(tmp.getName()+" "+animal.get(0).getMove());
		}

	}

}
