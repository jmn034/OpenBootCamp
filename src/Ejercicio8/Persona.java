package Ejercicio8;

public class Persona {

    private int edad;
    private String nombre;
    private int telefono;

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

    public static void main(String[] args) {

        Persona persona1 = new Persona();

        persona1.setEdad(25);
        persona1.setNombreEdad("Joaquín");
        persona1.setTelefono(650308299);

        System.out.println("Nombre: " + persona1.getNombre() + "\n" + "Edad: " + persona1.getEdad() + "\n" + "Telefono: " + persona1.getTelefono());
    }
}


