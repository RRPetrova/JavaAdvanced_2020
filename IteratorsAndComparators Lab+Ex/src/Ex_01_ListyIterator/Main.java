import Ex_02_Collection.ListyIterator02;

import javax.naming.OperationNotSupportedException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[] create = reader.readLine().split("\\s+");
        ListyIterator02<String> lI = new ListyIterator02<>();
        if (create.length == 1) {
            lI = new ListyIterator02<>();
        } else {
            String[] elem = new String[create.length-1];
            for (int i = 1; i < create.length; i++) {
                elem[i-1] = create[i];
            }
            lI = new ListyIterator02<>(elem);
        }
        String cmd = reader.readLine();

        while (!cmd.equals("END")) {

            switch (cmd) {
                case "Move":
                    System.out.println(lI.move());
                    break;
                case "Print":
                    try {
                        lI.print();
                    } catch (OperationNotSupportedException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "HasNext":
                    System.out.println(lI.hasNext());
                    break;

            }
            cmd = reader.readLine();
        }
    }
}
