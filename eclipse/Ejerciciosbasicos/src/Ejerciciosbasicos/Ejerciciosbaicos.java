package Ejerciciosbasicos;

import java.util.Scanner;

public class Ejerciciosbaicos {

	private static Scanner Scannleer;

	public static void main(String[] args) {
		// Le pedimos un número al usuario 
		System.out.print("Introduzca un número: ");
				
	    /* Declaro la variable num donde guardaré el número introducido por el usuario*/
		int num;
		
		Scanner leer = new Scanner(System.in);
		
		//Guardo en num el número introducido por el usuario
		num = leer .nextInt();
		
		// Mostramos el número introducido por consola
		System.out.print("El numero introducido es: " + num);
		
		
		
			
		
	}
}
