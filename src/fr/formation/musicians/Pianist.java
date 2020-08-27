package fr.formation.musicians;

public class Pianist extends Musician {
	

	public Pianist(String name, Instrument instrument) {
		//appel au constructeur parent avec la m�me signature (=nom du constructeur, arguments => l'ordre, le nombre d'arguments, type)
		super(name, instrument);
	}

	//on (re)d�finit le comportement de la m�thode play(), @Override "facultatif"
	@Override
	public void play() {
		//ici super est optionnel
		System.out.println(super.getName() + " is playing " + getInstrument().getName());//on r�cup�re l'instrument
	}

}
