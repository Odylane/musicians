package fr.formation.musicians;

public class Application {

	public static void main(String[] args) {
		
		Pianist pianist = new Pianist("Frank");
		pianist.play();
		
		Guitarist guitarist = new Guitarist("John");
		guitarist.play();
		
		Saxophonist saxophonist = new Saxophonist("Daria");
		
		//Ici appel play de Musician
		// A l'execution, m�thode play des classes concr�tes qui est invoqu�e
		//Polymorphisme "dynamique", invocation dynamique
		//Le musicien a la forme Guitarist, Pianist, Saxophonist
		saxophonist.play();

	}

}
