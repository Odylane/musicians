package fr.formation.musicians;

public abstract class Musician {
	
	private String name; // Encapsulation stricte

	//On ne peut pas construire une classe abstraite avec un new
	public Musician(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	//Un musicien peut jouer d'un instrument,
	//le comportement sera défini dans la classe concrète
	//cette méthode n'est pas exécutée dans la classe abstraite
	public abstract void play();
	

}
