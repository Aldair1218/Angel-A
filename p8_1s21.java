import java.util.Scanner;
public class p8_1s21{
   public static void main(String[] args){
	Scanner teclado = new Scanner (System.in);
	byte edad;
	System.out.println("Ingresa tu edad:");
	edad = teclado.nextByte();

	if(edad >= 18){
		System.out.println("Eres mayor de edad:)");
	}
  }
}