package coins;

/**
 * Ӳ���������⡣
 * 
 * Ӳ�����������������ִ���һ����ֵΪ V1��V2��V3 �� ����λ��Ӳ�ң���������Ҫ���ٸ�Ӳ�Ҳ����ҳ���ֵΪ T ����λ����Ǯ��</br>
 * ������һ����ֵ�ֱ�Ϊ 1��2��5��21��25 Ԫ����Ҫ�ҳ���ֵ T Ϊ 63 Ԫ����Ǯ��
 *
 */
public class Main {

	public static void main(String[] args) {
		// Ԥ�Ƚ�������
		int[] coinsType = new int[] { 25, 21, 10, 5, 1 };
		// ��Ҫ�������ֵ
		int money = 63;

		int[] coins = new int[money + 1];
		run(coinsType, coinsType.length, money, coins);
	}

	private static void run(int[] coinsType, int length, int money, int[] coins) {
		// TODO Auto-generated method stub

		// ����ֵΪ1����ֵΪ63��������ֵ��Ҫ��Ӳ�ҵ�����
		for (int cents = 1; cents <= money; cents++) {
			int min = cents;
			for (int i = 0; i < length; i++) {
				if (coinsType[i] <= cents) {
					int temp = coins[cents - coinsType[i]] + 1;
					if (temp < min) {
						min = temp;
					}
				}
			}

			coins[cents] = min;
			System.out.println("��ֵΪ��" + cents + ",������Ҫ������" + min);
		}
	}

}
