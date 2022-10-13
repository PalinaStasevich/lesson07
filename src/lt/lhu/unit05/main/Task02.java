package lt.lhu.unit05.main;

public class Task02 {

	public static void main(String[] args) {
		int[] mas = new int[] { 963, 459, 0, 782, 63, 0, 4788, 63, 0, 0, 456 };
		int countZero = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				countZero++;
			}
		}
		int[] zeroPositionsArray = new int[countZero];
		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				zeroPositionsArray[j++] = i;
			}
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%d]", mas[i]);
		}
		System.out.println();
		for (int j = 0; j < zeroPositionsArray.length; j++) {
			System.out.printf("{%d}", zeroPositionsArray[j]);

		}

	}
}
