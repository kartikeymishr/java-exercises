import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Map<String, Integer> wordCounts = new HashMap<String, Integer>();

        try {
            Scanner scanner = new Scanner(new File("/home/kartikey/Desktop/java-exercises/Exercise 2/Q9/FileDemo"));

            while (scanner.hasNext()) {
                String next = scanner.next().toLowerCase();

                if (!wordCounts.containsKey(next)) {
                    wordCounts.put(next, 1);
                } else {
                    wordCounts.put(next, wordCounts.get(next) + 1);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found");
        }

        for (String key : wordCounts.keySet()) {
            System.out.println(key + " - " + wordCounts.get(key));
        }
    }
}
