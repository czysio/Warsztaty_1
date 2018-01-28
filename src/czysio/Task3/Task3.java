package czysio.Task3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Think about a number between \"0\" and \"1000\", and I will guess it in max. 10 tries.");

		String playersHint = null;
		int min = 0;
		int max = 1000;
		do {
				int guess = ((max - min) / 2) + min;
				System.out.println("My guess is " + guess);
				System.out.print("Write \"too high\", \"too low\" or \"correct\":");
				playersHint = scan.nextLine();
				playersHint = playersHint.trim();
				System.out.println(playersHint);
				// if (playersHint == null || playersHint.trim().isEmpty() ||
				// !"correct".equals(playersHint)
				// || !"too high".equals(playersHint) || !"too low".equals(playersHint)) {
				// warnAboutIncorrectPlayersHint();
				// } else
				if ("too low".equals(playersHint)) {
					min = guess;
				} else if ("too high".equals(playersHint)) {
					max = guess;
				} else if ("correct".equals(playersHint)) {
					System.out.println("I won!");
				} else {
					warnAboutIncorrectPlayersHint();
				}
			}
			while (!"correct".equals(playersHint))
				;

	}

	static void warnAboutIncorrectPlayersHint() {
		System.out.println("Don't cheat.");

	}

}
