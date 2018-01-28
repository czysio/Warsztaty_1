package czysio.Task1;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

	private final static Random r = new Random();
	
	public static void main(String[] args) {

		System.out.println("Gra w zgadywanie liczb");
		try (Scanner scan = new Scanner(System.in)) {
			int numberToGuess = randomNumberToGuess();
			int yourNumber = 0;
			do {
				yourNumber = readNumber(scan);
				if (yourNumber < numberToGuess) {
					System.out.println("Za mało!");
				} else if (yourNumber > numberToGuess) {
					System.out.println("Za dużo!");
				}
			} while (yourNumber != numberToGuess);
			System.out.println("Zgadłeś!");
		}
	}

	static int randomNumberToGuess() {
		return r.nextInt(100) + 1;
	}

	static int readNumber(Scanner scan) {
		System.out.print("Zgadnij liczbę: ");
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println("To nie jest liczba.");
			System.out.print("Zgadnij liczbę: ");
		}
		return scan.nextInt();
	}

}
