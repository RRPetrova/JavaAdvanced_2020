package _02_Library;

import java.util.Iterator;

public class Library<T> implements Iterable<T> {

    private T[] items;

    Library(T... items) {
       this.items = items;
    }


    @Override
    public Iterator<T> iterator() {
        return new LibraryIterator();
    }

    private class LibraryIterator implements Iterator<T> {

        private int currIndex;

        LibraryIterator(){
            this.currIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return this.currIndex + 1 <= items.length;
        }

        @Override
        public T next() {
            return items[this.currIndex++];
        }
    }
}
