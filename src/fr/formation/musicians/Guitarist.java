package fr.formation.musicians;

public class Guitarist extends Musician {
	
	public Guitarist(String name, Instrument instrument) {
		super(name, instrument);
	}

	public void play() {
		System.out.println(getName() + " is playing " + getInstrument().getName());
	}
	
	@Override
	public void toto() {
		System.out.println("toto is playing guitar");
	}

}
