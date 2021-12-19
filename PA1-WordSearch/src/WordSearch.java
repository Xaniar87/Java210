import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordSearch {
    /*
     * This is how you declare constants in Java. You can now type
     * 'MIN_WORD_LENGTH' anywhere you want to refer to it.
     */
    private static final int MIN_WORD_LENGTH = 3;
    private static int row;
    private static int col;

    public static void main(String[] args) {
        // Remember, to access command-line arguments, you use args[0],
        // args[1],...
        // See CommandLine.java and Stdin.java in the Class Examples github for examples.
        try {
            Scanner grid = new Scanner(new File("TestCases/specExample.txt"));
            Scanner vocab = new Scanner(new File("TestCases/dictionary.txt"));
            Set<String> vocabSet = new HashSet<String>();
            while (vocab.hasNextLine()) {
                vocabSet.add(vocab.nextLine().toLowerCase());
            }
            int count = 0;
            while (grid.hasNextLine() && count < 2) { // this while loop only
                                                      // reads first two rows!!!
                String line = grid.nextLine();
                if (count == 0) {
                    row = Integer.valueOf(line);
                    count++;
                } else if (count == 1) {
                    col = Integer.valueOf(line);
                    count++;
                }
            }
            String[][] gridArr=new String[row][col];
            count = 0;
            while (grid.hasNextLine()) {
                String line = grid.nextLine();
                gridArr[count] = line.split(" ");
                count++;
            }
            for (int istart = 0; istart < col; istart++) {
                for (int jstart = 0; jstart < row; jstart++) {
                    if (col - jstart >= MIN_WORD_LENGTH) {
                        for (int lengthVertical = MIN_WORD_LENGTH; lengthVertical < col
                                - jstart + 1; lengthVertical++) {
                            String str = "";
                            String reverse = "";
                            for (int k = 0; k < lengthVertical; k++) {
                                str += gridArr[istart][jstart + k];
                                reverse = gridArr[istart][jstart + k] + reverse;

                            }
                            if (vocabSet.contains(str.toLowerCase())) {
                                System.out.println("L to R: " + str);
                            }
                            if (vocabSet.contains(reverse.toLowerCase())) {
                                System.out.println("R to L: " + reverse);
                            }

                        }
                    }
                    if (row - istart >= MIN_WORD_LENGTH) {
                        for (int lengthHorizental = MIN_WORD_LENGTH; lengthHorizental < row
                                - istart + 1; lengthHorizental++) {
                            String str = "";
                            String reverse = "";
                            for (int k = 0; k < lengthHorizental; k++) {
                                str += gridArr[istart + k][jstart];
                                reverse = gridArr[istart + k][jstart] + reverse;

                            }
                            if (vocabSet.contains(str.toLowerCase())) {
                                System.out.println("T to D: " + str);
                            }
                            if (vocabSet.contains(reverse.toLowerCase())) {
                                System.out.println("D to T: " + reverse);
                            }

                        }
                    }

                }
            }

            grid.close();// closing files
            vocab.close();// closing files


        } catch (Exception IOException) {
            System.out.println(
                    "file IOException occured, plase take care of it");
        }
    }

}
