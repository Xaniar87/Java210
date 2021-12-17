/*
 * Spend some time looking through this file to familiarize yourself
 * with some Java syntax.
 * 
 * You only need to make one small change to this file. You should NOT change
 * the other files. Please follow the instructions below.
 * 
 * 1. Run the provided tests to see how your code performs. To do so, right-click
 * on either the 'RunTests.java' file, or the 'Drill00TestClass.java' file in
 * your 'Package Explorer' sidebar on the left. It will provide many options, go
 * to the line that says 'Run As', then choose 'JUnit Test'. A box will pop up
 * telling you that you have 'Errors in the workspace'. You can either hit cancel,
 * or proceed. Click proceed. Now also in your left sidebar, you should see another
 * tab 'JUnit' with your test results like we saw in class. 
 * 
 * 2. You should now see a big red bar which indicates you did not pass all of
 * the tests. Expand the 'Drill00TestClass' portion to show which specific
 * testcases you had errors on. Then fix the error and rerun the tests until
 * you pass all of them!
 * 
 * 3. Once you can see all of the individual tests, you will find that a green
 * checkmark means you passed that test, a red box with an 'x' means that there
 * was an error (i.e. your program crashed or did not compile). What happens if
 * your program runs fine but the method gives you the wrong result? Change a
 * small part of any of the methods below to give you a blue box with 'x'.
 * 
 * 4. Change any errors/failures back so that all of your tests pass. Now you
 * can submit to Gradescope. Note that you made zero changes to 'RunTests.java'
 * or 'Drill00TestClass.java'. You ONLY changed 'Drill00.java'. So you only
 * need to submit the file 'Drill00.java' to Gradescope since we can use our own
 * copies of the other two files.
 */

public class Drill00 {

    /*
     * Return the given value incremented by one.
     * Note that there are no new lines with this function.
     * Brackets '{' and '}' decide how code is grouped, NOT
     * newlines and indentations. However, newlines and indentations
     * are important for readability.
     */
    static int addOne(int val) { return val + 1; }

    /* 
     * Return the maximum number between a and b.
     * In this function, an if statement is used. The condition provided 
     * MUST be in parentheses
     */
    static int max(int a, int b) {
        if (a > b) {
        	return a;
        } else {
        	return b;
        }
    }

    /* 
     * Return the sum of a and b.
     */
    static int sum2(int a, int b) {
        return a + b;
    }

    /* 
     * Return true if the input value is between 10 and 20, inclusive.
     * Here, a boolean is being returned. In Python, this would have used the
     * 'and' keyword, but in Java, the same behavior can be performed by using
     * '&&'. The same can be done for the 'or' keyword, by using '||'
     */
    static boolean range1(int a) {
        return (10 <= a && a <= 20);
    }

    /*
     * Return the absolute difference between two inputs.
     */
    static int absDiff(int a, int b) {
        int diff = a - b;
        if (diff >= 0) {
            return diff;
        } else {
            return -diff;
        }
    }

}
