package model;

public class Cor {

    private final int red;
    private final int green;
    private final int blue;
    private final int altura;

    public Cor(int red, int green, int blue, int altura) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.altura = altura;
    }

    public boolean isSame(int red, int green, int blue) {

        if (this.red == red && this.green == green && this.blue == blue) {
            return true;
        }

        return false;

    }

    public int getAltura() {
        return altura;
    }
    
    
    

}
