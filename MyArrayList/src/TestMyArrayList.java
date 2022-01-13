
public class TestMyArrayList {
	public static void main(String[] args) {
		MyArrayList arr=new MyArrayList();
		arr.add(0);
		arr.add(1);
		arr.clear();
//		System.out.println(arr.get(0)+" "+arr.toString());
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(2,5);
		
		System.out.println(arr.toString());
		MyArrayList arr2=new MyArrayList(arr);
		System.out.println(arr2.toString());
		System.out.println(arr2.equals(arr));
		

//		System.out.println(arr.contains(3));
		
//		arr.remove(2);
//		System.out.println(arr.toString());
//		arr.remove(0);
//		arr.remove(0);
//		arr.remove(0);
//		System.out.println(arr.isEmpty());

	}
}
