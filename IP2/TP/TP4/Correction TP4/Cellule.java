public class Cellule {
	private Robot rob;
	private Cellule suivant;
	
	public Cellule(Robot rob, Cellule suivant) {
		this.rob=rob;
		this.suivant=suivant;
	}
	
	public Cellule(Robot rob) {
		this (rob,null);
	}
	
	public Robot get_robot() {
		return this.rob;
	}

	public Cellule get_cellule() {
		return this.suivant;
	}
}

