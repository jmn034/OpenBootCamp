package Ejercicio3;

public class Ejercicio3 {

    public static int sumar(int numero1, int numero2, int numero3){
        return numero1 + numero2 + numero3;
    }
    public static class Coche{
        private int numeroPuertas;
        public Coche(int numeroPuertas){
            this.numeroPuertas = numeroPuertas;
        }

        public int getNumeroPuertas() {
            return numeroPuertas;
        }

        public void setNumeroPuertas(int numeroPuertas) {
            this.numeroPuertas = numeroPuertas;
        }

        public void incrementarPuertas(){
            this.numeroPuertas++;
        }
    }
    public static void main(String[] args){
        int resultado = sumar(10, 5, 15);

        System.out.println("-----Primera parte -----");
        System.out.println(resultado + "\n");
        Coche miCoche = new Coche(5);
        miCoche.incrementarPuertas();
        System.out.println("-----Segunda parte -----");
        System.out.println(miCoche.numeroPuertas);
        }
}
