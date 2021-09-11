package principal;
import clases.Profesor;
import java.util.Scanner;
import clases.Persona;

public class principal {
    public static void main(String[] args) {

        Persona mp1 = new Persona(123, "Pablo Marmol");
        Persona mp2 = new Persona(456, "Mario Bros");
        mp2.setId(5);
        System.out.println(mp1);

        //Profesor prof1 = new Profesor(123, "Mario Bros", "Profesor 1");
        Profesor prof1 = new Profesor();
        prof1.capturaDatos();
        System.out.println(prof1);
    }
}
