package CCF20170905;

import java.util.*;

public class Main {
	long t[] = new long[100001];
	int a[] = new int[100001];

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		for (int i = 1; i <= n; i++) {
			a[i] = in.nextInt();
			treeArr(i, a[i], n);
		}

		while (m-- > 0) {
			int type = in.nextInt();
			if (type == 1) {
				int l = in.nextInt(), r = in.nextInt(), v = in.nextInt();
				for (int i = l; i <= r; i++) {
					if (a[i] % v == 0) {
						treeArr(i, a[i] / v - a[i], n);
						a[i] /= v;
					}
				}
			} else {
				int l = in.nextInt(), r = in.nextInt();
				System.out.println(result(l, r));
			}
		}
	}

	private long result(int l, int r) {
		// TODO Auto-generated method stub
		return sum(r) - sum(l - 1);
	}

	private long sum(int k) {
		// TODO Auto-generated method stub
		long ans = 0;
		while (k > 0) {
			ans += t[k];
			k -= lowbit(k);
		}
		return ans;
	}

	private int lowbit(int x) {
		return x & -x;
	}

	/**
	 * @param index
	 *            数组的索引
	 * @param aindex
	 *            数组的值
	 */
	private void treeArr(int index, int aindex, int n) {
		while (index <= n) {
			t[index] += aindex;
			index += lowbit(index);
		}
	}
}
