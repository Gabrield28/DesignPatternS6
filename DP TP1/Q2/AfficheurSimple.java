package Q2;

public class AfficheurSimple implements I_Afficheur {

    /**
     * affichage simple
     */
    public void afficher(Livre obj) {
        System.out.print(obj.getTitre() + ", (");
        System.out.print(obj.getEditeur() + "),");
        System.out.println(obj.getAnnee());
        System.out.println("----------------------------------------");
    }

}
