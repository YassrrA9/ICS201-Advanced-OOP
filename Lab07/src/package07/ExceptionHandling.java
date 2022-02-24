package package07;

import java.util.*;

public class ExceptionHandling {
	public static void main(String[] args) {

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner kb = new Scanner(System.in);
		boolean checking = true;
		int number;

		do {

			try {
				System.out.println("Enter an integer FROM 1 TO 12 :");
				number = kb.nextInt();
				System.out.println("The month is " + months[number - 1] + " Number of days = " + dom[number - 1]);

				checking = true;

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Wrong number");
				kb.nextLine();
				System.out.println();
				checking = false;
			} catch (InputMismatchException x) {
				System.out.println("Your input is not an intger !");
				kb.nextLine();
				System.out.println();
				checking = false;
			}

		} while (!checking);

		kb.close();

	}
}
