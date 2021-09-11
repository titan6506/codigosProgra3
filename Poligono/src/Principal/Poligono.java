package Principal;

public abstract  class Poligono {

private int lado1;
private int lado2;

public abstract int area();
public abstract int perimetro();

public Poligono(int lado1, int lado2){
    this.lado1=lado1;
    this.lado2=lado2;
}

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                '}';
    }
}
