/**
 * Classe qui représente un livre
 * Elle mémorise des attributs tels que :
 * <ul>
 * <li> le titre </li>
 * <li> le(s) auteur(s) </li>
 * <li> l'éditeur </li>
 * <li> l'année d'édition </li>
 * <li> le résumé </li>
 * <li> le numéro isbn </li>
 * </ul>
 * Le livre est initialisé lors de sa création avec tous ces paramètres. 
 * @author thierrybrouard
 *
 */
public class Livre {

    private String titre;
    private String auteur;
    private String editeur;
    private int annee;
    private String resume;
    private String isbn;
    
    /**
     * Création d'un livre d'après ses attributs
     * @param titre titre du livre
     * @param auteur auteur(s) du livre
     * @param editeur éditeur du livre
     * @param annee année d'édition
     * @param resume résumé du livre
     * @param isbn numéro isbn du livre
     */
    public Livre(String titre, String auteur, String editeur, int annee, String resume, String isbn) {
    	this.titre = titre;
    	this.auteur = auteur;
    	this.editeur = editeur;
    	this.annee = annee;
    	this.resume = resume;
    	this.isbn = isbn;
    }

	/**
	 * affichage simple
	 */
    public void afficherSimple() {
		System.out.print(this.titre + ", (");
		System.out.print(this.editeur + "),");
		System.out.println(this.annee);
		System.out.println("----------------------------------------");

	}

	/**
	 * affichage détaillé
	 */
    public void afficherDetail() {
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