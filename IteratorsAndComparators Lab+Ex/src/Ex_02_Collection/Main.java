package Ex_02_Collection;

import javax.naming.OperationNotSupportedException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");
        String[] elem = new String[input.length - 1];

        for (int i = 1; i < input.length; i++) {
            elem[i - 1] = input[i];
        }
        ListyIterator02<String> lIter = new ListyIterator02<>(elem);

        String cmd = reader.readLine();
        while (!cmd.equals("END")) {
            switch (cmd) {
                case "Move":
                    System.out.println(lIter.move());
                    break;
                case "Print":
                    try {
                        lIter.print();
                    } catch (OperationNotSupportedException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "HasNext":
                    System.out.println(lIter.hasNext());
                    break;
                case "PrintAll":
                    lIter.printAll();
                    break;
            }
            cmd = reader.readLine();
        }


    }
}
