package fr.formation.musicians;

public abstract class Musician {
	
	private String name;

	public Musician(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	//Un musicien peut jouer d'un instrument,
	//le comportement sera défini dans la classe concrète
	public abstract void play();
	

}
