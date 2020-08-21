package fr.formation.musicians;

public class Application {

	public static void main(String[] args) {
		
		Pianist pianist = new Pianist("Frank");
		pianist.play();
		
		Guitarist guitarist = new Guitarist("John");
		guitarist.play();
		
		Saxophonist saxophonist = new Saxophonist("Daria");
		
		//Ici appel play de Musician
		// A l'execution, méthode play des classes concrètes qui est invoquée
		//Polymorphisme "dynamique", invocation dynamique
		//Le musicien a la forme Guitarist, Pianist, Saxophonist
		saxophonist.play();

	}

}
