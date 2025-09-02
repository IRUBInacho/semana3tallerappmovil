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

        int pasajeros = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Capacidad en pasajeros: ");
            try {
                pasajeros = Integer.parseInt(input.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("❌ ERROR: Debe ingresar un número entero. Intente nuevamente.");
            }
        }

        System.out.println("\n✅ Datos ingresados:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Tipo de combustible: " + combustible);
        System.out.println("Capacidad en pasajeros: " + pasajeros);
    }
}