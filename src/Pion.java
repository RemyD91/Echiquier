
public class Pion extends Piece {
    public Pion(Couleur color, Position position) {
        super(color, position);
    }

    @Override
    public boolean isPositionPossible(Position position) {
        return true;
    }

    public char getSymbole(){
        return  'P';
    }

    public int getValeur(){
        return 1;
    }
}
