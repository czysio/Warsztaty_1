package czysio.Task3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		System.out.println("Think about a number between \"0\" and \"1000\", and I will guess it in max. 10 tries.");

		int min = 0;
		int max = 1000;
		String playersHint = null;

		try (Scanner scan = new Scanner(System.in)) {
			int guess = ((max - min) / 2) + min;
			System.out.println("My guess is " + guess);
			System.out.print("Write \"too high\", \"too low\" or \"correct\":");
			do {
				playersHint = scan.nextLine();
				if (isPlayersHintCorrect(playersHint)) {
					warnAboutIncorrectPlayersHint();
				} else if ("too low".equalsIgnoreCase(playersHint)) {
					min = guess;
				} else if ("too high".equalsIgnoreCase(playersHint)) {
					max = guess;
				}

			} while (!"correct".equalsIgnoreCase(playersHint) || !"too low".equalsIgnoreCase("too low")
					|| !"too high".equalsIgnoreCase(playersHint));

		}
		while (!"correct".equalsIgnoreCase(playersHint))
			;
		System.out.println("I won!");

	}

	private static boolean isPlayersHintCorrect(String playersHint) {
		return playersHint == null || playersHint.trim().isEmpty(); 
//				|| !"correct".equalsIgnoreCase(playersHint)
//				|| !"too high".equalsIgnoreCase(playersHint) || !"too low".equalsIgnoreCase(playersHint);
	}

	static void warnAboutIncorrectPlayersHint() {
		System.out.println("Don't cheat`.");

	}

}
