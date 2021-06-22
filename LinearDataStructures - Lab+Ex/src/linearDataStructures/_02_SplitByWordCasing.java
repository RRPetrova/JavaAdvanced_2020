package linearDataStructures;
import java.util.*;

public class _02_SplitByWordCasing  {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("[\\,\\;\\:\\.\\!\\(\\)\\\"\\'\\\\\\/\\[ \\] ]+");

        List<String> lowerCase = new ArrayList<>();
        List<String> upperCase = new ArrayList<>();
        List<String> mixedCase = new ArrayList<>();

        for (String words : text) {
            boolean isLower = false;
            boolean isUpper = false;
            if (!words.isEmpty()) {
                for (int i = 0; i < words.length(); i++) {
                    if (Character.isLowerCase(words.charAt(i))) {
                        isLower = true;
                    } else if (Character.isUpperCase(words.charAt(i))) {
                        isUpper = true;
                    } else {
                        isLower = false;
                        isUpper = false;
                        break;
                    }
                }
                if (isLower && !isUpper) {
                    lowerCase.add(words);
                } else if (!isLower && isUpper) {
                    upperCase.add(words);
                } else {
                    mixedCase.add(words);
                }
            }
        }
        if (!lowerCase.isEmpty()) {
            System.out.println(String.format("Lower-case: %s", String.join(", ", lowerCase)));
        }
        if (!mixedCase.isEmpty()) {
            System.out.println(String.format("Mixed-case: %s", String.join(", ", mixedCase)));
        }
        if (!upperCase.isEmpty()) {
            System.out.println(String.format("Upper-case: %s", String.join(", ", upperCase)));
        }


    }
}
