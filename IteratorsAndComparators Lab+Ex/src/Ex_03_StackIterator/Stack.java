package Ex_03_StackIterator;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Stack<T> implements Iterable<T>{
    private List<T> elements;
    private int index;

    public Stack(){
        elements = new ArrayList<>();
        this.index = -1;
    }

    public void push(T num) {
        this.elements.add(num);
        this.index++;
    }

    public void pop() throws OperationNotSupportedException {
        if (this.index == -1) {
            throw new OperationNotSupportedException("No elements");
        } else {
            this.elements.remove(this.index--);

        }
    }



    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private int position = index;
            @Override
            public boolean hasNext() {
                return position >= 0;
            }

            @Override
            public T next() {
                return elements.get(this.position--);
            }
        };
    }
}
