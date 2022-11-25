package apnaCollege;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int size = s1.nextInt();
		int array1[] = new int[size];

		for (int i = 0; i < size; i++) {
			array1[i] = s1.nextInt();
		}

		for (int j : array1) {
			System.out.println(j);
		}
	}
}
