package lt.lhu.unit05.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		int n = 10;
		int[] mas = new int[n];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%d]", mas[i]);
		}
		boolean claim = true;
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] <= mas[i - 1]) {
				claim = false;
				break;
			}
		}
		if (claim) {
			System.out.println("\nПоследовательность возрастающая");
		} else {
			System.out.println("\nПоследовательность не является возрастающей");
		}

	}

}
