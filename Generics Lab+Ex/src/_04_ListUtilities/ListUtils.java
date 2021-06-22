package _04_ListUtilities;

import java.util.List;

public class ListUtils {


    public static <T extends Comparable<T>>T getMax(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException("max empty");
        }
        T currentMax = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (currentMax.compareTo(list.get(i)) < 0) {
                currentMax = list.get(i);
            }
        }

        return currentMax;
    }

    public static <T extends Comparable<T>>T getMin(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException("min empty");
        }
        T min = list
                .stream()
                .reduce(list.get(0), (next, curr) -> next.compareTo(curr) > 0 ? curr:next);
return min;
    }
}
