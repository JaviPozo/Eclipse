package Ejerciciosbasicos2;

import java.util.Scanner;

public class Ejerciciobasico3 {

	public static void main(String[] args) {
		// Creamos las variables para almacenar los datos
		int numero;
		boolean numeroPar;
		
		// Creamos un Scanner para que lea el teclado
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		numero = sc.nextInt();
		
		numeroPar = numero %2 == 0;
		System.out.println("El numero elegido es par: " + numeroPar);
		sc.close();

	}

}
