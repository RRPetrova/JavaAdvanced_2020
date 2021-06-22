package lab_05_printer_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String cmd = reader.readLine();

        ArrayDeque<String> printer = new ArrayDeque<>();
        while (!cmd.equals("print")) {
            if (cmd.equals("cancel")) {
                if (printer.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printer.remove());
                }
            } else {
                printer.offer(cmd);
            }
            cmd = reader.readLine();
        }

        while (!printer.isEmpty()) {
            System.out.println(printer.pop());
        }
    }
}
