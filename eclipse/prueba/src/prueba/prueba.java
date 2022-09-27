package prueba;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		final int IVA = 21;
		double precioIntroducido;
		double precioConIVA;
		Scanner lectura = new Scanner (System.in);
		
	    //bloque de instrucciones
		// Solicitamos al usuario el precio
		System.out.print("Introduzca el precio ");
	    precioIntroducido = lectura.nextDouble();
		
		
		// Calculamos el precio con IVA
		precioConIVA = (precioIntroducido * IVA/100) + precioIntroducido;
				
		// Mostramos el resultado en pantalla
		System.out.println("El precio con IVA es: " + precioConIVA);
		
	}

}
