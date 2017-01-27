import java.util.ArrayList;

public class Echiquier {

    private ArrayList<Piece> liste;

    public Echiquier() {

        this.liste = new ArrayList<>();
    }

    public void ajouter(Piece varPiece) {
        liste.add(varPiece);
    }

    public Piece getPiece(Position varPosition){
        for (Piece piece: liste) {
            if (varPosition.equals(piece.getPosition()))
                return piece;
        }

        return null;
    }

    public int getPoint(Couleur color){
        int point =0;
        for (Piece piece: liste) {
            if (color.getColor().equals(piece.getColor().getColor())) {
                point += piece.getValeur();
            }
        }
        return point;
    }

    public void afficherEchiquier(){
        System.out.println("    | A | B | C | D | E | F | G | H |");
        System.out.println(" ------------------------------------");
        for (int i =0; i<=7;i++) {
            System.out.println("  " + i + " |   |   |   |   |   |   |   |   |");
            System.out.println(" ------------------------------------");
        }
        System.out.println("    | A | B | C | D | E | F | G | H |");
    }


}
