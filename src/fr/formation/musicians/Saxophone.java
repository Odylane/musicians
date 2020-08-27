package fr.formation.musicians;

public class Saxophone extends Instrument {

	public Saxophone(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String use() {
		return getName();
		
	}
	
	

}
