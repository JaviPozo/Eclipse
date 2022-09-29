package Ejerciciosbasicos2;

import java.util.Scanner;

public class Ejerciciobasico5 {

	public static void main(String[] args) {
		// Variables para almacenar las notas de los tres trimestres
		int notaPrimerT, notaSegundoT, notaTercerT;
		int notaBoletin;
		double notaMedia;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la nota del Primer Trimestre: ");
		notaPrimerT = sc.nextInt();
		
		System.out.println("Introduzca la nota del Segundo Trimestre: ");
		notaSegundoT = sc.nextInt();
		
		System.out.println("Introduzca la nota del Tercer Trimestre: ");
		notaTercerT = sc.nextInt();
		notaBoletin = (notaPrimerT + notaSegundoT + notaSegundoT);
		System.out.println("La nota del boletin es :" + notaBoletin);
		
		notaMedia = (double) (notaPrimerT + notaSegundoT + notaSegundoT / 3);
		
		System.out.println("La nota del boletin es: " + (int) notaMedia);
		System.out.println("La nota del expediente es: " + (int) notaMedia);
		
		// Cerramos scanner
		sc.close();

	}

}
