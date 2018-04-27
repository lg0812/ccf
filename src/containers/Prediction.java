package containers;

import java.util.Random;

/**
 * Created by LG0812 on 2018/4/27.
 */
public class Prediction {
    private static Random rand = new Random(47);
    private boolean shadow = rand.nextDouble() > .5;

    public String toString() {
        if (shadow)
            return "Six more weeks of Winter";
        else
            return "Early SPring";
    }
}
