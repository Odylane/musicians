package fr.formation.musicians;

public class Application {

	public static void main(String[] args) {
		//variable pianist de type Musician
		Musician pianist = new Pianist("Frank");
				
		Musician guitarist = new Guitarist("John");
				
		Musician saxophonist = new Saxophonist("Daria");
		
		//Ici appel play de Musician
		// A l'execution, méthode play des classes concrètes qui est invoquée
		//Polymorphisme "dynamique", invocation dynamique, (=polymorphisme par héritage=
		//Le musicien a plusieurs formes (la forme Guitarist, Pianist, et Saxophonist)
		saxophonist.play();
		pianist.play();
		guitarist.play();

	}

}
