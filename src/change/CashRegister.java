package change;

import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String currency;
		float tendered = 0;
		float change = 0; 

// include a statement somewhere that says no bills larger than $20, maybe
		
		System.out.println("Hello, welcome to Quick-E-Mart.");
		System.out.println("Please tell me how much your item costs. ");
		System.out.println();
		float item1 = keyboard.nextFloat();

		System.out.println("Your total is " + item1);
		System.out.println("Please pay for your item.");
		tendered(keyboard);

		if (tendered < item1) {
			System.out.println("You tryin to rob me, bro?!");
			System.out.println("Please provide enough money to at least cover the cost.");
			tendered(keyboard);
		} else if (tendered == item1) {
			System.out.println("Thank you. Come again!");
		} else if (tendered > item1) {
			System.out.println("I'll make your change. ");
			//change = change();
		}
 // intend to use a series of if statements with % to determine what amounts I need to distribute. 
		// eg, if (tendered % 5)
		// return some amount of 5 dollar bills, etc
	}

	public static float tendered(Scanner keyboard) {
		return keyboard.nextFloat();
	}

//	//public static float change() {
//		// I'll need to take what they gave me as a decimal and then convert it
//		// to currency and amounts of said currency
//		return change;
//	}
}
