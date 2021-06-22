package Ex_06_StrategyPattern;

import java.util.Comparator;

public class PersonComparatorByName implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int res = p1.getName().length() - (p2.getName().length());
        if (res == 0) {
            return p1.getName().toLowerCase().charAt(0) -
                    p2.getName().toLowerCase().charAt(0);

        }

        return res;
    }
}
