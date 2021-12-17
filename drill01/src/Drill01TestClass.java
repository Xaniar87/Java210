import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

// This is an annotation for assigning point values to tests


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Drill01TestClass {
	
	/* -------- Arrays -------- */
	
    @Test
    public void test_arrayGetElementAtIndex_test1() {
        int[] array = { 45, 23, -106, 32, 67 };
        int actual = Drill01.getElementAtIndex(2, array);
        System.out.println("getElementAtIndex(2, [45,23,-106,32,67]), got " + actual);
        assertEquals(-106, actual);
    }
    
    @Test
    public void test_arrayGetElementAtIndex_test2() {
        int[] array = { 45, 23, -106, 32, 67 };
        int actual = Drill01.getElementAtIndex(5, array);
        System.out.println("getElementAtIndex(5, [45,23,-106,32,67]), got " + actual);
        assertEquals(-1, actual);
    }
    
    @Test
    public void test_arraySumValues_test1() {
        int[] array = { };
        int actual = Drill01.sumValues(array);
        System.out.println("sumValues([]), got " + actual);
        assertEquals(0, actual);
    }
    
    @Test
    public void test_arraySumValues_test2() {
        int[] array = { 45, 23, -106, 32, 67 };
        int actual = Drill01.sumValues(array);
        System.out.println("sumValues([45,23,-106,32,67]), got " + actual);
        assertEquals(61, actual);
    }
    
    @Test
    public void test_arrayDoubleElements_test1() {
    	int[] array = { 1, 2, 3, 4, 5 };
    	int[] expected = { 2, 4, 6, 8, 10 };
    	int[] actual = Drill01.doubleElements(array);
        System.out.println("doubleElements([1,2,3,4,5]), got " + Arrays.toString(actual));
    	assertNotEquals("Return a *new* array", array, actual);
    	assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
    
    @Test
    public void test_arrayDoubleElements_test2() {
    	int[] array = { -10, -5, 0, 9001 };
    	int[] expected = { -20, -10, 0, 18002 };
    	int[] actual = Drill01.doubleElements(array);
        System.out.println("doubleElements([-10,-5,0,9001]), got " + Arrays.toString(actual));
    	assertNotEquals("Return a *new* array", array, actual);
    	assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
    
	/* -------- Lists -------- */
    
    @Test
    public void test_listGetElementAtIndex_test1() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 2, 1, 7));
        int actual = Drill01.getElementAtIndex(3, list);
        System.out.println("getElementAtIndex(3, [3,2,1,7]), got " + actual);
        assertEquals(7, actual);
    }
    
    @Test
    public void test_listGetElementAtIndex_test2() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 2, 1, 7));
        int actual = Drill01.getElementAtIndex(23, list);
        System.out.println("getElementAtIndex(23, [3,2,1,7]), got " + actual);
        assertEquals(-1, actual);
    }
    
    @Test
    public void test_listSumValues_test1() {
        List<Integer> list = new ArrayList<>(Arrays.asList());
        int actual = Drill01.sumValues(list);
        System.out.println("sumValues([]), got " + actual);
        assertEquals(0, actual);
    }
    
    @Test
    public void test_listSumValues_test2() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 2, 1, 7));
        int actual = Drill01.sumValues(list);
        System.out.println("sumValues([3,2,1,7]), got " + actual);
        assertEquals(13, actual);
    }
    
    @Test
    public void test_listDoubleElements_test1() {
    	List<Integer> list = new ArrayList<>(Arrays.asList(9, 1, 2, 1, 0));
    	List<Integer> expected = new ArrayList<>(Arrays.asList(18, 2, 4, 2, 0));
    	List<Integer> actual = Drill01.doubleElements(list);
        System.out.println("doubleElements([9,1,2,1,0]), got " + actual);
    	assertNotEquals("Return a *new* list", list, actual);
    	assertEquals(expected, actual);
    }
    
    @Test
    public void test_listDoubleElements_test2() {
    	List<Integer> list = new ArrayList<>(Arrays.asList(8, 5, 7, 2, 1));
    	List<Integer> expected = new ArrayList<>(Arrays.asList(16, 10, 14, 4, 2));
    	List<Integer> actual = Drill01.doubleElements(list);
        System.out.println("doubleElements([8,5,7,2,1]), got " + actual);
    	assertNotEquals("Return a *new* list", list, actual);
    	assertEquals(expected, actual);
    }
    
	/* -------- Sets -------- */

    @Test
    public void test_setContains_test1() {
        Set<Integer> set = new HashSet<>(Arrays.asList(3, 2, 1, 3));
        boolean actual = Drill01.setContains(set, 0);
        System.out.println("setContains([3,2,1,3], 0), got " + actual);
        assertEquals(false, actual);
    }

    @Test
    public void test_setContains_test2() {
        Set<Integer> set = new HashSet<>(Arrays.asList(0, 3, 42, 1, 7, 42));
        boolean actual = Drill01.setContains(set, 42);
        System.out.println("setContains([0,3,42,1,7,42], 42), got " + actual);
        assertEquals(true, actual);
    }
    
    @Test
    public void test_setIntersection_test1() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> actual = Drill01.setIntersection(set1, set2);
        System.out.println("setIntersection([1,2,3,4], [1,2,3,4,5]), got " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test_setIntersection_test2() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2,4,6,8));
        Set<Integer> expected = new HashSet<>(Arrays.asList(2,4));
        Set<Integer> actual = Drill01.setIntersection(set1, set2);
        System.out.println("setIntersection([1,2,3,4], [2,4,6,8]), got " + actual);
        assertEquals(expected, actual);
    }

	/*  -------- HashMaps -------- */
    
    @Test
    public void test_characterCount_test1() {
        String word = "test";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('t', 2);
        expected.put('e', 1);
        expected.put('s', 1);
        Map<Character, Integer> actual = Drill01.characterCount(word);
        System.out.println("characterCount(\"test\"), got " + actual);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_characterCount_test2() {
        String word = "mississippi";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('m', 1);
        expected.put('i', 4);
        expected.put('s', 4);
        expected.put('p', 2);
        Map<Character, Integer> actual = Drill01.characterCount(word);
        System.out.println("characterCount(\"mississippi\"), got " + actual);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_largestPopulation_test1() {
    	Map<String, Integer> map = new HashMap<>();
    	map.put("Tucson", 545975);
    	map.put("Flagstaff", 74964);
    	map.put("Bisbee", 5209);
    	map.put("Phoenix", 1660000);
    	map.put("Sedona", 10335);
    	String expected = "Phoenix";
    	String actual = Drill01.largestPopulation(map);
    	assertEquals(expected, actual);
    }
    
    @Test
    public void test_largestPopulation_test2() {
    	Map<String, Integer> map = new HashMap<>();
    	String expected = "";
    	String actual = Drill01.largestPopulation(map);
    	assertEquals(expected, actual);
    }
     
}
