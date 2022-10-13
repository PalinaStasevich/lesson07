package lt.lhu.unit05.main;

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {
		int n = 50;
		int[] mas = new int[n];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
		int l = 1;
		int m = 7;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % m - 1 == l) {
				System.out.printf("{%d}", mas[i]);
			}
		}

	}

}
