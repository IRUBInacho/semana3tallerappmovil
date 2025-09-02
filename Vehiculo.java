import java.util.Scanner;

public class Vehiculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Marca: ");
        String marca = input.nextLine();

        System.out.print("Modelo: ");
        String modelo = input.nextLine();

        System.out.print("Cilindrada: ");
        String cilindrada = input.nextLine();

        System.out.print("Tipo de Combustible: ");
        String combustible = input.nextLine();

        System.out.print("Capacidad en pasajeros: ");
        int pasajeros = input.nextInt();

        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + pasajeros + " pasajeros.");
    }
}

