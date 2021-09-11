import java.util.*;

public class Robusto {

        public static void main(String[] args) {
            double x = 0;
            double y = 0;
            double z = 0;
            Scanner S = new Scanner(System.in);
            while (x == 0) {
                try {
                    System.out.println("Introduzca el valor 1");
                    x = S.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Error: no se reconoce como un numero, ingrese el numero 1");
                    S.nextLine();
                }
            }
            System.out.println("Introduzca el valor 2");
            y = S.nextInt();
            System.out.println("Introduzca el valor 3");
            z = S.nextInt();

            while (y == 0) {
                try {
                    System.out.println("Introduzca el valor 1");
                    x = S.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Error: no se reconoce como un numero, ingrese el numero 1");
                    S.nextLine();
                }
            }
            while (z == 0) {
                try {
                    System.out.println("Introduzca el valor 1");
                    x = S.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Error: no se reconoce como un numero, ingrese el numero 1");
                    S.nextLine();
                }
            }

            double valorMax = x;
            if (y > valorMax) {
                valorMax = y;
            }
            if (z > valorMax) {
                valorMax = z;
            }
            System.out.println("De los 3 el valor maximo es " + valorMax);
            //Ahora reutilizando la funcion de comparacion propia de Math.max
            System.out.println("De los 3 el valor maximo es:" + Math.max(x, Math.max(y, z)));
        }
}
