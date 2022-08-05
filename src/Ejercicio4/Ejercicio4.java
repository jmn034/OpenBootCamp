package Ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args){
        int numeroIf = 1;
        if(numeroIf == 0) System.out.println("Cero");
        else if(numeroIf > 0) System.out.println("Positivo");
        else System.out.println("Negativo");

        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println("Valor numeroWhile con while: " + numeroWhile);
            numeroWhile++;
        }
        do{
            System.out.println("Valor numeroWhile con do-while: " + numeroWhile);
        }while(numeroWhile <3);

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Valor numeroFor: " + numeroFor);
        }
        int estacion = 0;
        switch(estacion){
            case 0: System.out.println("Invierno");
            break;
            case 1: System.out.println("Primavera");
            break;
            case 2: System.out.println("Verano");
            break;
            case 3: System.out.println("Otoño");
            break;
            default: System.out.println("El valor introducido no coincide con ninguna estacion del año.");
            break;
        }
    }
}
