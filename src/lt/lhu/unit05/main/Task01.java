package lt.lhu.unit05.main;

import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
		int n = 10;
		int[] a = new int[n];
		int k = 2;
		int sum = 0;
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("[%d]", a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % k == 0) {
				sum = sum + a[i];
			}
		}
		System.out.println("\nsum = " + sum);

	}

}
