package Ex_01_ListyIterator;

import javax.naming.OperationNotSupportedException;
import java.util.Arrays;
import java.util.List;

public class ListyIterator<T> {
    private List<T> elements;
    private int index;

    public ListyIterator(T... args) {
        if (args.length == 0) {
            this.index = -1;
        }
        this.elements = Arrays.asList(args);
        this.index = 0;
    }

    public boolean move() {
        if (this.index < this.elements.size() - 1) {
            this.index++;
            return true;
        }
        return false;

    }
    public boolean hasNext(){
       return this.index < this.elements.size() -1;
    }
    public void print() throws OperationNotSupportedException {
        if (this.elements.size() == 0) {
            throw new OperationNotSupportedException("Invalid Operation!");
        } else {
            System.out.println(this.elements.get(this.index));
        }
    }
}
