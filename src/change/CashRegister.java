package change;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// String currency;

		int tendered = 0;
		int cost = 1;

		System.out.println("\tHello, welcome to Kwik-E-Mart!");
		System.out.println("\t_______________________________");
		do {
			System.out.println();
			System.out.println("Please enter the cost of your item: ");
			System.out.println();
			cost = (int) ((keyboard.nextFloat() * 100F));
			// System.out.println("test cost = " + cost);
			System.out.println("Your total is " + (cost / 100.00F));
			System.out.println("Please pay for your item.");
			tendered = (int) ((keyboard.nextFloat() * 100.00F));

			System.out.println("cash tendered = " + (tendered / 100.00F));
			if (tendered < cost) {
				System.out.println("You tryin to rob me?! I'll call the cops!");
				System.out.println();

			} else if (tendered == cost) {
				System.out.println();
				System.out.println("Thank you. Come again!");
			} else if (tendered > cost) {
				System.out.println();
				System.out.println("I'll make your change.");
				System.out.println();
				System.out.print("Your change is: ");
				System.out.println(change(tendered, cost));
				System.out.println();
				System.out.println("Enter 0 for price and press enter twice to quit.");

			}
		} while (cost != 0);

		keyboard.close();
	}

	public static String change(int tendered, int cost) { // where the magic
															// happens
		int difference = (tendered - cost);
		// System.out.println("test difference initial : " + difference);

		String change = "";
		if ((difference / 2000) == 1) {
			System.out.print(difference / 2000 + " twenty, ");
			difference = (difference - 2000 * (difference / 2000));
		}
		if ((difference / 2000) > 1) {
			// System.out.println("$20: ");
			// System.out.println("difference: " + difference);
			System.out.print(difference / 2000 + " twenties, ");
			difference = (difference - 2000 * (difference / 2000));
			// System.out.println("Remaining Change: " + difference);
		}
		if ((difference / 1000) == 1) {
			System.out.print(difference / 1000 + " ten, ");
			difference = (difference - 1000 * (difference / 1000));
		}
		if ((difference / 1000) > 1) {
			// System.out.println("$10: ");
			// System.out.println("difference: " + difference);
			System.out.print(difference / 1000 + " tens, ");
			difference = (difference - 1000 * (difference / 1000));
			// System.out.println("Remaining Change: " + difference);
		}
		if ((difference / 500) == 1) {
			System.out.print(difference / 500 + " five, ");
			difference = (difference - 500 * (difference / 500));
		}
		if ((difference / 500) > 1) {
			// System.out.println("$5: ");
			// System.out.println("difference: " + difference);
			System.out.print(difference / 500 + " fives, ");
			difference = (difference - 500 * (difference / 500));
			// System.out.println("Remaining Change: " + difference);

		}
		if ((difference / 100) == 1) {
			System.out.print(difference / 100 + " one, ");
			difference = (difference - 100 * (difference / 100));
		}
		if ((difference / 100) > 1) {
			// System.out.println("$1: ");
			// System.out.println("difference: " + difference);
			System.out.print(difference / 100 + " ones, ");
			difference = (difference - 100 * (difference / 100));
			// System.out.println("Remaining Change: " + difference);
		}
		if ((difference / 25) == 1) {
			System.out.print(difference / 25 + " quarter, ");
			difference = (difference - 25 * (difference / 25));
		}
		if ((difference / 25) > 1) {
			// System.out.println("$0.25: ");
			// System.out.println("difference: " + difference);
			System.out.print(difference / 25 + " quarters, ");
			difference = (difference - 25 * (difference / 25));
			// System.out.println("Remaining Change: " + difference);
		}
		if ((difference / 10) == 1) {
			System.out.print(difference / 2000 + " dime, ");
			difference = (difference - 10 * (difference / 10));
		}
		if ((difference / 10) > 1) {
			// System.out.println("$0.10: ");
			// System.out.println("difference: " + difference);
			System.out.print(difference / 10 + " dimes, ");
			difference = (difference - 10 * (difference / 10));
			// System.out.println("Remaining Change: " + difference);
		}
		if ((difference / 5) == 1) {
			System.out.print(difference / 5 + " nickel, ");
			difference = (difference - 5 * (difference / 5));
		}
		if ((difference / 5) > 1) {
			// System.out.println("$0.05: ");
			// System.out.println("difference: " + difference);
			System.out.print(difference / 5 + " nickels, ");
			difference = (difference - 5 * (difference / 5));
			// System.out.println("Remaining Change: " + difference);
		}
		if ((difference / 1) == 1) {
			System.out.print(difference / 1 + " penny. ");
			difference = (difference - 1 * (difference / 1));
		}
		if ((difference / 1) > 1) {
			// System.out.println("$0.01: ");
			// System.out.println("difference: " + difference);
			System.out.print(difference / 1 + " pennies. ");
			difference = (difference - 1 * (difference / 1));
			// System.out.println("Remaining Change: " + difference);
		}

		return change;
	}

}
