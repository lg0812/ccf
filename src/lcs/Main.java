package lcs;

public class Main {
	public static void main(String[] args) {
		String str1 = "advantage";
		String str2 = "didactical";
		System.out.println(lcs1(str1, str1.length(), str2, str2.length()));
	}

	public static int lcs1(String str1, int m, String str2, int n) {
		if (m == 0 || n == 0)
			return 0;
		// ����һ��m + 1�� n + 1�еĸ�����ά����,�����Ԫ�س�ʼֵ��Ϊ0
		int[][] arr = new int[m + 1][n + 1];
		// �������ά�����е�ֵ
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				// �����һ���ַ����ʱ�������Ͻǵ�Ԫ�ؼ�1
				if (str1.charAt(i - 1) == str2.charAt(j - 1))
					arr[i][j] = arr[i - 1][j - 1] + 1;
				// �����ʱȡ�������Ԫ�غ��ϱ�Ԫ���ߵĴ���
				else
					arr[i][j] = arr[i - 1][j] > arr[i][j - 1] ? arr[i - 1][j] : arr[i][j - 1];
			}
		}
		return arr[m][n];// ��ά�������½ǵ�Ԫ�ؼ�������Ҫ��ֵ
	}

}
