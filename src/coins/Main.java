package coins;

/**
 * 硬币找零问题。
 * 
 * 硬币找零问题描述：现存在一堆面值为 V1、V2、V3 … 个单位的硬币，问最少需要多少个硬币才能找出总值为 T 个单位的零钱？</br>
 * 假设这一堆面值分别为 1、2、5、21、25 元，需要找出总值 T 为 63 元的零钱。
 *
 */
public class Main {

    public static void main(String[] args) {
        // 预先降序排序
        int[] coinsType = new int[] { 25, 21, 10, 5, 1 };
        // 需要找零的面值
        int money = 63;

        int[] coins = new int[money + 1];
        run(coinsType, coinsType.length, money, coins);
    }

    private static void run(int[] coinsType, int length, int money, int[] coins) {
        // TODO Auto-generated method stub

        // 从面值为1到面值为63的所有面值需要的硬币的总数
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
            System.out.println("面值为：" + cents + ",至少需要数量：" + min);
        }
    }

}
