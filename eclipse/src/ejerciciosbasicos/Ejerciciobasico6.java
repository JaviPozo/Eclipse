package ejerciciosbasicos;

import java.util.Scanner;

public class Ejerciciobasico6 {

	public static void main(String[] args) {
		// Creamos el Scanner para que lea el teclado
		Scanner sc = new Scanner (System.in);
		
		// Creamos una variable donde se guardaran los numeros
		double primerNumero ;
		double segundoNumero;
				
		// Le pedimos al ususario
		System.out.print("Escribe el primer numero: ");
		primerNumero = sc.nextDouble();
		
		System.out.print("Escriba el segundo numero ");
		segundoNumero = sc.nextDouble();
		
		// Se calculara la suma de los dos numeros
		System.out.println("La suma de los dos numeros sera: " + (primerNumero+segundoNumero));
		
		// Se calculara la resta de los dos numeros
		System.out.println("La resta de los dos numeros será "+ (primerNumero-segundoNumero));
		
		// Se calculara la multiplicacion de los dos numeros
	    System.out.println("La multiplicacion de los dos numeros será "+ (primerNumero*segundoNumero));
	    
	    // Se calculara la division de los dos numeros
	    System.out.println("La division de los dos numeros será "+ (primerNumero/segundoNumero));
	    

	}

}
