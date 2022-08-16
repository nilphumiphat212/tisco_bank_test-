import java.util.Arrays;
import java.time.LocalDate;
import java.time.Year;

public class main {
    public static void main(String[] args) {
        // ข้อ a
        getMinAndMax();

        // ข้อ b (success case)
        subStringWith2Digit("abcdefg");
        // ข้อ b (fail case)
        subStringWith2Digit("cd");

        // ข้อ c
        getEndOfMonthFeb2021();

        // ข้อ d (เลขคู่)
        d(2);
        // ข้อ d (เลขคี่)
        d(1);
    }

    // ข้อ a
    private static void getMinAndMax() {
        String[] noStr = {"20", "21", "12", "45", "1", "34"};
        int[] intList = Arrays.stream(noStr).mapToInt(Integer::parseInt).toArray();
        System.out.println("Min: " + getMin(intList));
        System.out.println("Max: " + getMax(intList));
    }

    // ข้อ a (min)
    private static int getMin(int[] items) {
        return Arrays.stream(items).min().getAsInt();
    }

    // ข้อ a (max)
    private static int getMax(int[] items) {
        return Arrays.stream(items).max().getAsInt();
    }

    // ข้อ b
    private static void subStringWith2Digit(String str) {
        if (str.length() < 2) {
            System.out.println("Can't substring");
            return;
        }
        System.out.println("Substring: " + str.substring(str.length() - 2));
    }

    // ข้อ c
    private static void getEndOfMonthFeb2021() {
        System.out.println("End of month (Feb'2021): " + LocalDate.of(2021, 2, 1).getMonth().length(Year.of(2021).isLeap()));
    }

    // ข้อ d
    private static void d(int number) {
        try {
            if (number % 2 == 0) {
                System.out.println("Waiting 15s...");
                Thread.sleep(15000);
            } else {
                System.out.println("Waiting 5s...");
                Thread.sleep(5000);
            }
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
