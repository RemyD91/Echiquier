import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Echiquier echiquier = new Echiquier();
        Roi roi = new Roi(Couleur.Blanc, new Position(0,0));
        echiquier.ajouter(roi);
        Reine dame = new Reine (Couleur.Noir, new Position(4,5));
        echiquier.ajouter(dame);
        Cavalier cheval = new Cavalier(Couleur.Blanc, new Position(2,3));
        echiquier.ajouter(cheval);
        Pion pion = new Pion (Couleur.Noir, new Position(5,2));
        echiquier.ajouter(pion);

        echiquier.getPoint(Couleur.Blanc);

        System.out.println(echiquier.getPoint(Couleur.Noir));
        echiquier.afficherEchiquier();
    }
}
