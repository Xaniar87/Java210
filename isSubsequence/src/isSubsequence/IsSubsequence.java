package isSubsequence;

public class IsSubsequence {
	public static void main (String[] args) {
		System.out.println(isSubsequence("computer","core"));
		System.out.println(isSubsequence("computer","cope"));
		System.out.println(isSubsequence("computer","computer"));
		System.out.println(isSubsequence("computer",""));
		System.out.println(isSubsequence("","computer"));
		System.out.println(isSubsequence("",""));



	}
	public static boolean isSubsequence(String str1, String str2) {
//		System.out.println(str1+" "+str2);
		if (str2.isEmpty()) {
			return true;
		}else if (str1.length()<str2.length()) {
			return false;
		} else {
			if (str1.indexOf(str2.charAt(0))!=-1) {
				return isSubsequence(str1.substring(str1.indexOf(str2.charAt(0))),str2.substring(1));
			}else {
				return false;
			}
		}

		
	}

}
