
import java.util.*;

public class User {

    /**
     * méthode principale faisant la démonstration du moteur de recherche
     * @param args arguments de la ligne de commande
     */
	public static void main(String[] args) {

        SearchEngine engine = new SearchEngine();
        ListeLivres liste = engine.getResult();
        
        // affichage simple 
        liste.afficher();

    }

}