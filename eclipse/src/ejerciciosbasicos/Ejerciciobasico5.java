package ejerciciosbasicos;

import java.util.Scanner;

public class Ejerciciobasico5 {

	public static void main(String[] args) {
		// Creamos el Scanner para que lea el teclado
				Scanner sc = new Scanner(System.in);
				
				// Variable donde se guardará la nota de matemáticas y sociales
				float notaDeMatematicas;
			    float notaDeSociales;
			    float media;
				
				// Le pedimos la nota de matematicas y de sociales
				System.out.print("Cual es la nota de matematicas: ");
				notaDeMatematicas = sc.nextFloat();
				
				System.out.print("Cual es la nota de sociales: ");
				notaDeSociales = sc.nextFloat();
				
				media = (notaDeMatematicas + notaDeSociales)/2;
				
				// Se calculara la nota media de ambas asignaturas
				System.out.println("La nota media es: "+ media );
	}
	

}
