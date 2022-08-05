package Ejercicio9;


public class Ejercicio9 {

    public static void main(String[] args){
        Cliente cliente1 = new Cliente(25, "Joaquin", 650308299, 5000);

        System.out.println("------- Cliente -------");
        System.out.println(cliente1.toString() + "\n");
        System.out.println("------- Trabajador -------");
        Trabajador trabajador1 = new Trabajador(25, "Joaquin", 650308299, 18000);
        System.out.println(trabajador1.toString());

    }

}
