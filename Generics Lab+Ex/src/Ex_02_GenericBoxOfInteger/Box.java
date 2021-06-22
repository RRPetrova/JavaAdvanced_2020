package Ex_02_GenericBoxOfInteger;

public class Box<T> {
    private T input;

    public Box (T input){
        this.input = input;
    }

    @Override
    public String toString (){
        return input.getClass().getName() + ": " + this.input;
    }
}
