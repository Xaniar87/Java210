
public class Node<T> {
	public T data;
	public Node<T> left;
	public Node<T> right;
	public int size=0;
	public Node(T value) {
		this.data=value;
		size++;
	}
	
	public String toString() {
		String str=data+"  L: "+left+"  R: "+right;
		
		return str;
	}
	

}
