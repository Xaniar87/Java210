/*
 * This file will hold all of your testcases. Remember, to run all
 * of your tests, right-click on 'RunTests.java' and select 'Run As' ->
 * JUnit Test.
 */
import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;

public class RecursionTestClass {
	
	/*
	 * Here I have provided an example of one of the tests that I
	 * would write. For each of your tests, leave a brief comment
	 * above the test specifying its purpose. For example, for this
	 * test, I might write, "indexOf_test1 tests when s2 is not a 
	 * substring of s1. This should return -1."
	 */
//    @Test
//    public void test_indexOf_test1() {
//        int result = Recursion.indexOf("Helloooooo", "elo");
//        System.out.println("indexOf(Helloooooo, elo), got " + result);
//        assertEquals(-1, result);
//    }
//    @Test
//    public void test_indexOf_test2() {
//        int result = Recursion.indexOf("Hello", "World");
//        System.out.println("indexOf(Hello, World), got " + result);
//        assertEquals(-1, result);
//    }
//    @Test
//    public void test_indexOf_test3() {
//        int result = Recursion.indexOf("Hello", "lo");
//        System.out.println("indexOf(Hello, lo), got " + result);
//        assertEquals(3, result);
//    }
//    
//    @Test
//    public void test_indexOf_test4() {
//        int result = Recursion.indexOf("Hello", "o");
//        System.out.println("indexOf(Hello, o), got " + result);
//        assertEquals(4, result);
//    }
//    
//    @Test
//    public void test_removeEvenNumbers_test1() {
//    	Stack<Integer> stack=new Stack<>();
//    	stack.push(1);
//    	stack.push(2);
//    	stack.push(3);
//    	stack.push(4);
//    	stack.push(5);
//    	int k=4;
//        int result = Recursion.removeEvenNumbers(stack, k);
//        System.out.println("[1,2,3,4,5], got " + result);
//        assertEquals(2, result);
//    }
//    
//    
//    @Test
//    public void test_removeEvenNumbers_test2() {
//    	Stack<Integer> stack=new Stack<>();
//    	stack.push(1);
//    	stack.push(3);
//    	stack.push(5);
//    	int k=4;
//        int result = Recursion.removeEvenNumbers(stack, k);
//        System.out.println("[1,2,3,4,5], got " + result);
//        assertEquals(0, result);
//    }
//    
//    
//    
//    @Test
//    public void test_removeEvenNumbers_test3() {
//    	Stack<Integer> stack=new Stack<>();
//    	stack.push(1);
//    	stack.push(2);
//    	stack.push(3);
//    	stack.push(4);
//    	stack.push(5);
//    	int k=1;
//        int result = Recursion.removeEvenNumbers(stack, k);
//        System.out.println("[1,2,3,4,5], got " + result);
//        assertEquals(k, result);
//    }
//    @Test
//    public void test_removeEvenNumbers_test4() {
//    	Stack<Integer> stack=new Stack<>();
//    	
//    	int k=1;
//        int result = Recursion.removeEvenNumbers(stack, k);
//        System.out.println("[1,2,3,4,5], got " + result);
//        assertEquals(0, result);
//    }
//    
//    @Test
//    public void test_evenDigits_test4() {
//        int result = Recursion.evenDigits(-135);
//        System.out.println("evenDigits(1234) got " + result);
//        assertEquals(0, result);
//    }
//    
//    @Test
//    public void test_repeatStack_test4() {
//    	Stack<Integer> stack=new Stack<>();
//    	stack.push(1);
//    	stack.push(2);
//    	stack.push(3);
//    	stack.push(4);
//    	stack.push(5);
//        Recursion.repeatStack(stack);
//        System.out.println("repeatStack(1234) got " + stack);
////        assertEquals(0, result);
//    }
//    @Test
//    public void test_doubleElements_test1() {
//    	Queue<Integer> q=new LinkedList<>();
//    	q.add(1);
//    	q.add(2);
//    	q.add(3);
//    	q.add(4);
//    	q.add(5);
//        Recursion.doubleElements(q);
//        System.out.println("doubleElements[1,2,3,4,5] got " + q);
////        assertEquals(0, result);
//    }
//    @Test
//    public void test_doubleElements_test2() {
//    	Queue<Integer> q=new LinkedList<>();
//  
//        Recursion.doubleElements(q);
//        System.out.println("doubleElements[] got " + q);
////        assertEquals(0, result);
//    }
//    @Test
//    public void test_doubleElements_test3() {
//    	Queue<Integer> q=new LinkedList<>();
//    	q.add(-1);
//    	q.add(-2);
//    	q.add(-3);
//    	q.add(-4);
//    	q.add(-5);
//  
//        Recursion.doubleElements(q);
//        System.out.println("doubleElements[-1,-2,-3,-4,-5] got " + q);
////        assertEquals(0, result);
//    }
    
    
    @Test
    public void test_evaluate_test1() {
    	Queue<Character> q=new LinkedList<>();
    	q.add('(');
    	q.add('(');
    	q.add('2');
    	q.add('+');
    	q.add('3');
    	q.add(')');
    	q.add('+');
    	q.add('(');
    	q.add('7');
    	q.add('+');
    	q.add('8');
    	q.add(')');
    	q.add(')');
        int res=Recursion.evaluate(q);
        System.out.println("evaluate((2+3)) got " +res+"    "+ q);
//        assertEquals(0, result);
    }
}
