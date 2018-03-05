package CCF20131202;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String isbn_ = in.nextLine();
		String isbn = isbn_.replace("-", "");
		int[] a = new int[isbn.length()];
		int sum = 0;
		for (int i = 0; i < isbn.length(); i++) {
			a[i] = (int) isbn.charAt(i) - 48;
			if (i < isbn.length() - 1) {

				sum = sum + a[i] * (i + 1);
			}
		}
		sum = sum % 11;
		if (a[a.length - 1] == sum || ("X".charAt(0) - 48 == a[a.length - 1] && sum == 10)) {
			System.out.println("Right");
		} else {
			String str = isbn_.substring(0, 12);
			if (sum == 10) {
				str = str + "X";
			} else {
				str = str + sum;
			}
			System.out.println(str);
		}

	}
}
