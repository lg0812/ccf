package minsub;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int min = 10000;
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				int temp = Math.abs(a[i] - a[i - 1]);
				if (temp < min) {
					min = temp;
				}
			}
		}

		System.out.println(min);
	}

}
