package package10;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double side1, side2, side3;
		System.out.println("Enter a positive value of side 1 :");
		side1 = kb.nextDouble();
		System.out.println("Enter a positive value of side 2 :");
		side2 = kb.nextDouble();
		System.out.println("Enter a positive value of side 3 :");
		side3 = kb.nextDouble();
		System.out.println("Enter a color :");
		String color = kb.next();
		System.out.println("Is the trinagle filled? (true OR false)");
		boolean filled = kb.nextBoolean();
		System.out.println();
		Triangle TriObj = new Triangle(color, filled, side1, side2, side3);
		System.out.println(TriObj);
		kb.close();

	}
}
