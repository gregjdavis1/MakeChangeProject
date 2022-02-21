package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		double itemPrice = 0.00;
		double tendered = 0.00;
		double change = 0.00;

		int hundreds = 0;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;

		System.out.println("Welcome to the Make Change app! ");
		System.out.println("");

		System.out.println("Please enter the cost of the item: ");
		itemPrice = kb.nextDouble();

		System.out.println("Please enter how much money was tendered by the customer:");
		tendered = kb.nextDouble();

		change = (itemPrice - tendered);

		double changeRounded = Math.round(change * 100) / 100.0;
		

		System.out.println("Item Price: $" + itemPrice + "Amount Tendered: $" + tendered + " Change due: $"
				+ ((-1) * changeRounded));

		pennies = (int) (changeRounded * (-100));

		dollars = (int) (pennies / 100);
		pennies = pennies % 100;

		fives = dollars / 5;
		dollars = dollars % 5;

		tens = fives / 2;
		fives = fives % 2;

		twenties = tens / 2;
		tens = tens % 2;

		hundreds = twenties / 5;
		twenties = twenties % 5;

		quarters = pennies / 25;
		pennies = pennies % 25;

		dimes = pennies / 10;
		pennies = pennies % 10;

		nickels = pennies / 5;
		pennies = pennies % 5;

		if (itemPrice > tendered) {
			System.out.println("The jerk owes you MORE money!");

		} else if (change == 0) {
			System.out.println("You were paid exactly what was owed. No change is due.");
			
		} else
			System.out.println("Return the following change to your loyal customer: ");

		if (hundreds > 0) {
			System.out.println("Hundred Dollar Bills: " + hundreds);
		}
		if (twenties > 0) {
			System.out.println("Twenty Dollar Bills: " + twenties);
		}
		if (tens > 0) {
			System.out.println("Ten Dollar Bills: " + tens);
		}
		if (fives > 0) {
			System.out.println("Five Dollar Bills: " + fives);
		}
		if (dollars > 0) {
			System.out.println("One Dollar Bills: " + dollars);
		}
		if (quarters > 0) {
			System.out.println("Quarters: " + quarters);
		}
		if (dimes > 0) {
			System.out.println("Dimes: " + dimes);
		}
		if (nickels > 0) {
			System.out.println("Nickels: " + nickels);
		}
		if (pennies > 0) {
			System.out.println("Pennies: " + pennies);
		}

		System.out.println("Congratulations on your successful transaction!");
		
	}

}
