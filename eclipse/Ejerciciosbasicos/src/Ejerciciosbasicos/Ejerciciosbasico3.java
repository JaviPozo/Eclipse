package Ejerciciosbasicos;

import java.util.Scanner;

public class Ejerciciosbasico3 {

	public static void main(String[] args) {
		// Le pedimos a la aplicación el año actual
		System.out.print("Cual es el año actual: ");
		
		// Variable donde se guardará el año actual
		int año;
		
		// Creamos Scanner para que lea el teclado
		Scanner leerAño = new Scanner(System.in);
		
		// Leemos el año
		año = leerAño.nextInt();
		
		// Le pedimos el año de nacimiento al usuario
		System.out.print("Cual es tu fecha de nacimiento: ");
		
		// Variable donde se guardará la fecha de nacimiento
		int fecha;
		fecha = leerAño.nextInt();
		
		// Muestro en pantalla el mensaje
		System.out.println("Usted tiene " + (año-fecha) + " años");
		
		
		
		
		
		

	}

}
