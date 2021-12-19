
public class LargestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largestDigit(8342116));
		System.out.println(largestDigit(40109));
		System.out.println(largestDigit(-163505));
	}
	public static int largestDigit(int n) {
		if (n<0) {
			n=n*-1;
		}
		if(n<10) {
			return n;
		}
		else {
			return Math.max(n%10, largestDigit(n/10));	
		}
	}

//	Second Approach (it works fine too)
//	public static int largestDigit(int n) {
//		if (n<0) {
//			n=n*-1;
//		}
//		if(n<100) {
//			if (n/10>n%10) {
//				return n/10;
//			}else {
//				return n%10;
//			}
//		}
//		else {
//			int m=n/100;
//			int twoDigit=n%100;
//			if (twoDigit/10>twoDigit%10) {
//				return largestDigit(m*10+twoDigit/10);
//			}else {
//				return largestDigit(m*10+twoDigit%10);
//			}	
//		}
//	}
	

}
