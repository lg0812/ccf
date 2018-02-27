package fun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * @author LG0812
 * 将数组按照如下顺序打印出来
 * 1  -  2  -  3  -  4
 *                   |
 * 5  -  6  -  7     8
 * |           |     |
 * 9    10  -  11   12
 * |                 |
 * 13 - 14 -   15 - 16
 */


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();

	}

	private void run() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[][] a = new int[1001][1001];

		List b = new ArrayList();
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = in.nextInt();
			}
		}

		int flag = 1;
		int row_start = 0, row_end = n - 1, column_start = 0, column_end = n - 1, row = 0, column = 0;

		while (b.size() < n * n) {
			if (flag == 1) {
				for (int i = column_start; i <= column_end; i++) {
					b.add(a[row][i]);
				}
				row_start++;
				column = column_end;
				flag = 2;
			} else if (flag == 2) {
				for (int i = row_start; i <= row_end; i++) {
					b.add(a[i][column]);
				}

				column_end--;
				row = row_end;
				flag = 3;
			} else if (flag == 3) {
				for (int i = column_end; i >= column_start; i--) {
					b.add(a[row][i]);
				}

				row_end--;
				column = column_start;
				flag = 4;
			} else if (flag == 4) {
				for (int i = row_end; i >= row_start; i--) {
					b.add(a[i][column]);
				}

				column_start++;
				row = row_start;
				flag = 1;
			}

		}

		System.out.println(b.toString());
	}

}
