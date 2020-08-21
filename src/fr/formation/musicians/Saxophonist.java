package fr.formation.musicians;

public class Saxophonist extends Musician {
	
	public Saxophonist(String name) {
		super(name);
	}

	public void play() {
		System.out.println(getName() + " is playing saxophone");
	}

}
