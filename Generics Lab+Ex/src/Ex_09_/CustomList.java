package Ex_09_;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Consumer;

public class CustomList<T extends Object & Comparable> {
    private static final int INITIAL_CAPACITY = 4;

    private T[] data;
    private int size;

    public CustomList() {
        this.data = (T[])Array.newInstance(Object.class,
                INITIAL_CAPACITY);
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public void add(T element) {
        if (this.size == this.data.length) {
            resize();
        }
        this.data[this.size++] = element;
    }

    private void resize() {
        T[] newData = (T[])Array.newInstance(
                Object.class, this.data.length * 2);

        for (int i = 0; i < this.data.length; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }

    public T remove(int index) {
        T elem = this.data[index];

        for (int i = index; i < this.size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[this.size--] = null;
        return elem;
    }

    public boolean contains(T element) {
        boolean isPres = false;
        for (int i = 0; i < this.size; i++) {
            if (element.equals(this.data[i])) {
                isPres = true;
                break;
            }
        }
        return isPres;
    }

    public void swap(int ind1, int ind2) {
        T temp = this.data[ind1];
        this.data[ind1] = this.data[ind2];
        this.data[ind2] = temp;
    }

    public int countGreaterThan(T element) {
        return (int) Arrays.stream(this.data, 0, this.size)
                .filter(e -> 0 < e.compareTo(element))
                .count();

    }

    public T getMax() {
        return Arrays.stream(this.data, 0, this.size)
                .max(T::compareTo)
                .orElse(null);
    }

    public T getMin() {
        return Arrays.stream(this.data, 0, this.size)
                .min(T::compareTo)
                .orElse(null);
    }

    public void forEach(Consumer<T> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }

}
