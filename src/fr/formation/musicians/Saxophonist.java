package fr.formation.musicians;

public class Saxophonist extends Musician {
	
	public Saxophonist(String name, Instrument instrument) {
		super(name, instrument);
	}

	public void play() {
		System.out.println(getName() + " is playing " + getInstrument().getName());
	}

}
