package lt.lhu.unit05.main;

import java.util.Random;

public class Task05 {

	public static void main(String[] args) {
		int n = 10;
		int countEvenNumbers = 0;
		int[] mas = new int[n];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%d]", mas[i]);
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				countEvenNumbers++;
			}
		}
		if (countEvenNumbers == 0) {
			System.out.println("В массиве нет четных чисел");
		}
		int[] masEven = new int[countEvenNumbers];
		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				masEven[j++] = mas[i];
			}
		}
		System.out.println();
		for (int j = 0; j < masEven.length; j++) {
			System.out.printf("{%d}", masEven[j]);

		}

	}
}
