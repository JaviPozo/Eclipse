package Ejerciciosbasicos2;

import java.util.Scanner;

public class Ejerciciobasico2 {

	public static void main(String[] args) {
		
		int edad;
		boolean mayorEdad;
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Introduzca su edad: ");
		edad = sc.nextInt();
		
		mayorEdad = edad >= 18;
		System.out.println("Usted es mayor de eda: " + mayorEdad);
		sc.close();
		
		

	}

}
