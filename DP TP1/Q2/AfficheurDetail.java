package Q2;

public class AfficheurDetail implements I_Afficheur {

    @Override
    /**
     * affichage détaillé
     */
    public void afficher(Livre obj) {
            System.out.println("Titre     : " + obj.getTitre());
            System.out.println("Auteur(s) : " + obj.getAuteur());
            System.out.println("Annee     : " + obj.getAnnee());
            System.out.println("Editeur   : " + obj.getEditeur());
            System.out.println("ISBN      : " + obj.getIsbn());
            System.out.println("Résumé    : ");
            System.out.println(	obj.getResume());
            System.out.println("----------------------------------------");

    }

}
