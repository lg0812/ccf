package CCF20131201;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] a = new int[10001];
		for (int i = 0; i < n; i++) {
			a[in.nextInt()]++;
		}
		int max = 0;
		int index = 0;
		
		for (int i = 0; i < 10001; i++) {
			if (a[i] > max) {
				max = a[i];
				index = i;
			}
		}
		System.out.println(index);
	}

}
