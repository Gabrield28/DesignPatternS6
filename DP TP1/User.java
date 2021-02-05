
import java.util.*;

public class User {

    /**
     * méthode principale faisant la démonstration du moteur de recherche
     * @param args arguments de la ligne de commande
     */
	public static void main(String[] args) {

        // le moteur est un fake, pour les besoins de la démo, il met à disposition,
        // en dur, les résultats. 
        SearchEngine engine = new SearchEngine();
        ListeLivres liste = engine.getResult();
        
        // affichage simple 
        liste.afficher();

    }

}