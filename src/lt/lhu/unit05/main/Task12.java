package lt.lhu.unit05.main;

import java.util.Random;

public class Task12 {

	public static void main(String[] args) {
		int n = 10;
		double[] mas = new double[n];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble();
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%4.2f]", mas[i]);
		}
		double sum = 0.0;
		for (int i = 2; i < mas.length; i++) {
			boolean isPrime = i > 1;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				sum = sum + mas[i];
			}
		}
		System.out.printf("\nsum = [%4.2f]", sum);
	}

}
