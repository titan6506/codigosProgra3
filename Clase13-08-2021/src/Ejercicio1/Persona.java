package Ejercicio1;

import java.util.Objects;

public class Persona {
    private String nombre;
    private int id;
    private int annioNacimiento;

    public Persona(String nombre, int id, int annioNacimiento){
        this.nombre=nombre;
        this.id=id;
        this.annioNacimiento=annioNacimiento;
    }
   public Persona(){
        this.nombre="";
        this.id=0;
        this.annioNacimiento=1900;
   }

    public String getNombre() {
        return  nombre;
    }

    public int getAnnioNacimiento() {
        return annioNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setAnnioNacimiento(int annioNacimiento) {
        this.annioNacimiento = annioNacimiento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o; //casting
        return getId() == persona.getId() && getAnnioNacimiento() == persona.getAnnioNacimiento() && getNombre().equals(persona.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getId(), getAnnioNacimiento());
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", annioNacimiento=" + annioNacimiento +
                '}';
    }
}
