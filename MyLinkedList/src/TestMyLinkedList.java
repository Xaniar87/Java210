
public class TestMyLinkedList {

	
	public static void main(String[] args) {
		MyLinkedList ll=new MyLinkedList();
		ll.add(2);
		ll.add(3);
		System.out.println(ll.toString()+" size: "+ll.size());
//		System.out.println(ll.contains(3));
//		System.out.println(ll.contains(5));
		System.out.println(ll.get(1));

		ll.add(2,100);
		System.out.println(ll.toString()+" size: "+ll.size());

		
		ll.add(3,200);
		System.out.println(ll.toString()+" size: "+ll.size());
		
		
		ll.remove(3);
		System.out.println(ll.toString()+" size: "+ll.size());
		
//		MyLinkedList ll2=new MyLinkedList(ll);
//		
//		System.out.println(ll2.toString());
//
//		System.out.println(ll.equals(ll2));
	}
}
