import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Drill01 {
	
	/* -------- Arrays -------- */
	
	/*
	 * Return the item at the index specified by the 
	 * parameter 'index'. Only do this if 'index' exists
	 * in your array. i.e. first check to make sure the
	 * array is big enough to contain such an index. If
	 * the array does not contain this index, return -1.
	 */
	static int getElementAtIndex(int index, int[] array) {
		// TODO: Implement the getElementAtIndex method
		if (index<array.length) {
			return array[index];
		}else {
			return -1;
		}
	}
	
	/*
	 * Return the sum of all the values in the given array.
	 */
	static int sumValues(int[] array) {
		// TODO: Implement the sumValues method
		int sum=0;
		if (array.length>0) {
			for(int i=0;i<array.length;i++) {
				sum+=array[i];
			}
		}
		return sum;
	}
	
	/*
	 * Return a new array that doubles every element in the 
	 * given array.
	 */
	static int[] doubleElements(int[] array) {
		// TODO: Implement the doubleElements method
		int[] newArr = new int[array.length];
		if(array.length>0) {
			for (int i=0; i<array.length; i++) {
				newArr[i]=array[i]*2;
			}
		}
		return newArr;	
	}
	
	/* -------- Lists -------- */
	
	/*
	 * Return the item at the index specified by the 
	 * parameter 'index'. Only do this if 'index' exists
	 * in your list. i.e. first check to make sure the
	 * list is big enough to contain such an index. If
	 * the list does not contain this index, return -1.
	 */
	static int getElementAtIndex(int index, List<Integer> list) {
		// TODO: Implement the getElementAtIndex method
		if (list.size()>0 && index>-1 && index<list.size()){
			return list.get(index);
		}else {
			return -1;
		}
	}
	
	/*
	 * Return the sum of all the values in the given list.
	 */
	static int sumValues(List<Integer> list) {
		// TODO: Implement the sumValues method
		int sum=0;
		if (list.size()>0) {
			for (int i=0;i<list.size();i++) {
				sum+=list.get(i);
			}
		} 
		return sum;	
	}
	
	/*
	 * Return a new list that doubles every element in the 
	 * given list.
	 */
	static List<Integer> doubleElements(List<Integer> list) {
		// TODO: Implement the doubleElements method
		ArrayList<Integer> newArrList=new ArrayList<Integer>();
		if (list.size()>0) {
			for(int i=0;i<list.size();i++) {
				newArrList.add(list.get(i)*2);
			}
		}
		return newArrList;
	}

	/* -------- Sets -------- */
	
	/*
	 * Return whether the given set contains the given value.
	 */
	static boolean setContains(Set<Integer> set, int val) {
		// TODO: Implement the setContains method
		return set.contains(val);
	}
	
	/*
	 * Return a new set containing the intersection 
	 * (common elements) of the given sets.
	 */
	static Set<Integer> setIntersection(Set<Integer> set1, Set<Integer> set2) {
		// TODO: Implement the setIntersection method
		HashSet<Integer> newHashSet= new HashSet<Integer>();
		for(Integer val1:set1) {
			if(set2.contains(val1)) {
				newHashSet.add(val1);
			}
		}
		return newHashSet;
	}
	
	/*  -------- HashMaps -------- */
	
	/*
	 * Given a string, return a map with each character as 
	 * a key and the number of times that character appears 
	 * in the string as the value.
	 */
	static Map<Character, Integer> characterCount(String s) {
		// TODO: Implement the characterCount method
		return new HashMap<>();
	}
	
	/*
	 * Given a mapping of cities to their population, return the city
	 * with the largest population. If the given map is empty, return 
	 * an empty string.
	 */
	static String largestPopulation(Map<String, Integer> cities) {
		// TODO: Implement the largestPopulation method
		return "";
	}

}
