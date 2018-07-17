import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    private Map<String, Integer> wordCount = new HashMap<String, Integer>();
    private File file;

    public WordFrequency(String filePath) {
        this.file = new File(filePath);
    }

    public void populateWordCountMap() {
        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String next = sc.next().toLowerCase();

                if (!wordCount.containsKey(next)) {
                    wordCount.put(next, 1);
                } else {
                    wordCount.put(next, wordCount.get(next) + 1);
                }
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found");
        }
    }

    public void displayValues() {
        for (String key : wordCount.keySet()) {
            System.out.println(key + " - " + wordCount.get(key));
        }
    }

    public static void main(String[] args) {
        WordFrequency wf = new WordFrequency("/home/kartikey/Desktop/java-exercises/Exercise 2/Q9/FileDemo");
        wf.populateWordCountMap();
        wf.displayValues();
    }
}
