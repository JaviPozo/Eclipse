package Ejerciciosbasicos;

import java.util.Scanner;

public class Ejerciciosbasico4 {

	public static void main(String[] args) {
		// Le pedimos el radio de la circunferencia
		System.out.print("Cúal es el radio de la circunferencia: ");
		
		// Creamos Scanner para que lea el teclado
	     Scanner sc = new Scanner(System.in);
	     
	     // Leemos el radio
	     int radio = sc.nextInt();
	     
	     // Calculamos la longitud y el área de la circunferencia
	     double longitud = 2*Math.PI* radio;
	     double area = Math.PI*(radio*radio);
	     
	     // Muestro en pantalla el mensaje
	     System.out.println("La longitud es: " + longitud);
	     
	     // Muestro en patalla el mensaje
	     System.out.println("El área es: "  + area);
	     
	     
	     
	     
	    		 

	}

}
