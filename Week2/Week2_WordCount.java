package Week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Week2_WordCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String sentence = scanner.nextLine();
        scanner.close();
        WordFrequency(sentence);
    }

    public static void WordFrequency(String sentence){

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : sentence.split("\\W+")) {
            word = word.toLowerCase();
            if (!word.isEmpty()) {
                if (wordCounts.containsKey(word)) {
                    wordCounts.put(word, wordCounts.get(word) + 1);
                } else {
                    wordCounts.put(word, 1);
                }
            }
        }

        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
