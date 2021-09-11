package clases;

import java.util.Scanner;

public class Profesor extends Persona{
    String puesto;

    public Profesor(int id, String nombre, String puesto){
        super(id,nombre);
        this.puesto= puesto;
    }

    public Profesor(){this.puesto = "";}

    public String getPuesto(){return puesto;}

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Profesor{" + super.toString()+ ","+
                "puesto='" + puesto + '\'' +
                '}';
    }


    public void capturaDatos(){
        super.capturaDatos();
        Scanner scan = new Scanner(System.in);
        String puesto = scan.nextLine();
        this.setPuesto(puesto);

    }
}
