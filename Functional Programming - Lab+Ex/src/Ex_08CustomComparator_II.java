import java.util.*;

public class Ex_08CustomComparator_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> nums = new ArrayList<>();

        for (int s : array) {
            nums.add(s);
        }

        Comparator<Integer> sortOddEven = (f, s) -> {
            if ((f % 2 == 0) == (s % 2 == 0)) {
                return f.compareTo(s);
            } else if (f % 2 == 0) {
                return -1;
            } else {
                return 1;
            }
        };

        nums.sort(sortOddEven);
        System.out.println(String.join(" ", String.valueOf(nums)
                .replaceAll("\\[", "").replaceAll("]", "").replaceAll(",", "").trim()));

    }
}
