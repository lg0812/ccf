package bag;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int[] w = new int[1000];

		for (int i = 0; i < n; i++) {
			w[i] = in.nextInt();
			for (int j = m; j >= 0; j--) {
				System.out.println("===" + w[j]);
				if (w[j] == 0)
					continue;
				w[j + w[i]] = 1;
			}
			System.out.println("--------------------");
		}

		if (w[m] == 1) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
