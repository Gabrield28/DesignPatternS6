

public class ListeLivreSimple extends Livre implements Observer{

	/**
	 * 
	 * @param titre
	 * @param auteur
	 * @param editeur
	 * @param annee
	 * @param resume
	 * @param isbn
	 */
	public ListeLivreSimple(String titre, String auteur, String editeur, int annee, String resume, String isbn) {
		super(titre, auteur, editeur, annee, resume, isbn);
		// TODO Auto-generated constructor stub
	}

	public void afficher() {
		System.out.print(this.titre + ", (");
		System.out.print(this.editeur + "),");
		System.out.println(this.annee);
		System.out.println("----------------------------------------");
	}

	@Override
	public void update(Subject s) {
		// TODO Auto-generated method stub
		
	}
}