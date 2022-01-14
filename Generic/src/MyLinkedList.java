public class MyLinkedList<E> {
	private int size;
	private Node<E> front;
	private Node<E> last;
	
	
//	Constructor
	public MyLinkedList() {
		size=0;
		this.front=null;
		this.last=null;
	}
//	Copy Constructor
	public MyLinkedList(MyLinkedList<E> copy) {
		this.front=copy.front;
		this.last=this.front;
		Node<E> curr=copy.front;
		while(curr!=null) {
			this.last.next=curr.next;
			this.last=this.last.next;
			curr=curr.next;
		}
		this.size=copy.size;

	}
	
	public void add(E val) {
		add(this.size,val);

	}
	
	public void add(int index, E value) {
		if(index<this.size && index>0) {
			int counter=0;
			Node<E> curr=this.front;
			while (counter<index-1) {
				curr=curr.next;
				counter++;
			}
			Node<E> newNode=new Node<E>(value,curr.next);
			curr.next=newNode;
			this.size++;
		} else if(index==0) {
			Node<E> newNode=new Node<E>(value,this.front);
			this.front=newNode;
			this.last=this.front;
			this.size++;
			
		} else if(index==this.size) {
			Node<E> newNode=new Node<E>(value,null);
//			System.out.println("last.data: "+last.data);
			this.last.next=newNode;
			this.last=newNode;
			this.size++;
		}
		
	}
	
	public void clear() {
		this.front=null;
		this.last=null;
		this.size=0;
	}
	
	public boolean contains(E value) {
		if(front!=null) {
			Node<E> curr=front;
			while (curr!=null) {
				if (curr.data.equals(value)) {
					return true;
				}
				curr=curr.next;
			}
		}	
		return false;
	}
	
	public E get(int index) {
		int counter=0;
		Node<E> curr=front;
		while(index>counter) {
			if (curr!=null) {
				curr=curr.next;
				counter++;
			}
		}
		return curr.data;

	}
	
	public void remove(int index) {
		int counter=0;
		Node<E> curr=this.front;
		if (index==0) {
			this.front=this.front.next;
			this.size--;
		}else if(index==this.size-1) {
			while(counter<index-1) {
				curr=curr.next;
				counter++;
			}
			curr.next=null;
			this.last=curr;
			
			
			this.size--;

		} else if(index>0 && index<size-1) {
			while (counter<index-1) {
				curr=curr.next;
				counter++;
			}
			curr.next=curr.next.next;
			this.size--;

		}
		
	
	}
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public String toString() {
		Node<E> curr=new Node<E>();
		String str="[";
		if (!this.front.equals(null)) {
			str+=this.front.data;
			curr=this.front.next;
		}
		while (curr!=null) {
			str+=", "+curr.data;
			curr=curr.next;
		}
		str+="]";
		return str;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof MyLinkedList) {
			MyLinkedList<E> other=(MyLinkedList<E>) o;
			if(this.size==other.size) {
				if(this.front!=null) {
					Node<E> thisCurr=this.front;
					Node<E> otherCurr=other.front;
					while(thisCurr!=null) {
						if(!thisCurr.data.equals(otherCurr.data)) {
							return false;
						}else {
							thisCurr=thisCurr.next;
							otherCurr=otherCurr.next;
						}
					}
					
				}
				return true;

			}
		}
		return false;
	}
	
	private class Node<T>{
		private T data;
		private Node<T> next;
//		Constructor
		public Node() {
			this(null,null);
		}
		
		
//		Constructor
		public Node(T val, Node<T> next) {
			this.data=val;
			this.next=next;
		}
		
	}


}
