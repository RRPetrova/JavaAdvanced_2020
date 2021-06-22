package _03_GenericScale;

import java.util.Comparator;

public class Scale<T extends Comparable<T>> {
    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier() {
        int res = this.left.compareTo(this.right);

        if (res == 0) {

            return null;
        }

        return res > 0 ? this.left : this.right;
    }

}
