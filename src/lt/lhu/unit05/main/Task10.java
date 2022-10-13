package lt.lhu.unit05.main;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		int n = 20;
		int[] mas = new int[n];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(21);
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.printf("{%d}", mas[i]);
			}
		}

	}

}
