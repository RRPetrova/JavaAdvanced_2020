package Ex_09_LinkedListTraversal;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedList<T> implements Iterable<T> {
    private List<T> elements;
    //private int index;

    public LinkedList() {
        this.elements = new ArrayList<>();
    }

    public boolean removeIfPresent(T elem) {
        for (int i = 0; i < this.elements.size(); i++) {
            if (this.elements.get(i).toString().equals(elem)) {
                this.elements.remove(i);
               return true;
            }
        }
        return false;
    }

    public void add(T elem) {
        this.elements.add(elem);
    }

    public int getSize() {
        return this.elements.size();
    }


    @Override
    public Iterator<T> iterator() {
        return new LinkedListIter();
    }

    private class LinkedListIter implements Iterator<T> {

        int position = 0;
        @Override
        public boolean hasNext() {
            return position <= elements.size()-1;
        }

        @Override
        public T next() {
            return elements.get(position++);
        }
    }
}