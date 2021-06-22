package _04articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Article2> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] cmd = scanner.nextLine().split(", ");

            Article2 art2 = new Article2(cmd[0], cmd[1], cmd[2]);
            list.add(art2);

        }
        String crit = scanner.nextLine();
        if (crit.equals("title")) {
            list.sort(Comparator.comparing(Article2::getTitle));
        } else if (crit.equals("content")) {
            list.sort(Comparator.comparing(Article2::getContent));
        } else if (crit.equals("author")) {
            list.sort(Comparator.comparing(Article2::getAuthor));
        }

        for (Article2 article2 : list) {
            System.out.println(article2);
        }

    }
}
