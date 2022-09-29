package Ejerciciosbasicos2;

import java.util.Scanner;

public class Ejerciciobasico1 {

	public static void main(String[] args) {
		final double PRECIO_PERAS = 1.95;
		final double PRECIO_MANZANAS = 2.35;
		
		double KgPeras;
		double KgManzanas;
		double resultado;
		
		// Creamos scanner y la variables
		Scanner sc = new Scanner (System.in);
		
		// Le pedimos al usuario que nos muestre las ventas en (kg) del trimestre para cada fruta
		System.out.print("Introduzca el número de kilos de peras: ");
		KgPeras = sc.nextDouble();
		
		// Le pedimos al usuario que nos muestre las ventas en (kg) del trimestre para cada fruta
		System.out.print("Introduzca el número de kilos de manzanas: ");
		KgManzanas = sc.nextDouble();
		
		// Se calculara el importe de ambas cosas por trimestre
		resultado = (KgManzanas*PRECIO_MANZANAS) + (KgPeras*PRECIO_PERAS);
		
		System.out.println("El importe total será :" + resultado);
	
		
		
		
		
		
		

	}

}
