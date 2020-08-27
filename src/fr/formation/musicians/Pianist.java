package fr.formation.musicians;

public class Pianist extends Musician {
	

	public Pianist(String name, Instrument instrument) {
		//appel au constructeur parent avec la même signature (=nom du constructeur, arguments => l'ordre, le nombre d'arguments, type)
		super(name, instrument);
	}

	//on (re)définit le comportement de la méthode play(), @Override "facultatif"
	@Override
	public void play() {
		//ici super est optionnel
		System.out.println(super.getName() + " is playing " + getInstrument().getName());//on récupère l'instrument
	}

}
