package lt.lhu.unit05.main;

import java.util.Random;

public class Task14 {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(20);
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(1000);
		}
		int min = a[0];
		for (int i = 0; i < a.length; i = i + 2) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		int max = a[1];
		for (int i = 1; i < a.length; i = i + 2) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		int result = min + max;
		System.out.println("result = " + result);

	}

}
