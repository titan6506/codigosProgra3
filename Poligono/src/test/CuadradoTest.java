package test;
import org.junit.jupiter.api.*;
import Principal.Cuadrado;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class CuadradoTest {

    Cuadrado miCuadrado;

    @BeforeAll
    public void setupAll(){
        System.out.println("Ejecuta una vez al inicio");
    }

    @org.junit.jupiter.api.BeforeEach
    void setup(){
        miCuadrado = new Cuadrado(10);
    }

    @Test
    void test(){
    System.out.println(miCuadrado.toString());
    }

    @Test
    @DisplayName("Pruebas directas con el cuadrado")
    void pruebaCuadrado(){
        Assertions.assertFalse(5*10 == miCuadrado.area());
        Assertions.assertEquals(2*(10+10), miCuadrado.perimetro());
        System.out.println("Prueba de cuadrado");
    }

    @org.junit.jupiter.api.AfterEach
    void teardown(){
        System.out.println("Ejecuta despues de cada prueba");
    }

    @AfterAll
    public void tearDownAll(){
        System.out.println("Ejecuta al final de todo");
    }
}
