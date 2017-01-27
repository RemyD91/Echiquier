
public enum Couleur {

    Noir ("noir"),
    Blanc ("blanc");

    private String color = "";

    Couleur (String couleur){
        this.color = couleur;
    }

    public String getColor() {
        return color;
    }
}
