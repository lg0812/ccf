package zindex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 问题描述</br>
 * 在图像编码的算法中，需要将一个给定的方形矩阵进行Z字形扫描(Zigzag Scan)。给定一个n×n的矩阵，Z字形扫描的过程如下图所示：</br>
 * </br>
 * 对于下面的4×4的矩阵，</br>
 * 1 5 3 9</br>
 * 3 7 5 6</br>
 * 9 4 6 4</br>
 * 7 3 1 3</br>
 * 对其进行Z字形扫描后得到长度为16的序列：</br>
 * 1 5 3 9 7 3 9 5 4 7 3 6 6 4 1 3</br>
 * 请实现一个Z字形扫描的程序，给定一个n×n的矩阵，输出对这个矩阵进行Z字形扫描的结果。</br>
 * 输入格式</br>
 * 输入的第一行包含一个整数n，表示矩阵的大小。</br>
 * 输入的第二行到第n+1行每行包含n个正整数，由空格分隔，表示给定的矩阵。</br>
 * 输出格式</br>
 * 输出一行，包含n×n个整数，由空格分隔，表示输入的矩阵经过Z字形扫描后的结果。</br>
 * 样例输入</br>
 * 4</br>
 * 1 5 3 9</br>
 * 3 7 5 6</br>
 * 9 4 6 4</br>
 * 7 3 1 3</br>
 * 样例输出</br>
 * 1 5 3 9 7 3 9 5 4 7 3 6 6 4 1 3</br>
 * 评测用例规模与约定</br>
 * 1≤n≤500，矩阵元素为不超过1000的正整数。</br>
 *
 */
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
