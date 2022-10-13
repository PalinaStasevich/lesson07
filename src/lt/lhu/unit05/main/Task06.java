package lt.lhu.unit05.main;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(20);
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(1000);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("[%d]", a[i]);
		}
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		int minLength = max - min;
		System.out.println("\nНаименьшая длина числовой оси " + minLength);
		
	}
	
}