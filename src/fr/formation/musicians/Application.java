package fr.formation.musicians;

public class Application {

	public static void main(String[] args) {
		
		Pianist pianist = new Pianist("Frank");
		pianist.play();
		
		Guitarist guitarist = new Guitarist("John");
		guitarist.play();
		
		Saxophonist saxophonist = new Saxophonist("Daria");
		saxophonist.play();

	}

}
