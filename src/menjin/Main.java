package menjin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Scanner in = new Scanner(System.in);
		long N = in.nextInt();

		int[] arr = new int[1001];
		int[] arrList = new int[1001];
		int[] rank = new int[1001];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
			arrList[arr[i]] += arr[i];
			rank[i] = arrList[arr[i]] / arr[i];
		}
		for (int i = 0; i < N; i++) {
			if (i != N - 1)
				System.out.print(rank[i] + " ");
			else
				System.out.println(rank[i]);
		}
	}
}
