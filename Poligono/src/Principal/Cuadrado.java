package Principal;

public class Cuadrado extends Poligono{

    @Override
    public int area() {
        return getLado1() * getLado2();
    }

    @Override
    public int perimetro() {
        return 2*(getLado2() * getLado2());
    }

    public Cuadrado(int lado1 ){
        super(lado1, lado1);
    }
}
