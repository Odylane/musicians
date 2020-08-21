package fr.formation.musicians;

public abstract class Musician {
	
	private String name;

	public Musician(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void play();
	

}
