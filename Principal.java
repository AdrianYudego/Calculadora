import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Introduce dos números:");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            Oeracion operacion = new Oeracion(a, b);

            System.out.println("¿Qué operación quieres realizar?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + operacion.suma());
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + operacion.resta());
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es: " + operacion.multiplicacion());
                    break;
                case 4:
                    
                        System.out.println("El resultado de la división es: " + operacion.division());
                   
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

        scanner.close();
    }
}
