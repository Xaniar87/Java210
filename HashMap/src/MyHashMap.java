import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class MyHashMap<K,V> {
	ArrayList<LinkedList<HashNode<K,V>>> arr=new ArrayList<>();
	private int numBuckets;
	private int size;
	public MyHashMap() {
		this.numBuckets=8;
		size=0;
		for (int i=0;i<numBuckets;i++) {
			arr.add(new LinkedList<HashNode<K,V>>());
		}
	}
	
	public void put(K key,V value) {
		boolean exist=false;
		for (int i=0; i<arr.get(hashcode(key)).size();i++) {
			if(arr.get(hashcode(key)).get(i).getKey().equals(key)){
				arr.get(hashcode(key)).get(i).setValue(value);
				exist=true;
			}
		}
		if(!exist) {
			HashNode<K,V> node=new HashNode<K,V>(key,value);
			arr.get(hashcode(key)).add(node);
			size++;
		}		
	}
	
	public V get(K key) {
		LinkedList<HashNode<K,V>> ll=arr.get(hashcode(key));	
		for(int i=0;i<ll.size();i++) {
			if(ll.get(i).getKey().equals(key) || ll.get(i).getKey()==key) {
				return ll.get(i).getValue();
			}
		}
		return null;	
	}
	
	public boolean containsKey(K key) {
		return get(key)!=null;
	}
	
	
	public boolean containsValue(V value) {
		boolean exist=false;
		for (int i=0;i<numBuckets;i++) {
			for(int j=0;j<arr.get(i).size();j++) {
				if(arr.get(i).get(j).getValue()==value || arr.get(i).get(j).getValue().equals(value)) {
					exist=true;
					return exist;
				}				
			}
		}
		return exist;
	}
	
	public HashSet<K> keySet(){
		HashSet<K> set=new HashSet<>();
		for (int i=0;i<numBuckets;i++) {
			for(int j=0;j<arr.get(i).size();j++) {
				set.add(arr.get(i).get(j).getKey());
			}
		}
		return set;
	}
 	
	private int hashcode(K key) {
		int hashCode = key.hashCode();
		int index = hashCode % numBuckets;
		return Math.abs(index);
	}
	
	public int size() {		
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public V remove(K key) {
		V val=null;
		LinkedList<HashNode<K,V>> ll=arr.get(hashcode(key));
		for(int i=0;i<ll.size();i++) {
			if(ll.get(i).getKey().equals(key)) {
				val= ll.get(i).getValue();
				ll.remove(i);
			}
		}
		return val;
	}
	
	public void clear() {
		size=0;
		for (int i=0;i<numBuckets;i++) {
			arr.get(i).clear();
		}
	}
	
	public void printTable() {
		for (int i=0;i<arr.size();i++){
			LinkedList<HashNode<K,V>> ll=arr.get(i);
			System.out.print("Index "+i+": ");
			String str="";
			for(int j=0;j<ll.size();j++) {
				str+=arr.get(i).get(j).getKey()+"="+arr.get(i).get(j).getValue()+",";
			}
			System.out.println(str);

//			System.out.print("\n");

		}
	}
}
