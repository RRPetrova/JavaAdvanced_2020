package Ex_02_Collection;

import javax.naming.OperationNotSupportedException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator02<T> implements Iterable<T> {
    private List<T> elements;
    private int index;

    public ListyIterator02(T... args) {
        if (args.length == 0) {
            this.index = -1;
        } else {
            this.elements = Arrays.asList(args);
            this.index = 0;
        }
    }

    public boolean move() {
        if (this.index < this.elements.size()-1) {
            this.index++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        return this.index < this.elements.size() - 1;
    }

    public void print() throws OperationNotSupportedException {
        if (this.elements.size() == 0) {
            throw new OperationNotSupportedException("Invalid Operation!");
        } else {
            System.out.println(this.elements.get(this.index));
        }
    }

    public void printAll() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.elements.size(); i++) {
            sb.append(this.elements.get(i)).append(" ");
        }

        System.out.println(sb.toString());

    }

    @Override
    public Iterator<T> iterator() {
        return this.elements.iterator();

    }


}
