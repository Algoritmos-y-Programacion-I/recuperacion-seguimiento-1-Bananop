import java.util.Scanner;

public class recuperatorio.java {

    /**
     * Punto 1: Cuenta cuántos parámetros son iguales. (cabe recalcar que estos ejerciosos me ayudo y enseño un amigo de la valle que estudia ingieneria de sistemas)
     */
    public static int contarIguales(int a, int b, int c) {
        if (a == b && b == c) {
            return 3;
        } else if (a == b || a == c || b == c) {
            return 2;
        } else {
            return 0;
        }
    }

    /**
     * Punto 2: Devuelve un mensaje de saludo o despedida según el número ingresado. (profe aqui no esoty segura de si esta bien, porfa revise y digame si encuentra algo)
     */
    public static String saludoDespedida(String nombre, int opcion) {
        if (opcion == 1) {
            return "Hola " + nombre;
        } else if (opcion == 0) {
            return "Chao " + nombre;
        } else {
            return "Error entradas inválidas";
        }
    }

    /**
     * Punto 3: Cuenta cuántos parámetros tienen 4 o más caracteres.
     */
    public static int contarPalabrasLargas(String str1, String str2, String str3) {
        int contador = 0;
        if (str1.length() >= 4) contador++;
        if (str2.length() >= 4) contador++;
        if (str3.length() >= 4) contador++;
        return contador;
    }

    /**
     * Punto 4: Compara la posición 2 de dos cadenas.
     */
    public static boolean compararPosicion2(String str1, String str2) {
        if (str1.length() < 3 || str2.length() < 3) {
            System.out.println("Error: las cadenas deben tener al menos 3 caracteres.");
            return false;
        }
        return str1.charAt(2) == str2.charAt(2);
    }

    /**
     * Punto 5: Calcula la raíz cuadrada sin usar Math.
     */
    public static double calcularRaizCuadrada(double numero) {
        if (numero < 0) {
            System.out.println("Error: No se puede calcular la raíz de un número negativo.");
            return -1;
        }
        double estimacion = numero / 2;
        double precision = 0.0001;

        while ((estimacion * estimacion - numero) > precision || (numero - estimacion * estimacion) > precision) {
            estimacion = (estimacion + numero / estimacion) / 2;
        }
        return estimacion;
    }

    /**
     * Punto 5: Calcula las raíces de una ecuación cuadrática ax^2 + bx + c = 0
     */
    public static void resolverEcuacionCuadratica(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;

        if (discriminante < 0) {
            System.out.println("No hay soluciones reales.");
            return;
        }

        double raizDiscriminante = calcularRaizCuadrada(discriminante);
        double x1 = (-b + raizDiscriminante) / (2 * a);
        double x2 = (-b - raizDiscriminante) / (2 * a);

        System.out.println("Las raíces son: x1 = " + x1 + " y x2 = " + x2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1
        System.out.println("Ejercicio 1: Contar parámetros iguales.");
        System.out.print("Ingrese tres números enteros: ");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt(), num3 = scanner.nextInt();
        System.out.println("Cantidad de números iguales: " + contarIguales(num1, num2, num3));

        // Ejercicio 2
        System.out.println("\nEjercicio 2: Saludo o despedida.");
        System.out.print("Ingrese su nombre: ");
        scanner.nextLine();  // Consumir la línea pendiente
        String nombre = scanner.nextLine();
        System.out.print("Ingrese 1 para saludo o 0 para despedida: ");
        int opcion = scanner.nextInt();
        System.out.println(saludoDespedida(nombre, opcion));

        // Ejercicio 3
        System.out.println("\nEjercicio 3: Contar palabras con 4 o más caracteres.");
        System.out.print("Ingrese tres palabras: ");
        scanner.nextLine();  // Consumir la línea pendiente
        String palabra1 = scanner.next(), palabra2 = scanner.next(), palabra3 = scanner.next();
        System.out.println("Cantidad de palabras largas: " + contarPalabrasLargas(palabra1, palabra2, palabra3));

        // Ejercicio 4
        System.out.println("\nEjercicio 4: Comparar el tercer carácter de dos palabras.");
        System.out.print("Ingrese dos palabras: ");
        String palabraA = scanner.next(), palabraB = scanner.next();
        System.out.println("¿Los caracteres en la posición 2 son iguales?: " + compararPosicion2(palabraA, palabraB));

        // Ejercicio 5
        System.out.println("\nEjercicio 5: Resolver ecuación cuadrática.");
        System.out.print("Ingrese los coeficientes a, b y c: ");
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
        resolverEcuacionCuadratica(a, b, c);

        scanner.close();
    }
}