package isPalindrome;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("isP: "+isPal("racecar"));
		System.out.println("isP: "+isPal("step on no pets"));
		System.out.println("isP: "+isPal("java"));
		System.out.println("isP: "+isPal("byebye"));


	}
	
	public static boolean isPal(String str) {
		if (str.length()<2) {
			return true;
		}
			return (str.charAt(0)==str.charAt(str.length()-1) && isPal(str.substring(1, str.length()-1)));	
	}

}
