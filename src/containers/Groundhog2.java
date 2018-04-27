package containers;

/**
 * Created by LG0812 on 2018/4/27.
 */
public class Groundhog2 extends Groundhog {
    public Groundhog2(int n) {
        super(n);
    }

    public int hashCode() {
        return number;
    }

    public boolean equals(Object o) {
        return o instanceof Groundhog2 && (number == ((Groundhog2) o).number);
    }
}
