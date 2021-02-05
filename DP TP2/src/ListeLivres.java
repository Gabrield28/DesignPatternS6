import java.util.ArrayList;

public class ListeLivres implements Subject{

	private ArrayList<Livre> liste;

	/**
	 * Création d'une liste de livres.
	 * Les structures mémoire de stockage sont initialisées et vides.
	 */
	public ListeLivres() {

		liste = new ArrayList<Livre>();
	}

	/**
	 * Ajout d'un livre dans la liste.
	 * L'ajout se fait par ordre d'arrivée.  
	 * @param livre objet Livre à ajouter
	 * @see Livre
	 */
	public void addLivre(Livre livre) {
		liste.add(livre);
	}


	/**
	 * Affichage simple de la liste
	 */ 
	public void afficher() {	
		for (Livre livre : liste) {
			livre.afficherSimple();
		}
	}

	@Override
	public void Add(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Remove(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Notify() {
		// TODO Auto-generated method stub
		
	}

}