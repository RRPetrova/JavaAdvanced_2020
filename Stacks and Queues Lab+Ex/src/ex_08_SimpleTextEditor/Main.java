package ex_08_SimpleTextEditor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        ArrayDeque<String> lifo = new ArrayDeque<>();

        StringBuilder text = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] cmd = reader.readLine().split("\\s+");
            switch (cmd[0]) {
                case "1":
                    lifo.push(text.toString());
                    text.append(cmd[1]);
                    break;
                case "2":
                    int count = Integer.parseInt(cmd[1]);
                    lifo.push(text.toString());
                    String text2 = text.substring(0, text.length() - count);
                    text = new StringBuilder();
                    text.append(text2);
                  //  lifo.offer(text.toString());
                    break;
                case "3":
                    System.out.println(text.charAt(Integer.parseInt(cmd[1]) - 1));
                    break;
                case "4":
                    text2 = lifo.pop();
                    text = new StringBuilder();
                    text.append(text2);

                    break;
            }

        }


    }
}
