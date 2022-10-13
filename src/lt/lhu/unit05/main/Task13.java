package lt.lhu.unit05.main;

import java.util.Random;

public class Task13 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = 50;
		int m = 3;
		int l = 11;
		int n = 666;
		int countIndex = 0;
		int[] mas = new int[a];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}

		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] % m == 0) & (mas[i] > l) & (mas[i] < n)) {
				countIndex++;
			}
		}
		System.out.println("Количество элементов " + countIndex);
	}

}
