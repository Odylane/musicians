package fr.formation.musicians;

public class Guitar extends Instrument {

	public Guitar(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String use() {
		return getName();
		
	}
	
	

}
