
public class Reine extends Piece{

    public Reine(Couleur color, Position position) {
        super(color, position);
    }

    @Override
    public boolean isPositionPossible(Position position) {
        return true;
    }

    public char getSymbole(){
        return  'D';
    }

    public int getValeur(){
        return 9;
    }

}
