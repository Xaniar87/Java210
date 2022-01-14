public class Drill06 {

    // Given a generic HashNode<K,V> as a parameter 
    // return the value in the HashNode.
    public static <K, V> V returnValue(HashNode<K, V> node) {
    	return node.getValue();
        
    }

    // Given a generic HashNode<K,V> as a parameter
    // return the key in the HashNode.
    public static <K, V> K returnKey(HashNode<K, V> node) {
        return node.getKey();
    }

    // In the singly-linked list of generic HashNode<K,V>s 
    // that starts with the given node, return the value 
    // in the last node.
    public static <K, V> V findLastVal(HashNode<K, V> first) {
        HashNode<K,V> curr=first;
        while(curr.getNext()!=null) {
        	curr=curr.getNext();
        }
        return curr.getValue();
    }

    // In the singly-linked list of generic HashNode<K,V>s that starts 
    // with the given node, return the indexed node. The first node is
    // index 0, then next index 1, etc.
    public static <K, V> HashNode<K, V> findNodeByIndex(HashNode<K, V> first,
            int index) {
    	int counter=0;
    	HashNode<K,V> curr=first;
        while(curr.getNext()!=null && counter<index) {
        	curr=curr.getNext();
        	counter++;
        }
    	
        return curr;
    }

    // Count all of the nodes in the given singly-linked list of
    // generic HashNode<K,V>s that starts with the given node.
    public static <K, V> int countNodes(HashNode<K, V> first) {
    	if(first==null) {
    		return 0;
    	}
    	
    	int counter=0;
    	HashNode<K,V> curr=first;
        while(curr.getNext()!=null) {
        	curr=curr.getNext();
        	counter++;
        }
    	
    	
        return counter+1;
    }

}
