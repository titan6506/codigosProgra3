package clases;
import java.util.Objects;
import java.util.Scanner;
import java.io.SequenceInputStream;

public class Persona implements Captura{
    private int id;
    private String nombre;

    public Persona(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public Persona(){
        this.id = 0;
        this.nombre = "";
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o; // hacemos una conversion antes de poder almacenar en la nueva referencia
        return getId() == persona.getId() && Objects.equals(getNombre(), persona.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre());
    }

    @Override
    public void capturaDatos(){
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        String nombre = scan.next();
        this.setId(id);
        this.setNombre(nombre);
    }
}
