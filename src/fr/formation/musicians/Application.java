package fr.formation.musicians;

public class Application {

	public static void main(String[] args) {
		//variable pianist de type Musician
		Musician pianist = new Pianist("Frank");
				
		Musician guitarist = new Guitarist("John");
				
		Musician saxophonist = new Saxophonist("Daria");
		
		//Ici appel play de Musician
		// A l'execution, m�thode play des classes concr�tes qui est invoqu�e
		//Polymorphisme "dynamique", invocation dynamique, (=polymorphisme par h�ritage=
		//Le musicien a plusieurs formes (la forme Guitarist, Pianist, et Saxophonist)
		saxophonist.play();
		pianist.play();
		guitarist.play();

	}

}
