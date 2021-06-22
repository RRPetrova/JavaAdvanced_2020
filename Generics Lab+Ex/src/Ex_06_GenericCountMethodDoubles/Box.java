package Ex_06_GenericCountMethodDoubles;

public class Box<T extends Comparable> {
    private T input;

    public Box(T input) {
        this.input = input;
    }

    public T getInput() {
        return this.input;
    }


}
