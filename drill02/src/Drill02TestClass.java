import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

import org.junit.Test;

// This is an annotation for assigning point values to tests


public class Drill02TestClass {

	@Test
	public void test_reversestack_test1() {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		Stack<Integer> newStack = Drill02.reverseStack(stack);
//		System.out.println("reverseStack([1, 2, 3, 4, 5, 6, 7, 8, 9]) got " + newStack);
		int curr;
		for (int i = 0; i < 10; i++) {
			assertEquals(i, (int)newStack.pop());
		}

	}

	@Test
	public void test_reversestack_test2() {
		Stack<Integer> stack = new Stack<>();

		Stack<Integer> newStack = Drill02.reverseStack(stack);

		assertEquals(0, newStack.size());
	}

	@Test
	public void test_reverseQueue_test1() {
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			queue.add(i);
		}

		Queue<Integer> newQueue = Drill02.reverseQueue(queue);

		for (int i = 9; i >= 0; i--) {
			assertEquals(i, (int)newQueue.poll());
		}
	}    

	@Test
	public void test_reverseQueue_test2() {
		Queue<Integer> queue = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		Random rand = new Random();
		int curr;
		for (int i = 0; i < 10; i++) {
			curr = rand.nextInt(100);
			queue.add(curr);
			stack.push(curr);
		}

		Queue<Integer> newQueue = Drill02.reverseQueue(queue);

		while(!newQueue.isEmpty()) {
			assertEquals((int)stack.pop(), (int)newQueue.poll());
		}
	}  

	@Test
	public void test_zigzag_test1() {
		String x = Drill02.zigzag(1);
		System.out.println("zigzag(1), got " + x);
		assertEquals("*", x);
	}

	@Test
	public void test_zigzag_test2() {
		String x = Drill02.zigzag(2);
		System.out.println("zigzag(2), got " + x);
		assertEquals("**", x);
	}

	@Test
	public void test_zigzag_test3() {
		String x = Drill02.zigzag(3);
		System.out.println("zigzag(3), got " + x);
		assertEquals("<*>", x);
	}

	@Test
	public void test_zigzag_test4() {
		String x = Drill02.zigzag(4);
		System.out.println("zigzag(4), got " + x);
		assertEquals("<**>", x);
	}

	@Test
	public void test_zigzag_test5() {
		String x = Drill02.zigzag(5);
		System.out.println("zigzag(5), got " + x);
		assertEquals("<<*>>", x);
	}

	@Test
	public void test_zigzag_test6() {
		String x = Drill02.zigzag(6);
		System.out.println("zigzag(6), got " + x);
		assertEquals("<<**>>", x);
	}

	@Test
	public void test_zigzag_test7() {
		String x = Drill02.zigzag(7);
		System.out.println("zigzag(7), got " + x);
		assertEquals("<<<*>>>", x);
	}

	@Test
	public void test_zigzag_test8() {
		String x = Drill02.zigzag(8);
		System.out.println("zigzag(8), got " + x);
		assertEquals("<<<**>>>", x);
	}

	@Test
	public void test_zigzag_test9() {
		String x = Drill02.zigzag(9);
		System.out.println("zigzag(9), got " + x);
		assertEquals("<<<<*>>>>", x);
	}

	@Test
	public void test_zigzag_test10() {
		String x = Drill02.zigzag(10);
		System.out.println("zigzag(10), got " + x);
		assertEquals("<<<<**>>>>", x);
	}

	@Test
	public void test_moveToEnd_test1() {
		String x = Drill02.moveToEnd("hello", 'l');
		System.out.println("moveToEnd(hello,l), got " + x);
		assertEquals("heoLL", x);
	}

	@Test
	public void test_moveToEnd_test2() {
		String x = Drill02.moveToEnd("hello", 'e');
		System.out.println("moveToEnd(hello,e), got " + x);
		assertEquals("hlloE", x);
	}

	@Test
	public void test_moveToEnd_test3() {
		String x = Drill02.moveToEnd("hello there", 'e');
		System.out.println("moveToEnd(hello there,e), got " + x);
		assertEquals("hllo thrEEE", x);
	}

	@Test
	public void test_moveToEnd_test4() {
		String x = Drill02.moveToEnd("hello there", 'q');
		System.out.println("moveToEnd(hello there,q), got " + x);
		assertEquals("hello there", x);
	}

	@Test
	public void test_moveToEnd_test5() {
		String x = Drill02.moveToEnd("HELLO there", 'e');
		System.out.println(
				"moveToEnd(HELLO there,e), got " + x);
		assertEquals("HLLO thrEEE", x);
	}

	@Test
	public void test_moveToEnd_test6() {
		String x = Drill02.moveToEnd("HHH", 'H');
		System.out.println(
				"moveToEnd(HHH,H), got " + x);
		assertEquals("HHH", x);
	}

	@Test
	public void test_moveToEnd_test7() {
		String x = Drill02.moveToEnd("hahahaha", 'h');
		System.out.println(
				"moveToEnd(hahahaha,h), got " + x);
		assertEquals("aaaaHHHH", x);
	}

}
