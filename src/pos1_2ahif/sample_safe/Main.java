package pos1_2ahif.sample_safe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

	public static void main(String args[]) //
			throws NumberFormatException, IOException {

		if (isCodeEnteredCorrectly(0001, 0002, 0003)) {
			System.out.println("wrong!");
		} else {
			System.out.println("correct!");
		}
	}

	private static boolean isCodeEnteredCorrectly(int pin1, int pin2, int pin3)
			throws NumberFormatException, IOException {

		LinkedList<Integer> code = new LinkedList<Integer>( //
				Arrays.asList(pin1, pin2, pin3));

		try (InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr)) {

			while (!code.isEmpty()) {
				if (code.pop() != (Integer.valueOf(br.readLine()))) {
					return false;
				}
			}
			return true;

		}
	}
}
