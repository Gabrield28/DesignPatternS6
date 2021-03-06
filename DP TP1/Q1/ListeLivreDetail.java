package Q1;

public class ListeLivreDetail extends Livre {

	/**
	 * 
	 * @param titre
	 * @param auteur
	 * @param editeur
	 * @param annee
	 * @param resume
	 * @param isbn
	 */
	public ListeLivreDetail(String titre, String auteur, String editeur, int annee, String resume, String isbn) {
		super(titre, auteur, editeur, annee, resume, isbn);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Affiche en détail
	 */
    public void afficher() {
		System.out.println("Titre     : " + this.titre);
		System.out.println("Auteur(s) : " + this.auteur);
		System.out.println("Annee     : " + this.annee);
		System.out.println("Editeur   : " + this.editeur);
		System.out.println("ISBN      : " + this.isbn);
		System.out.println("Résumé    : "); 
		System.out.println(	this.resume);
		System.out.println("----------------------------------------");

	}
}
