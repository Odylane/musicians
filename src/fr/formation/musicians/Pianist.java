package fr.formation.musicians;

public class Pianist extends Musician {

	public Pianist(String name) {
		super(name);
	}

	//on (re)d�finit le comportement de la m�thode play()
	@Override
	public void play() {
		System.out.println(getName() + " is playing piano");
	}

}
