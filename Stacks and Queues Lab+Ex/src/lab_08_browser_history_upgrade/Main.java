package lab_08_browser_history_upgrade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String site = reader.readLine();

        ArrayDeque<String> queueForw = new ArrayDeque<>();
        ArrayDeque<String> stack = new ArrayDeque<>();

        while (!site.equals("Home")) {

            if (site.equals("back")) {
                if (stack.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    String curr = stack.pop();
                    queueForw.push(curr);
                    System.out.println(stack.peek());
                }
            } else if (site.equals("forward")) {
                if (queueForw.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    String cyrr = queueForw.pop();
                    System.out.println(cyrr);
                    stack.push(cyrr);
                }
            } else {
                stack.push(site);
                System.out.println(site);
                queueForw.clear();
            }
site = reader.readLine();
        }
    }
}




