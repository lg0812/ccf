package CCF20170901;

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
		int buy = n / 10;
		int buy5 = buy / 5;
		int buy3 = (buy - buy5 * 5) / 3;
		System.out.println(buy5 * 2 + buy3 + buy);
	}

}
