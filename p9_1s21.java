import java.util.Scanner;

public class p9_1s21{
	/**
	 * @param args
	 */
	public static void main(String[] args){
		try (Scanner teclado = new Scanner(System.in)) {
			String operacion;
			System.out.println("Que tipo de operacion desea realizar");
			System.out.println("escribala: Suma, Resta, Multiplicacion, Division");
			operacion = teclado.nextLine();

			if (operacion.equals("Suma")){
				System.out.println("Haremos una Suma");
			} else if (operacion.equals("Resta")){
			    System.out.println("Haremos una Resta");
			} else if (operacion.equals("Multiplicacion")){
				System.out.println("Haremos una Multiplicacion");
			} else if (operacion.equals("Division")){
			    System.out.println("Haremos una Division");
			} else {
			  	System.out.println("No existe la operacion");

			}
  }
		}
	}
