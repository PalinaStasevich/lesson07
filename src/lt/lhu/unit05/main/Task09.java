package lt.lhu.unit05.main;

import java.util.Random;

public class Task09 {

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
		int min = mas[0];
		int minIndex = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
				minIndex = i;
			}
		}
		int max = mas[0];
		int maxIndex = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
				maxIndex = i;
			}
		}
		System.out.println("\nmax = " + max);
		System.out.println("min = " + min);
		int temp = mas[minIndex];
		mas[minIndex] = mas[maxIndex];
		mas[maxIndex] = temp;
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("{%d}", mas[i]);
		}
		
	}
	
}
