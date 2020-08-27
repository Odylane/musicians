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
	//le comportement sera défini dans la classe concrète
	//cette méthode n'est pas exécutée dans la classe abstraite
	public abstract void play();
	
	//s'implémenter par défaut car méthode non abstraite
	public void toto() {
		System.out.println("toto");
	}

}
