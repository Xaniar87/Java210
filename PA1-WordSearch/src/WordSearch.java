import java.io.File;
import java.util.Scanner;

public class WordSearch {
    /*
     * This is how you declare constants in Java. You can now type
     * 'MIN_WORD_LENGTH' anywhere you want to refer to it.
     */
    private static final int MIN_WORD_LENGTH = 3;

    public static void main(String[] args) {
        // Remember, to access command-line arguments, you use args[0],
        // args[1],...
        // See CommandLine.java and Stdin.java in the Class Examples github for examples.
        try {
            Scanner grid = new Scanner(new File("TestCases/specExample.txt"));
            Scanner vocab = new Scanner(new File("TestCases/dictionary.txt"));
            while (grid.hasNextLine()) {
                String line = grid.nextLine();
                System.out.println(line);
            }
            while (vocab.hasNextLine()) {
                String word = vocab.nextLine();
                System.out.println(word);

            }
        } catch (Exception IOException) {
            System.out.println(
                    "grid file IOException occured, plase take care of it");
        }
    }

}
