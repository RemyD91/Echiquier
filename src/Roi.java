
public class Roi extends Piece {

    public Roi(Couleur color, Position position) {
        super(color, position);
    }

    @Override
    public boolean isPositionPossible(Position position) {
        return true;
    }

    public char getSymbole(){
        return  'R';
    }

    public int getValeur(){
        return 20;
    }


}
