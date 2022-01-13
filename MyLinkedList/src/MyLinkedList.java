
public class MyLinkedList {
	private int size;
	private Node front;
	private Node last;
	
	
//	Constructor
	public MyLinkedList() {
		size=0;
		this.front=null;
		this.last=null;
	}
//	Copy Constructor
	public MyLinkedList(MyLinkedList copy) {
		this.front=copy.front;
		this.last=this.front;
		Node curr=copy.front;
		while(curr!=null) {
			this.last.next=curr.next;
			this.last=this.last.next;
			curr=curr.next;
		}
		this.size=copy.size;

	}
	

	
	public void add(int val) {
		add(this.size,val);
//		if (front==null) {
//			this.front=new Node(val,null);
//			this.last=this.front;
//		}else {
//			this.last.next=new Node(val,null);
//			this.last=this.last.next;
//			
//		}
//		this.size++;

	}
	
	public void add(int index, int value) {
		if(index<this.size && index>0) {
			int counter=0;
			Node curr=this.front;
			while (counter<index-1) {
				curr=curr.next;
				counter++;
			}
			Node newNode=new Node(value,curr.next);
			curr.next=newNode;
			this.size++;
		} else if(index==0) {
			Node newNode=new Node(value,this.front);
			this.front=newNode;
			this.last=this.front;
			this.size++;
			
		} else if(index==this.size) {
			Node newNode=new Node(value,null);
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
	
	public boolean contains(int value) {
		if(front!=null) {
			Node curr=front;
			while (curr!=null) {
				if (curr.data==value) {
					return true;
				}
				curr=curr.next;
			}
		}	
		return false;
	}
	
	public int get(int index) {
		int counter=0;
		Node curr=front;
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
		Node curr=this.front;
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
		Node curr=null;
		String str="[";
		if (this.front!=null) {
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
			MyLinkedList other=(MyLinkedList) o;
			if(this.size==other.size) {
				if(this.front!=null) {
					Node thisCurr=this.front;
					Node otherCurr=other.front;
					while(thisCurr!=null) {
						if(thisCurr.data!=otherCurr.data) {
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
	
	private class Node{
		private int data;
		private Node next;
//		Constructor
		public Node() {
			this(0,null);
		}
		
		
//		Constructor
		public Node(int val, Node next) {
			this.data=val;
			this.next=next;
		}
		
	}


}
