package dynamic.proj;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author LG0812 </br>
 *         递归方法
 *         输入的第一行是一个整数n,代表三角形的行数，相面的n行给出数字三角形，输出最大和,路径上的每一步只能从一个数走到下一层上和和最近的左边的数或者右边的数！</br>
 *         5</br>
 *         7</br>
 *         3 8</br>
 *         8 1 0</br>
 *         2 7 4 4</br>
 *         4 5 2 6 5</br>
 * 
 *         输出</br>
 *         30</br>
 * 
 *         5 7 3 8 8 1 0 2 7 4 4 4 5 2 6 5
 */
public class Triangle {
	public static void main(String[] args) {
		new Triangle().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[][] a = new int[n][n];

		// 使用该数组来保存已计算的 数据，避免过多的重复计算
		int[][] b = new int[n][n];

		// 将数组初始化为-1
		for (int i = 0; i < n; i++)
			Arrays.fill(b[i], -1);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				a[i][j] = in.nextInt();
			}
		}

		System.out.println(maxSum(0, 0, a, n, b));

	}

	private int maxSum(int x, int y, int[][] a, int length, int[][] b) {
		if (x == length - 1)
			return a[length - 1][y];
		if (b[x + 1][y] == -1)
			b[x + 1][y] = maxSum(x + 1, y, a, length, b);
		if (b[x + 1][y + 1] == -1)
			b[x + 1][y + 1] = maxSum(x + 1, y + 1, a, length, b);
		int prev = b[x + 1][y] + a[x][y];
		int last = b[x + 1][y + 1] + a[x][y];
		return prev > last ? prev : last;

	}

}
