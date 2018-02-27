package menjin;

import java.util.Scanner;

/**
 * 问题描述</br>
 * 涛涛最近要负责图书馆的管理工作，需要记录下每天读者的到访情况。每位读者有一个编号，每条记录用读者的编号来表示。给出读者的来访记录，请问每一条记录中的读者是第几次出现。</br>
 * 输入格式</br>
 * 输入的第一行包含一个整数n，表示涛涛的记录条数。</br>
 * 第二行包含n个整数，依次表示涛涛的记录中每位读者的编号。</br>
 * 输出格式</br>
 * 输出一行，包含n个整数，由空格分隔，依次表示每条记录中的读者编号是第几次出现。</br>
 * 样例输入</br>
 * 5</br>
 * 1 2 1 1 3</br>
 * 样例输出</br>
 * 1 1 2 3 1</br>
 * 评测用例规模与约定</br>
 * 1≤n≤1,000，读者的编号为不超过n的正整数。</br>
 */
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
