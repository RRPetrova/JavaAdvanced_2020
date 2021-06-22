package Ex_09_LinkedListTraversal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedList linkedList = new LinkedList<>();
        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            if (input[0].equals("Add")) {
                linkedList.add(input[1]);
            } else {
                linkedList.removeIfPresent(input[1]);
            }
        }
        System.out.println(linkedList.getSize());

        StringBuilder sb = new StringBuilder();
        for (Object o : linkedList) {
            sb.append(o).append(" ");
        }
        System.out.println(sb.toString().trim());


    }
}
