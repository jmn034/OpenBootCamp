package Ejercicio9;

public class Cliente extends Persona{
    private int credito;

    public Cliente(int edad, String nombre, int telefono, int credito){
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public double getCredito(){
        return this.credito;
    }
    public void setCredito(int credito){
        this.credito = credito;
    }

    public String toString(){
        return super.toString() + "Credito: " + this.credito;
    }

}
