package fr.formation.musicians;

public class Piano extends Instrument {

	public Piano(String name) {
		super(name);
		
	}

	@Override
	// on veut retourner le nom de l'instrument dans la console
	public String use() {
		return getName();
		
	}
	
}
