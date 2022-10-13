package lt.lhu.unit05.main;

public class Task03 {

	public static void main(String[] args) {
		int[] mas = new int[] { -36, -63, 98, -564, -45, -36, 27, 47 };
		int countPositive = 0;
		int countNegative = 0;
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%d]", mas[i]);
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				countNegative++;
			} else {
				countPositive++;
			}
		}
		if (countPositive > countNegative) {
			System.out.println("\nЧаще встречаются положительные числа");
		} else if (countPositive < countNegative) {
			System.out.println("\nЧаще встречаются отрицательные числа");
		} else {
			System.out.println("\nКоличество положительных и отрицательных чисел равно");
		}

	}

}
