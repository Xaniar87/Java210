import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Drill02 {
	
	// -------- Stacks/Queues

	// Given a stack as input, return a stack that has the
	// same values in reverse order.
	static Stack<Integer> reverseStack(Stack<Integer> in) {
		Stack<Integer> newStack=new Stack<Integer>();
		while (!in.empty()) {
			Integer ele=in.peek();
			in.pop();
			newStack.add(ele);
		}
		return newStack;
	}

	// Given a queue, return a new queue that has the
	// same values in reverse order
	static Queue<Integer> reverseQueue(Queue<Integer> in) {
		Stack<Integer> stack=new Stack<>();
		while(!in.isEmpty()) {
			stack.push(in.peek());
			in.remove();
		}
		while(!stack.empty()) {
			in.add(stack.peek());
			stack.pop();
		}	
		return in;
	}
	
	
	// -------- Recursion

    // takes a number of characters to print as a parameter
    // returns a string with one or two asterisks in the middle
    // surrounded by alligators
	// See the README
    public static String zigzag(int n) {
    	if (n<3) {
    		if (n<2) {
    			return "*";
    		} else {
    			return "**";
    		}
    	} else {
    		return "<"+zigzag(n-2)+">";
    	}
    }

    // takes a string and a character as parameters and returns 
    // the string with all copies of the character moved to the 
    // end and capitalized
    // See the README
    public static String moveToEnd(String s, char c) {
    	c=Character.toLowerCase(c);
//    	s=s.toLowerCase();
    	if(s.indexOf(c)<0) {
    		return s;
    	}else {
//    		char ch=c;
    		System.out.println("here "+ c);
    		return moveToEnd(s.substring(0, s.toLowerCase().indexOf(c))+s.substring(s.toLowerCase().indexOf(c)+1),c)+Character.toUpperCase(c);

    	}
    }
//    public static String moveToEnd(String s, char c) {
//    	int ind=s.indexOf(c);
//    	String suff=s.substring(ind);
//    	String allChar= new String(new char[suff.length()]).replace("\0", ""+c);
//    	System.out.println(suff+" "+ allChar);
//    	if (suff.equals(allChar)) {
//    		return s;
//    	}else {
//    		
//    	}
//    	return "";
//    }

}
