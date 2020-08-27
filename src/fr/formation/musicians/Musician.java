package fr.formation.musicians;

public class Musician {
	
	private String name; // Encapsulation stricte
	
	private Instrument instrument;

	public Musician(String name, Instrument instrument) {
		this.name = name;
		this.instrument = instrument;
	}

	//acc�s aux donn�es de la classe Musicien name et instrument
	//getName() nom de la m�thode getName de "l'instrument" pour r�cup�rer le nom de l'instrument
	public void play() {
		System.out.println(name + " is playing " + instrument.getName());
	}
	
}
