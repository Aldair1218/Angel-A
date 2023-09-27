import java.util.Scanner;

public class p12_1s21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese el valor de 'n': ");
        int n = scanner.nextInt();

        // Calculamos el factorial de n
        long factorial = calcularFactorial(n);

        // Calculamos la sumatoria cúbica de n
        long sumatoriaCubica = calcularSumatoriaCubica(n);

        // Calculamos la división
        double division = (double) sumatoriaCubica / factorial;

        // Mostramos el resultado
        System.out.println("La sumatoria cúbica de " + n + " es: " + sumatoriaCubica);
        System.out.println("El factorial de " + n + " es: " + factorial);
        System.out.println("La división de " + sumatoriaCubica + " / " + factorial + " es: " + division);

        // Cerramos el Scanner
        scanner.close();
    }

    // Método para calcular el factorial de un número
    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    // Método para calcular la sumatoria cúbica
    public static long calcularSumatoriaCubica(int numero) {
        long sumatoriaCubica = 0;
        for (int n = 1; n <= numero; n++) {
            sumatoriaCubica = (n * n * n);
        }
        return sumatoriaCubica;
    }
}
