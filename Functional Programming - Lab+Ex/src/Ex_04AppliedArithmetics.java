import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Ex_04AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        LinkedList<Integer> list = new LinkedList<>();

        for (String s : input) {
            list.add(Integer.parseInt(s));
        }
        Function<Integer, Integer> add = x -> x + 1;
        Function<Integer, Integer> multiply = x -> x * 2;
        Function<Integer, Integer> sub = x -> x - 1;
        Consumer<Integer> printing = x -> System.out.print(x + " ");

        String cmd = scanner.nextLine();
        while (!cmd.equals("end")) {
            switch (cmd) {
                case "add":
                    for (int i = 0; i < list.size(); i++) {
                        list.set(i, add.apply(list.get(i)));
                    }

                    break;
                case "multiply":
                    for (int i = 0; i < list.size(); i++) {
                        list.set(i, multiply.apply(list.get(i)));
                    }
                    break;
                case "subtract":
                    for (int i = 0; i < list.size(); i++) {
                        list.set(i, sub.apply(list.get(i)));
                    }
                    break;
                case "print":
                    for (Integer integer : list) {
                        printing.accept(integer);
                    }
                    System.out.println();
                    break;
            }
            cmd = scanner.nextLine();
        }
    }
}
