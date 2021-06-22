package _01_JarOfT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jar<Integer> jar = new Jar<>();
        jar.add(5);
        jar.add(6);
        jar.add(87);

        System.out.println(jar.remove());
    }
}
