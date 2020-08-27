package fr.formation.musicians;

public class Musician {
	
	private String name; // Encapsulation stricte
	
	private Instrument instrument;

	public Musician(String name, Instrument instrument) {
		this.name = name;
		this.instrument = instrument;
	}

	//accès aux données de la classe Musicien name et instrument
	//getName() nom de la méthode getName de "l'instrument" pour récupérer le nom de l'instrument
	public void play() {
		System.out.println(name + " is playing " + instrument.getName());
	}
	
}
