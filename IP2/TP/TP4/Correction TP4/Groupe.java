public class Groupe {
	private Cellule chefDeFile;
	
	public Groupe() { //pas obliger de crée un constructeur java initialise  les attributs à null si aucun constructeur n'est créé 
		this.chefDeFile=null;
	}
	
	public void prendreTete(Robot r) {
		if (r.nomCorrect()) {
			Cellule actuelle= new Cellule(r,this.chefDeFile);// ajouter r comme chef de file et créer "un chemin " vers le chef de file précédent
			this.chefDeFile=actuelle;// la cellule où se trouve r le robot est à présent au tt début mais il n'est pas le chef de file donc on fait cette affectation
		}
	}
	
	public void affiche() {//méthode fausse ne pas faire attention
		chefDeFile.get_robot().description();
		Cellule intermediaire=chefDeFile.get_cellule();
		while (intermediaire!=null) {
			intermediaire.get_robot().description();
			intermediaire=intermediaire.get_cellule();
		}
	}
	
}