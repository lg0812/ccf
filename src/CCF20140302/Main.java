package CCF20140302;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        List<Integer[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Integer[] a = new Integer[5];
            a[0] = i + 1;
            a[1] = in.nextInt();
            a[2] = in.nextInt();
            a[3] = in.nextInt();
            a[4] = in.nextInt();
            list.add(a);
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            boolean has = false;
            for (int t = list.size() - 1; t >= 0; t--) {
                if (list.get(t)[1] <= x && x <= list.get(t)[3] && list.get(t)[2] <= y && y <= list.get(t)[4]) {
                    result.add(list.get(t)[0].toString());
                    list.add(list.remove(t));
                    has = true;
                    break;
                }
            }
            if (!has)
                result.add("IGNORED");
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
}
