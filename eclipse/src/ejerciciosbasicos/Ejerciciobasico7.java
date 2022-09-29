package ejerciciosbasicos;

import java.util.Scanner;

public class Ejerciciobasico7 {

	public static void main(String[] args) {
		// Creamos un scanner para que lea el teclado
		Scanner sc = new Scanner (System.in);
		
		// Creamos las variables donde se guardaran los datos
		String nombre;
		String direccion;
		int telefono;
		
		
		// Le pedimos al usuario que ponga su nombre
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		
		// Le pedimos al usuario que ponga su direccion
		System.out.print("Direccion: ");
		direccion = sc.nextLine();
		
		// Le pedimos al usuario que ponga su telefono
		System.out.print("Telefono: ");
		telefono = sc.nextInt();
		
		System.out.println("Nombre: " + nombre + "\ndireccion: " + direccion + "\ntelefono: " + telefono );
		}

}
