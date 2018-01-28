package czysio.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Integer[] arr = new Integer[49];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		Collections.shuffle(Arrays.asList(arr));

		Integer[] sixRandomLottoNumbers = Arrays.copyOf(arr, 6);
		Arrays.sort(sixRandomLottoNumbers);

		System.out.println("Podaj sześć liczb.");

		ArrayList<Integer> playerNumbers = new ArrayList<>();
		
		do {
			try {
				int nextPlayerNumber = scan.nextInt();
				while (nextPlayerNumber <= 0 || nextPlayerNumber >= 50) {
					System.out.println("Podaj liczbę między \"1\" a \"49\".");
					nextPlayerNumber = scan.nextInt();
				}
				if (!playerNumbers.contains(nextPlayerNumber)) {
					playerNumbers.add(nextPlayerNumber);
				}
			} catch (InputMismatchException e) {
				System.out.println("Nie podałeś liczby, podaj liczbę.");
				scan.next();
			}
		} while (playerNumbers.size() < 6);

		playerNumbers.toArray(new Integer[0]);
		System.out.println(playerNumbers);

		System.out.println(Arrays.toString(sixRandomLottoNumbers));

		int numberOfCommonElementsInUnqueArrays = 0;

		for (Integer a : sixRandomLottoNumbers) {
			for (Integer b : playerNumbers) {
				if (a.equals(b)) {
					numberOfCommonElementsInUnqueArrays += 1;
					break;
				}
			}

		}
		if (numberOfCommonElementsInUnqueArrays == 6) {
			System.out.println("Trafiłeś \"szóstkę\". Gratulacje!");
		} else if (numberOfCommonElementsInUnqueArrays == 5) {
			System.out.println("Trafiłeś \"piątkę\". Gratulacje!");
		} else if (numberOfCommonElementsInUnqueArrays == 4) {
			System.out.println("Trafiłeś \"czwórkę\". Gratulacje!");
		} else if (numberOfCommonElementsInUnqueArrays == 3) {
			System.out.println("Trafiłeś \"trójkę\". Gratulacje!");
		} else {
			System.out.println("Niestety nic nie wygrałeś. Spróbuj jeszcze raz.");
		}
	}
}