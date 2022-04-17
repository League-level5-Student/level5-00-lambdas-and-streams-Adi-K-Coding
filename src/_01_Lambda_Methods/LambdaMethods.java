package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((ss) -> {
			String stringy = "";
			for (int i = ss.length() - 1; i >= 0; i--) {
				stringy = stringy + ss.charAt(i);
			}
			System.out.println(stringy);
		}, "repeat");
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		Random rand = new Random();
		printCustomMessage((ss) -> {
			String stringy = "";
			char current = ' ';
			for (int i = 0; i < ss.length(); i++) {
				int x = rand.nextInt(2);
				if (x == 1) {
					current = Character.toUpperCase(ss.charAt(i));
					stringy = stringy + current;
				} else {
					current = ss.charAt(i);
					stringy = stringy + current;
				}
			}
			System.out.println(stringy);
		}, "random");
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((ss) -> {
			String stringy = "";
			for (int i = 0; i < ss.length(); i++) {
				stringy = stringy + ss.charAt(i);
				stringy = stringy + ".";
			}
			String finalString = stringy.substring(0, stringy.length() - 1);
			System.out.println(finalString);
		}, "period");
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((ss) -> {
			String stringy = "";
			for (int i = 0; i < ss.length(); i++) {
				if (ss.charAt(i) == 'a' || ss.charAt(i) == 'e' || ss.charAt(i) == 'i' || ss.charAt(i) == 'o'
						|| ss.charAt(i) == 'u') {
					stringy = stringy + "";
				}else {
				stringy = stringy + ss.charAt(i);
				}	
			}
			System.out.println(stringy);
		}, "no more vowels");
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
