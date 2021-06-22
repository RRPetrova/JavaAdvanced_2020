package linearDataStructures;

import javax.swing.text.Element;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex_06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
boolean isBalanced = true;
        int open = 0;
        int closing = 0;
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")) {//  ()(()
                open++;
                if (open - closing >= 2) {
                    isBalanced = false;
                    break;
                }
            } else if (input.equals(")")) {
                closing++;
                if (closing > open) {
                    isBalanced = false;
                break;
                }
            }
        }

        if (open != closing) {
            isBalanced = false;
        }
        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }


    }

}
