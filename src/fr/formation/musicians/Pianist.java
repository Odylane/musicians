package fr.formation.musicians;

public class Pianist extends Musician {
	

	public Pianist(String name) {
		//appel au constructeur parent avec la m�me signature (=nom du constructeur, arguments => l'ordre, le nombre d'arguments, type)
		super(name);
	}

	//on (re)d�finit le comportement de la m�thode play(), @Override "facultatif"
	@Override
	public void play() {
		//ici super est optionnel
		System.out.println(super.getName() + " is playing piano");
	}

}
