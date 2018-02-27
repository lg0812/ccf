package zindex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] a = new int[501][501];
		List b = new ArrayList();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				a[i][j] = in.nextInt();
			}
		}
		int sum;
		for (int i = 0; i < 2 * N - 1; i++) {
			sum = i;
			if (i % 2 == 0) {
				for (int k = 0; k <= sum; k++) {
					if (k < N && sum - k < N)
						b.add(a[sum - k][k]);
				}
			} else {
				for (int k = sum; k >= 0; k--) {
					if (k < N && sum - k < N)
						b.add(a[sum - k][k]);
				}
			}
		}

		for (int i = 0; i < b.size(); i++) {
			if (i != b.size() - 1)
				System.out.print(b.get(i) + " ");
			else
				System.out.print(b.get(i));
		}
	}
}
