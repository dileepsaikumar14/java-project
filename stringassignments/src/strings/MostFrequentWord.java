package strings;

import java.util.Scanner;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        int maxCount = 0;
        String mostFrequent = "";

        for (int i = 0; i < words.length; i++) {
            int count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = words[i];
            }
        }

        System.out.println("Most frequent word: " + mostFrequent);
        System.out.println("Frequency: " + maxCount);

        scanner.close();
    }
}
