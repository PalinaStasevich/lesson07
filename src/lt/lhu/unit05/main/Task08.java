package lt.lhu.unit05.main;

import java.util.Random;

public class Task08 {

	public static void main(String[] args) {
		int n = 10;
		int[] mas = new int[n];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(201) - 100;
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%d]", mas[i]);
		}
		int countZero = 0;
		int countPositive = 0;
		int countNegative = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				countPositive++;
			} else if (mas[i] == 0) {
				countZero++;
			} else {
				countNegative++;
			}
		}
		System.out.println("\nКоличество положительных элементов " + countPositive);
		System.out.println("Количество отрицательныч элементов " + countNegative);
		System.out.println("Количество нулевых элементов " + countZero);

	}

}
