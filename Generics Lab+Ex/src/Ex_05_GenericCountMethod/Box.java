package Ex_05_GenericCountMethod;

public class Box<T extends Comparable> {
    private T input;

    public Box(T input){
        this.input = input;
    }

    public T getInput() {
        return input;
    }
}
