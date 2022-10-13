package lt.lhu.unit05.main;

import java.util.Random;

public class Task15 {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(20);
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(1000);
		}
		int c = 300;
		int d = 800;
		for (int i = 0; i < a.length; i++) {
			if ((a[i] >= c) & (a[i] <= d)) {
				System.out.printf("[%d]", a[i]);
			}
		}

	}
}
