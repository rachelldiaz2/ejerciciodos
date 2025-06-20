import java.util.Scanner;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[3]; // Cambiar a 20 si se requiere

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1) + ":");
            System.out.print("Nombres: ");
            String nombres = scanner.nextLine();
            System.out.print("Apellidos: ");
            String apellidos = scanner.nextLine();
            System.out.print("Promedio: ");
            double promedio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
            estudiantes[i] = new Estudiante(nombres, apellidos, promedio);
        }

        Estudiante mayor = estudiantes[0];
        Estudiante menor = estudiantes[0];

        for (int i = 1; i < estudiantes.length; i++) {
            if (estudiantes[i].promedio > mayor.promedio) {
                mayor = estudiantes[i];
            }
            if (estudiantes[i].promedio < menor.promedio) {
                menor = estudiantes[i];
            }
        }

        System.out.println("\nEstudiante con el promedio más alto:");
        System.out.println(mayor.nombres + " " + mayor.apellidos + " - Promedio: " + mayor.promedio);

        System.out.println("\nEstudiante con el promedio más bajo:");
        System.out.println(menor.nombres + " " + menor.apellidos + " - Promedio: " + menor.promedio);
    }
}
