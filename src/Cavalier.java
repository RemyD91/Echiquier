
public class Cavalier extends Piece{
    public Cavalier(Couleur color, Position position) {
        super(color, position);
    }

    @Override
    public boolean isPositionPossible(Position position) {
        return true;
    }

    public char getSymbole(){
        return  'C';
    }

    public int getValeur(){
        return 3;
    }
}
