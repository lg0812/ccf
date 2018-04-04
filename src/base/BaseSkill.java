package base;


import org.junit.Test;

public class BaseSkill {
    @Test
    public void test_add() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int i = 0;
        System.out.println(a[++i]);
    }
}
