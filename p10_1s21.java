import java.util.Scanner;

public class p10_1s21{
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		Scanner numero= new Scanner(System.in);
		String operacion;
		String temp;
		int num1, num2;
		int resultado;
		double b, e, potencia;
		double n,raiz;

		System.out.println("programa que realiza operaciones basicas");
		System.out.println("que operacion deseas: suma, resta, multiplicacion, division, potencia, raiz cudrada");
		operacion = teclado.nextLine();
		if (operacion.equals("Suma")){
			System.out.println("aqui debemos realizar una suma");
			System.out.println("ingresa primer numero");
			temp = teclado.nextLine();
			num1 = Integer.parseInt(temp);
			System.out.println("ingresa un segundo numero");
			temp = teclado.nextLine();
			num2 = Integer.parseInt(temp);
			resultado = num1 + num2;
			System.out.println("la suma es: "+resultado);

		} else if (operacion.equals("resta")){
			System.out.println("aqui debemos realizar una resta");
			        System.out.println("ingresa primer numero");
			temp = teclado.nextLine();
			num1 = Integer.parseInt(temp);
			System.out.println("ingresa segundo numero");
			temp = teclado.nextLine();
			num2 = Integer.parseInt(temp);
			resultado = num1 - num2;
			System.out.println("la resta es: " + resultado);


        } else if (operacion.equals("multiplicacion")){
        	System.out.println("aqui vamos a realizar una multiplicacion");
        	        System.out.println("ingresa primer numero");
        	temp = teclado.nextLine();
        	num1 = Integer.parseInt(temp);
        	System.out.println("ingresa segundo numero");
        	temp = teclado.nextLine();
        	num2 = Integer.parseInt(temp);
        	resultado = num1 * num2;
        	System.out.println("el resultado es: " + resultado);


        } else if (operacion.equals("division")){
        	System.out.println("aqui vamos a realizar una division");
        	        System.out.println("ingresa primer numero");
        	temp = teclado.nextLine();
        	num1 = Integer.parseInt(temp);
        	System.out.println("ingresa segundo numero");
        	temp = teclado.nextLine();
        	num2 = Integer.parseInt(temp);
        	resultado = num1 / num2;
        	System.out.println("el resultado es: " + resultado);


        } else if (operacion.equals("potencia")){
        	System.out.println("aplicacion de potencia");
        	System.out.println("ingrese el valor de la base");
        	b = numero.nextInt();
        	System.out.println("ingresa el valor del exponente");
        	e = numero.nextInt();
        	potencia= Math.pow(b,e);
        	System.out.println(" El resultado es");
        	System.out.println(potencia);
        

        } else if (operacion.equals("raiz cuadrada")){
        	System.out.println("Aplicacion raiz");
        	System.out.println("Ingrese un numero para obtener su raiz cuadrada");
        	n= numero.nextDouble();
        	raiz=Math.sqrt(n);
        	System.out.println("El resultado es");
        	System.out.println(raiz);

        }
    }
}

