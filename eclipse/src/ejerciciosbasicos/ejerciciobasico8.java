package ejerciciosbasicos;

import java.util.Scanner;

public class ejerciciobasico8 {

	public static void main(String[] args) {
		// Creamos un  scanner para que lea el teclado
		Scanner sc = new Scanner(System.in);
		String nombre;
		int edad;
		
		// Le pedimos al usuario su nombre y su edad
		System.out.print("Cual es tu nombre: " );
		nombre = sc.nextLine();
		
		System.out.print("Cual es tu edad: ");
		edad = sc.nextInt();
		
		System.out.println("Hola " + nombre + ", tienes" + edad + "¡qué mayor eres!");
		
	}

}
