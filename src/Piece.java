import javafx.geometry.Pos;

public abstract class Piece {

    protected Couleur color;
    protected Position position;

    public Piece(Couleur color, Position position) {
        this.color = color;
        this.position = position;
    }

    public abstract boolean isPositionPossible(Position position);

    public abstract int getValeur();

    public abstract char getSymbole();

    public void deplacement() {

    }

    public Couleur getColor() {
        return color;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "color=" + color +
                ", position=" + position +
                ", symbole=" + getSymbole() +
                ", valeur=" + getValeur() +
                '}';
    }
}


