package Q1;
public abstract class CApplication {

	// programme principal
	public static void main(String[] args) {
		
		// crée une grille vide
		CGrille9x9 grille = new CGrille9x9();

		// Place des chiffres aléatoirement
		for (int x=1; x<10; x++)
			for (int y=1; y<10;y++)
				grille.set(x,y,(int)(Math.random()*9+1));

		// enregistre format texte
		grille.saveText("grille.txt");

		// engistre format xml
		grille.saveXML("grille.xml");

		
	}

}
