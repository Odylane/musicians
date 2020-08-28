package fr.formation.musicians;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Musician {
	
	private String name; // Encapsulation stricte
	
	//new ArrayList<> pour respecter le principe d'encapsulation,
	//la liste n'est pas construite � l'ext�rieur de la classe Musician, on ne modifie pas l'�tat d'un objet
	private List<Instrument> instruments = new ArrayList<>();

	/**
     * Creates a new musician with given name and instruments.
     *
     * @param name        the name of the musician
     * @param instruments 1 or more instruments
     * @throws NullPointerException if name or instruments is null; or
     *                              instruments is empty
     */
    public Musician(String name, Instrument... instruments) {
	// Programmation d�fensive, garantir la coh�rence des donn�es � la
	// construction
	if (name == null) { // Defensive programming
	    throw new NullPointerException("name cannot be null");
	}
	if (instruments == null) { // Defensive programming
	    throw new NullPointerException("instruments cannot be null");
	}
	if (instruments.length == 0) { // Defensive programming
	    throw new IllegalArgumentException("instruments cannot be empty");
	}
	this.name = name;
	for (Instrument instrument : instruments) {
	    add(instrument);
	}
    }

	public String getName() {
		return name;
	}



	public List<Instrument> getInstruments() {
		return instruments;
	}



	public void add(Instrument instrument) {
		//Programmation d�fensive , garantir la coh�rence des donn�es
		//au changement d'�tat de l'objet, pendant sa dur�e de vie
		Objects.requireNonNull(instrument, "instrument cannot be null");
		instruments.add(instrument);
	}

	//acc�s aux donn�es de la classe Musicien name et instrument
	//getName() nom de la m�thode getName de "l'instrument" pour r�cup�rer le nom de l'instrument
	public void play() {
		for (Instrument instrument : instruments) {
			System.out.println(name + " is playing " + instrument.getName());
		}
	}
	
}
