package ejerciciosbasicos;

import java.util.Scanner;

public class ejerciciobasico10 {

	public static void main(String[] args) {
		// Creamos scanner para que lo pueda leer el teclado
		Scanner sc = new Scanner(System.in);
		
		final double IVA = 21;
		double precio;
		double precio_final;
		
		System.out.print("Introduce el precio del producto: ");
		precio = sc.nextDouble();
		
		precio_final = precio* (IVA/100) + precio;
		System.out.println("El precio final con IVA es: " + precio_final);
		
		
		
		
		

	}

}
