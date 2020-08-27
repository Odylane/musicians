package fr.formation.musicians;

public class Application {

	public static void main(String[] args) {
		
		Instrument piano = new Piano("piano");
		
		//variable pianist de type Musician
		Musician pianist = new Pianist("Frank", piano);
		
		//construction de l'objet "guitar"
		Instrument guitar = new Guitar("guitar");
		//construction d'un guitariste John qui joue de la guitare
		Musician guitarist = new Guitarist("John", guitar);
		
		Instrument saxophone = new Saxophone("saxophone");
		Musician saxophonist = new Saxophonist("Daria", saxophone);
		
		//Ici appel play de Musician
		// A l'execution, méthode play des classes concrètes qui est invoquée
		//Polymorphisme "dynamique", invocation dynamique, (=polymorphisme par héritage=
		//Le musicien a plusieurs formes (la forme Guitarist, Pianist, et Saxophonist)
		saxophonist.play();
		saxophonist.toto();
		
		pianist.play();
		pianist.toto();
		
		guitarist.play();
		guitarist.toto();

	}

}
