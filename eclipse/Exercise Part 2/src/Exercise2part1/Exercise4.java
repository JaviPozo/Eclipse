package Exercise2part1;

public class Exercise4 {

	public static void main(String[] args) {
		// declare variables
		int x, y, aux;
		// enter values
		System.out.print("Enter value for x ");
		Object keyboard;
		x = keyboard.nextInt();
		System.out.print("Enter value for y ");
		y = keyboard.nextInt();
		// code attempting to swap two variables
		aux = x;
		x = y;
		y = aux;
		//display results
		System.out.println("x = " + x);
		System.out.println("y = " + y);


	}

}
