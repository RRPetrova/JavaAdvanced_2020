package _02article;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleData = scanner.nextLine().split(", ");

        Article article = new Article(articleData[0], articleData[1], articleData[2]);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] cmd = scanner.nextLine().split(": ");
            if (cmd[0].equals("Edit")) {
                article.edit(cmd[1]);
            } else if (cmd[0].equals("ChangeAuthor")) {
                article.changeAuthor(cmd[1]);
            } else if (cmd[0].equals("Rename")) {
                article.rename(cmd[1]);
            }
        }


        System.out.println(article);

    }
}
