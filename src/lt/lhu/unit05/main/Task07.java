package lt.lhu.unit05.main;

import java.util.Random;

public class Task07 {

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
		int z = rand.nextInt(100);
		System.out.println("\nz = " + z);
		int countChanges = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
				countChanges++;
			}
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("{%d}", mas[i]);
		}
		System.out.println("\nКоличество замен  " + countChanges);

	}

}
