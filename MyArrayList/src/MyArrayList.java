
public class MyArrayList {
	private final int DEFAULT_CAPACITY=10;
	private int size;
	private int[] array;
	
//	Constructor
	public MyArrayList() {
		size=0;
		array=new int[DEFAULT_CAPACITY];
	}
//	Copy Constructor
	public MyArrayList(MyArrayList copy) {
		this.array=new int[copy.array.length];
		for(int i=0;i<copy.size;i++) {
			this.array[i]=copy.array[i];
		}
		this.size=copy.size;
	}
	
	private void growArr() {
		int[] newArr=new int[2*this.array.length];
		for(int i=0;i<this.size;i++) {
			newArr[i]=this.array[i];
		}
		this.array=newArr;
	}
	
	public void add(int value) {
//		if (this.size>=this.array.length) {
//			growArr();
//		}
//		this.array[size]=value;
//		this.size++;
//		
		add(size,value);
	}
	public void add(int index, int value) {
		
		if (index>size || index<0) {
			System.out.println("index should not be greater than the ArrayList.size");
		} else { 
			if (this.size>=this.array.length) {
				growArr();
			}
			for (int i=size;i>index;i--) {
				this.array[i]=this.array[i-1];
			}
			this.array[index]=value;
			
			this.size++;
		}

		
	}
	
	public void clear() {
		this.size=0;
//		array=new int[DEFAULT_CAPACITY]; we don't do this because it is costly and even after this we have assigned 0 values
//		this above operation is ignored whenever we think we will have the same array length soon
	}
	
	public boolean contains(int value) {
		for (int i=0;i<size;i++) {
			if (this.array[i]==value) {
				return true;
			}
		}		
		return false;
	}
	
	public int get(int index) {
		if(index<size && index>0) {
			return this.array[index];
		} else {
			System.out.println("index should not be greater than the ArrayList.size");
			return -3333;
		}
	}
	
	public void remove(int index) {
		for (int i=index;i<size-1;i++) {
			this.array[i]=this.array[i+1];
		}		
		this.size--;
	}
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public String toString() {
		String str="[";
		if(size>0) {
			str+=this.array[0];
		}
		for (int i=1;i<this.size;i++) {
			str+=", "+this.array[i];
		}
		str+="]";
		return str;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof MyArrayList) {
			MyArrayList other=(MyArrayList) o;
			if(this.size==other.size) {
				for (int i=0;i<this.size;i++) {
					if(this.array[i]!=other.array[i]) {
						return false;
					}
				}
				return true;
			}
		}
		return false;		
	}
	
}
