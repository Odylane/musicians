package fr.formation.musicians;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Instrument piano = new Piano("piano");
		
		//construction de l'objet "guitar"
		Instrument guitar = new Guitar("guitar");
				
		Instrument saxophone = new Saxophone("saxophone");
		
		//Instancier une liste de musiciens
		//la liste précise le type d'objet qu'elle contient = généricité
		//on peuple la liste
		List<Musician> musicians = new ArrayList<>();
		musicians.add(new Musician("John", guitar));
		musicians.add(new Musician("Daria", saxophone));
		musicians.add(new Musician("Frank", piano));
		play(musicians); // appel à la méthode play de la classe Application
	}
	
	private static void play(List<Musician> musicians ) {
		for (Musician musician : musicians) {
			musician.play();
		}
	}

}
