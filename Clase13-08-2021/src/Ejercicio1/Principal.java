package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static int verificaInt(String valor){
        try {
            int a = Integer.parseInt(valor);
            return a;
        }catch(NumberFormatException nfe){
            return -1;
        }
    }

    public static void main(String[] args) {
        String var1 = "casa";
        String var3 = "casa";
        System.out.println(var1.equals(var3));


        Persona per1;// = null
        per1 = new Persona("Maria Rmirez", 14, 2000);
        Persona per2 = new Persona("Marcos Hernandez", 18, 1995);
        Persona per3 = new Persona("Maria Ramirez", 14, 2000);

        System.out.println(per1.equals(per2));
        System.out.println(per1.toString());
        System.out.println(per2.toString());

        //Uso del wrapper tipo Integer

        List<Integer> lista;

        int i;
        lista = new ArrayList<>();
        lista.add(1);
        lista.add(Integer.valueOf(2));
        lista.add(3);//Autoboxing
        lista.add(4);
        lista.add(5);

        i = lista.get(0);//Unboxing
        System.out.println("Uso de (parametros) expresion lamda -> Implemetancion");
        lista.forEach((n) -> System.out.println(n));
        System.out.println("For Loop");
        for (int contador = 0; contador < lista.size(); contador++) {
            System.out.println(lista.get(contador));
        }
        System.out.println("Advanced For Loop");
        for (Integer num : lista) {
            System.out.println(num);
        }
        System.out.println("Iterador");
        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Scanner capt = new Scanner(System.in);
        String valor;
        while (true) {
            System.out.print("Ingrese un numero\t: ");
            valor = capt.nextLine();
            int valorInt = Principal.verificaInt(valor);
            if (valorInt != -1) {
                break;
            }
        }

        System.out.println("El valor ingresado es:" + Integer.parseInt(valor));

        //Invocacion del recolector de basura

        Runtime.getRuntime().gc();
        //invocacion del recolector de basura #2
        System.gc();

    }
}
