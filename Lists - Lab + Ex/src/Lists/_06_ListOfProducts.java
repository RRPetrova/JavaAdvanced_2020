package Lists;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _06_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> listOfProducts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listOfProducts.add(scanner.nextLine());
        }
        Collections.sort(listOfProducts);
        int num = 1;
        for (String product : listOfProducts) {
            System.out.println(num + "." + product);
            num++;
        }


    }
}
