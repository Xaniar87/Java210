import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DO NOT TOUCH THIS FILE
 *
 * This program takes a CSV file with quoted fields and removes the quotes,
 * remove the commas within the quotes, and removes any newlines in the quotes.
 * Does NOT take care of two quotes in a row inside quotes.
 *
 * usage:
 * java ScrubCSVFile PublicTestCases/job_skills.csv
 * 
 * The above will generate a file called PublicTestCases/job_skills_clean.csv.
 * 
 * reference:
 * https://www.thoughtco.com/how-to-read-and-write-byte-streams-2033914
 */
public class ScrubCSVFile {
    static final int COMMA_ASCII = 0x2C;
    static final int QUOTE_ASCII = 0x22;
    static final int CR_ASCII = 0x0d;
    static final int LF_ASCII = 0x0a;

    enum State {
        NORMAL, IN_QUOTES
    };

    public static void main(String[] args) {
        checkUsage(args);

        // read and write out bytes
        try (FileInputStream in = new FileInputStream(args[0]);
                FileOutputStream out = new FileOutputStream(
                        outfileName(args))) {
            
            int data;
            State curr_state = State.NORMAL;
            while ((data = in.read()) != -1) {
                if (curr_state == State.NORMAL && data == QUOTE_ASCII) {
                    curr_state = State.IN_QUOTES;
                }
                else if (curr_state == State.IN_QUOTES && data == QUOTE_ASCII) {
                    curr_state = State.NORMAL;
                }
                else if (curr_state == State.IN_QUOTES && (data == COMMA_ASCII
                        || data == CR_ASCII || data == LF_ASCII)) {
                    // Not changing state or outputting character
                } else {
                    out.write(data);
                }
            }
        } catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
        }
    }

    // Checking for proper number of command line args
    public static void checkUsage(String[] args) {
        if (args.length < 1) {
            System.err.println(
                    "Input filename must be provided " + "on command line.");
            System.exit(1);
        }
    }

    // Create an output file name with _clean in it.
    public static String outfileName(String[] args) {
        String[] filePathParts = (args[0]).split("\\.");
        String filePath = filePathParts[0];
        String fileExt = filePathParts[1];
        return filePath + "_clean." + fileExt;
    }
}
