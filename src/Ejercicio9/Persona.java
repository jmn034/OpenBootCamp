package Ejercicio9;

public class Persona {

    private int edad;
    private String nombre;
    private int telefono;

    public Persona(int edad, String nombre, int telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombreEdad(String nombre){
        this.nombre = nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public String toString(){
        return "Nombre: " + this.nombre + "\n" + "Edad: " + this.edad + "\n" + "Telefono: " + this.telefono + "\n";
    }
}
