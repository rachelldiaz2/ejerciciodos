import java.util.Scanner;

public class PreciosProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear arreglos para nombres y precios
        String[] nombres = new String[15];
        double[] precios = new double[15];

        // Solicitar datos al usuario
        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
        }

        // Mostrar todos los productos y precios
        System.out.println("\nLista de productos y sus precios:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Producto " + (i + 1) + ": " + nombres[i] + " - $" + precios[i]);
        }

        scanner.close();
    }
}