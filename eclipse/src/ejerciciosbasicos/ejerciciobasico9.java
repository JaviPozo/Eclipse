package ejerciciosbasicos;

import java.util.Scanner;

public class ejerciciobasico9 {

	public static void main(String[] args) {
		// Creamos un scanner para que lo lea el teclado
		Scanner sc = new Scanner(System.in);
		
		double pesetas;
		double euros;
		
		// Le pedimos al usuario que introduzca el valor en pesetas
		System.out.print("Introduzca el valor en pesetas: ");
		pesetas = sc.nextDouble();
		
		euros = pesetas*0.006;
		
		System.out.println("el valor en euros es: " + euros);

	}

}
