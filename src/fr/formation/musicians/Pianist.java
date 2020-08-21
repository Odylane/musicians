package fr.formation.musicians;

public class Pianist extends Musician {

	public Pianist(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println(getName() + " is playing piano");
	}

}
