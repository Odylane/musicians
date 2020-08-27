package fr.formation.musicians;

public abstract class Musician {
	
	private String name; // Encapsulation stricte
	
	private Instrument instrument;

	//On ne peut pas construire une classe abstraite avec un new
	public Musician(String name, Instrument instrument) {
		this.name = name;
		this.instrument = instrument;
	}

	public String getName() {
		return name;
	}
	
	public Instrument getInstrument() {
		return instrument;
	}

	//Un musicien peut jouer d'un instrument,
	//le comportement sera d�fini dans la classe concr�te
	//cette m�thode n'est pas ex�cut�e dans la classe abstraite
	public abstract void play();
	
	//s'impl�menter par d�faut car m�thode non abstraite
	public void toto() {
		System.out.println("toto");
	}

}
