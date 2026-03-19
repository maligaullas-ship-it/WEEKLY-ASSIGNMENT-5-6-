import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int[] digits = new int[count];
        int index = 0;

        temp = num;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        int[] freq = new int[10];

        for (int i = 0; i < count; i++) {
            int digit = digits[i];
            freq[digit]++;
        }

        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}