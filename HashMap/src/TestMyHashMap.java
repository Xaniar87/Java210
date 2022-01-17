import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class TestMyHashMap {
	
	
	static public void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		ArrayList<LinkedList<Integer>> arr=new ArrayList<>();
		for(int i=0;i<2;i++) {
			arr.add(new LinkedList<Integer>());
		}
//		System.out.println(arr.get(0).size());
////		arr.add(3,5);
//		System.out.println(arr);
//		map.put("A",1);
//		System.out.println("{A=1}, --------  "+map);
//		map.put("A",2);
//		map.put("B",2);
//		System.out.println("{A=2, B=2}, --------  "+map);
//		System.out.println("true     ---------   "+map.containsKey("A"));
//		System.out.println("false     ---------  "+map.containsKey("a"));
//		System.out.println("false     ---------   "+map.containsKey("c"));
//		System.out.println("2   --------    "+map.get("A"));
//		System.out.println("false     ---------   "+map.containsValue(3));
//		System.out.println("true     ---------   "+map.containsValue(2));
//		System.out.println("2     ---------   "+map.remove("A"));
//		System.out.println("{B=2}, --------  "+map);
//		map.put("A",6);
//		System.out.println("[A, B], --------  "+map.keySet());
//
//		System.out.println("6     ---------   "+map.get("A"));
//		map.clear();
//		System.out.println("{}, --------  "+map);

		MyHashMap<String,Integer> mp=new MyHashMap<>();
		mp.put("A", 2);
		mp.put("r", 2);
		mp.put("A", 7);
		mp.put("t", 3);
		mp.put("R", 3);
		mp.printTable();
		System.out.println(mp.get("t"));
		
		System.out.println(mp.containsKey("t"));
		System.out.println(mp.containsKey("R"));
		System.out.println(mp.containsKey("T"));

		System.out.println(mp.containsValue(2));
		System.out.println(mp.keySet());
		System.out.println(mp.size());
		System.out.println(mp.remove("r"));
		mp.put("B", 2);
		mp.put("C", 2);
		mp.put("D", 7);
		mp.put("E", 3);
		mp.put("F", 3);
		mp.put("r", 10);
		mp.put("g", 10);
		mp.put("z", 10);
		mp.put("Y", 10);
		mp.put("X", 10);
		mp.put("x", 10);

		mp.printTable();
		mp.clear();
		mp.printTable();

	}

}
