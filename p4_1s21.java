import java.util.Scanner;
class p4_1s21{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu edad");
        nombre = teclado.nextline();

        Scanner años = new Scanner(System.in);
        String edad;
        System.out.println("ingresa tu edad");
        edad = teclado.nextline();

        Scanner email = new Scanner(System.in);
        String correo;
        System.out.println("Ingresa tu correo");
        correo = teclado.nextline();

        Scanner celular = new Scanner(System.in);
        String telefono;
        System.out.println("Ingresa tu telefono");
        telefono = teclado.nextline();
        
        System.out.println("Bienvenido" + nombre);
        System.out.println("Tu edad es" + edad);
        System.out.println("Tu correo es" + correo);
        System.out.println("Tu numero es" + telefono);
    }
}