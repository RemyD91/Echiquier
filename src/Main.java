import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Echiquier.getInstance();

        Roi roi = new Roi(Couleur.Blanc, new Position(0,0));
        Echiquier.getInstance().ajouter(roi);
        Reine dame = new Reine (Couleur.Noir, new Position(4,5));
        Echiquier.getInstance().ajouter(dame);
        Cavalier cheval = new Cavalier(Couleur.Blanc, new Position(2,3));
        Echiquier.getInstance().ajouter(cheval);
        Pion pion = new Pion (Couleur.Noir, new Position(5,2));
        Echiquier.getInstance().ajouter(pion);

        Echiquier.getInstance().getPoint(Couleur.Blanc);

        System.out.println(Echiquier.getInstance().getPoint(Couleur.Noir));
        Echiquier.getInstance().afficherEchiquier();
    }
}
