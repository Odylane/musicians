package fr.formation.musicians;

public class Guitarist extends Musician {
	
	public Guitarist(String name) {
		super(name);
	}

	public void play() {
		System.out.println(getName() + " is playing guitar");
	}

}
