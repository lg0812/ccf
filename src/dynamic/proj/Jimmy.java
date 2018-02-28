package dynamic.proj;

import java.util.List;
import java.util.Scanner;

/**
 * @author LG0812 场景中包括多个长度和高度各不相同的平台。地面是最低的平台，高度为零，长度无限。</br>
 *         Jimmy老鼠在时刻0从高于所有平台的某处开始下落，它的下落速度始终为1米/秒。当Jimmy落到某个平台上时，
 *         游戏者选择让它向左还是向右跑，它跑动的速度也是1米/秒。当Jimmy跑到平台的边缘时，开始继续下落。
 *         Jimmy每次下落的高度不能超过MAX米，不然就会摔死，游戏也会结束。</br>
 *         设计一个程序，计算Jimmy到底地面时可能的最早时间。</br>
 *         Input</br>
 *         第一行是测试数据的组数t（0 <= t <=20）。每组测试数据的第一行
 *         是四个整数N，X，Y，MAX，用空格分隔。N是平台的数目（不包括地面），X和Y是Jimmy开始下落的位置的横竖坐标，
 *         MAX是一次下落的最大高度。接下来的N行每行描述一个平台，包括三个整数，X1[i]，X2[i]和H[i]。
 *         H[i]表示平台的高度，X1[i]和X2[i]表示平台左右端点的横坐标。1 <= N <= 1000，-20000 <= X,
 *         X1[i], X2[i] <= 20000，0 < H[i] < Y <= 20000（i = 1..N）。所有坐标的单位都是米。
 *         </br>
 *         Jimmy的大小和平台的厚度均忽略不计。如果Jimmy恰好落在某个平台的边缘，被视为落在平台上。所有的平台均不重叠或相连。测试数据保证问题一定有解。
 *         </br>
 *         Output </br>
 *         对输入的每组测试数据，输出一个整数，Jimmy到底地面时可能的最早时间。</br>
 *         Sample Input</br>
 *         </br>
 *         1</br>
 *         3 8 17 20</br>
 *         0 10 8</br>
 *         0 10 13</br>
 *         4 14 3</br>
 *         Sample Output</br>
 *         </br>
 *         23</br>
 */
public class Jimmy {

	public static void main(String[] args) {
		new Jimmy().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int minTime[] = new int[n];
		for (int t = 0; t < n; t++) {
			// 分别代表 平台数，开始下落位置横坐标，纵坐标，一次下落最大高度
			int[] ctrl = new int[] { in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt() };
			int[][] b = new int[ctrl[0]][3];
			for (int i = 0; i < ctrl[0]; i++) {
				for (int j = 0; j < 3; j++) {
					b[i][j] = in.nextInt();
				}
			}
			minTime[t] = minTime(ctrl, b);
		}
		System.out.println(minTime.toString());
	}

	private int minTime(int[] ctrl, int[][] b) {
		// TODO Auto-generated method stub

		int[] temp = new int[ctrl.length - 1];
//		for()
		return 0;
	}
}
