import java.util.ArrayList;

public class DiceRoll {
	private static int calls=0;

	public static void main(String[] args) {
//		DiceRoll(2);
		DiceSum(3,5);
	}
	
	public static void DiceRoll(int numDice) {
		
		diceRollHelper(numDice, new ArrayList<Integer>());
		System.out.println(calls);

	}
	
	private static void diceRollHelper(int numDice, ArrayList<Integer> arr) {
		calls++;

		if(numDice==0) {
			
			System.out.println(arr);
			
		}else {			
			for (int i=1;i<7;i++) {
				arr.add(i);
				diceRollHelper(numDice-1,arr);
				arr.remove(arr.size()-1);
			}
			
		}
		
	}
	
	public static void DiceSum(int numDice, int s) {
		diceSumHelper(numDice,new ArrayList<Integer>(), s);
		System.out.println(calls);
	}
	private static void diceSumHelper(int numDice, ArrayList<Integer> arr, int s) {
		calls++;
		if(numDice==0) {
			if(s==0) {
			
				System.out.println(arr);
			}
			
		}else if(numDice<=s && numDice*6>=s){			
			for (int i=1;i<7;i++) {
				arr.add(i);
				diceSumHelper(numDice-1,arr,s-i);
				arr.remove(arr.size()-1);
			}
			
		}
		
	}
	

}
