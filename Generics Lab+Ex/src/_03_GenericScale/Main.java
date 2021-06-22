package _03_GenericScale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> intScale = new Scale<>(5,2);

        System.out.println(intScale.getHeavier());
    }
}
