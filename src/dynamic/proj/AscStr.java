package dynamic.proj;

/**
 * @author LG0812 </br>
 * 		最长子字符串问题
 */
public class AscStr {
	public static void main(String[] args) {
		String str1 = "advantage";
		String str2 = "didactical";
		System.out.println(lcs1(str1, str1.length(), str2, str2.length()));
	}

	public static int lcs1(String str1, int m, String str2, int n) {
		if (m == 0 || n == 0)
			return 0;
		// 构建一个m + 1行 n + 1列的辅助二维数组,里面的元素初始值都为0
		int[][] arr = new int[m + 1][n + 1];
		// 依次求二维数组中的值
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				// 当最后一个字符相等时等于左上角的元素加1
				if (str1.charAt(i - 1) == str2.charAt(j - 1))
					arr[i][j] = arr[i - 1][j - 1] + 1;
				// 不相等时取紧邻左边元素和上边元素者的大者
				else
					arr[i][j] = arr[i - 1][j] > arr[i][j - 1] ? arr[i - 1][j] : arr[i][j - 1];
			}
		}
		return arr[m][n];// 二维数组右下角的元素即我们需要的值
	}

}
