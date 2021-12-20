import static org.junit.Assert.assertEquals;

import org.junit.Test;

// This is an annotation for assigning point values to tests


public class Drill03TestClass {

    @Test
    public void test_replaceAll_test1() {
        String x = Drill03.replaceAll("Merlin", 'e', 'a');
        System.out.println("replaceAll(Merlin,e,a), got " + x);
        assertEquals("Marlin", x);
    }

    @Test
    public void test_replaceAll_test2() {
        String x = Drill03.replaceAll("Merlin", 'q', 'a');
        System.out.println("replaceAll(Merlin,q,a), got " + x);
        assertEquals("Merlin", x);
    }

    @Test
    public void test_replaceAll_test3() {
        String x = Drill03.replaceAll("Purrcy", 'r', 'a');
        System.out.println("replaceAll(Purrcy,r,a), got " + x);
        assertEquals("Puaacy", x);
    }

    @Test
    public void test_replaceAll_test4() {
        String x = Drill03.replaceAll("Chester", 'e', 'm');
        System.out.println("replaceAll(Chester,e,m), got " + x);
        assertEquals("Chmstmr", x);
    }

    @Test
    public void test_replaceAll_test5() {
        String x = Drill03.replaceAll("ChEster", 'e', 'm');
        System.out.println("replaceAll(ChEster,e,m), got " + x);
        assertEquals("ChEstmr", x);
    }

    @Test
    public void test_digitsSorted_test1() {
        boolean x = Drill03.digitsSorted(0);
        System.out.println("digitsSorted(0), got " + x);
        assertEquals(true, x);
    }

    @Test
    public void test_digitsSorted_test2() {
        boolean x = Drill03.digitsSorted(234);
        System.out.println("digitsSorted(234), got " + x);
        assertEquals(true, x);
    }

    @Test
    public void test_digitsSorted_test3() {
        boolean x = Drill03.digitsSorted(-2345);
        System.out.println("digitsSorted(-2345), got " + x);
        assertEquals(true, x);
    }

    @Test
    public void test_digitsSorted_test4() {
        boolean x = Drill03.digitsSorted(22334455);
        System.out.println("digitsSorted(22334455), got " + x);
        assertEquals(true, x);
    }

    @Test
    public void test_digitsSorted_test5() {
        boolean x = Drill03.digitsSorted(-5);
        System.out.println("digitsSorted(-5), got " + x);
        assertEquals(true, x);
    }

    @Test
    public void test_digitsSorted_test6() {
        boolean x = Drill03.digitsSorted(4321);
        System.out.println("digitsSorted(4321), got " + x);
        assertEquals(false, x);
    }

    @Test
    public void test_digitsSorted_test7() {
        boolean x = Drill03.digitsSorted(24378);
        System.out.println("digitsSorted(24378), got " + x);
        assertEquals(false, x);
    }

    @Test
    public void test_digitsSorted_test8() {
        boolean x = Drill03.digitsSorted(21);
        System.out.println("digitsSorted(21), got " + x);
        assertEquals(false, x);
    }

    @Test
    public void test_digitsSorted_test9() {
        boolean x = Drill03.digitsSorted(-33331);
        System.out.println("digitsSorted(-33331), got " + x);
        assertEquals(false, x);
    }

    @Test
    public void test_digitsSorted_test10() {
        boolean x = Drill03.digitsSorted(-1233331);
        System.out.println("digitsSorted(-1233331), got " + x);
        assertEquals(false, x);
    }
    
    @Test
    public void test_removedac_test1() {
        String x = Drill03.removeAdjacentDuplicateChars("tattle");
        System.out.println("removeAdjacentDuplicateChars(\"tattle\"), got " + x);
        assertEquals("tatle", x);
    }
    
    @Test
    public void test_removedac_test2() {
        String x = Drill03.removeAdjacentDuplicateChars("testt");
        System.out.println("removeAdjacentDuplicateChars(\"testt\"), got " + x);
        assertEquals("test", x);
    }
    
    @Test
    public void test_removedac_test3() {
        String x = Drill03.removeAdjacentDuplicateChars("balloon");
        System.out.println("removeAdjacentDuplicateChars(\"balloon\"), got " + x);
        assertEquals("balon", x);
    }
    
    @Test
    public void test_removedac_test4() {
        String x = Drill03.removeAdjacentDuplicateChars("word");
        System.out.println("removeAdjacentDuplicateChars(\"word\"), got " + x);
        assertEquals("word", x);
    }
    
    @Test
    public void test_removedac_test5() {
        String x = Drill03.removeAdjacentDuplicateChars("");
        System.out.println("removeAdjacentDuplicateChars(\"\"), got " + x);
        assertEquals("", x);
    }
    
    @Test
    public void test_countOccurrences_test1() {
    	int[] array = { 0, 25, 25, 6, 72, 25};
        int x = Drill03.countOccurrences(array, 25);
        System.out.println("countOccurrences([0, 25, 25, 6, 72, 25], 25), got " + x);
        assertEquals(3, x);
    }
    
    @Test
    public void test_countOccurrences_test2() {
    	int[] array = { 0, 25, 25, 6, 72, 25};
        int x = Drill03.countOccurrences(array, 16);
        System.out.println("countOccurrences([0, 25, 25, 6, 72, 25], 16), got " + x);
        assertEquals(0, x);
    }
    
    @Test
    public void test_countOccurrences_test3() {
    	int[] array = { };
        int x = Drill03.countOccurrences(array, 25);
        System.out.println("countOccurrences([], 25), got " + x);
        assertEquals(0, x);
    }

}
