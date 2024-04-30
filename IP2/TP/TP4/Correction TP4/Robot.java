public class Robot {
		private final char nom;//lettre entre ’a’ et ’z’
		private int energie;
		private final String texte; //ce qu’il doit dire
		private static String alphabet="abcdefghijklmnopqrstuvwxyz";
		
		public Robot(char nom, String paroles){
		this.nom = nom;
		// on donne une énergie entre 10 et 20
		energie = 10 + (int)(Math.random() * 11);
		texte = paroles;
		}
		
		public String description() {
			return "Robot "+this.nom+" dit "+this.texte+"quand il parle et a "+this.energie+" points d'énergie";
		}
		
		public boolean nomCorrect() {
			for (int i=0;i<alphabet.length();i++){
				if (this.nom==alphabet.charAt(i)) {
					return true;}}
			return false;
			}
		
		public char get_nom() {
			return this.nom;
		}
		
		public int get_enerie() {
			return this.energie;
		}
		
		public String get_texte() {
			return this.texte;
		}

}
