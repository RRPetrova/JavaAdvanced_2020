package Ex_07_EqualityLogic;

import java.util.Comparator;

public class PersonCompareName implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int res = p1.getName().compareTo(p2.getName());
        if (res == 0) {
            res = Integer.compare(p1.getAge(), p2.getAge());
        }
        return res;
    }



}
