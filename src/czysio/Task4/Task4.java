package czysio.Task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Task4 {

	private final static Random rand = new Random();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String formScanner = null;
		formScanner = scan.nextLine();
		formScanner = formScanner.replaceAll("[^0-9|\\-|\\+|D]", "");
		formScanner = formScanner.replaceAll("D3", "0 3 ");
		formScanner = formScanner.replaceAll("D4", "0 4 ");
		formScanner = formScanner.replaceAll("D6", "0 6 ");
		formScanner = formScanner.replaceAll("D8", "0 8 ");
		formScanner = formScanner.replaceAll("D10", "0 10 ");
		formScanner = formScanner.replaceAll("D12", "0 12 ");
		formScanner = formScanner.replaceAll("D20", "0 20 ");
		formScanner = formScanner.replaceAll("D100", "0 100 ");
//		System.out.println(formScanner);
		String[] tempDiceParameters = formScanner.split(" ");
//		System.out.println(Arrays.toString(tempDiceParameters));

		int[] tempDiceParameters2 = Arrays.stream(tempDiceParameters).mapToInt(Integer::parseInt).toArray();
//		System.out.println(Arrays.toString(tempDiceParameters2));
		int[] throwParameters = Arrays.copyOf(tempDiceParameters2, 3);
//		System.out.println(Arrays.toString(throwParameters));
		int diceType = throwParameters[1];
		int numberOfDices = throwParameters[0];
		int addRemoveFromThrowResult = throwParameters[2];
//		System.out.println(diceType); 
//		System.out.println(numberOfDices);
//		System.out.println(addRemoveFromThrowResult);
		int diceResult = rand.nextInt(diceType)+1;
		if (numberOfDices == 0) {
				numberOfDices = 1;
				int result = (numberOfDices * diceResult) + addRemoveFromThrowResult;
				System.out.println(result);
			} else {
				numberOfDices = numberOfDices / 10;
				int result = (numberOfDices * diceResult) + addRemoveFromThrowResult;	
				System.out.println(result);

			}
		}
	}

