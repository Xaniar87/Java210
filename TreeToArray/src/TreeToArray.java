import java.util.ArrayList;
import java.util.List;

public class TreeToArray {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		for(int i=0;i<8;i++) {
			arr.add(i);
			arr2.add(0);
		}
		TreeToArray tr=new TreeToArray();	
		Node<Integer> tree=tr.arrToTree(arr,1,new Node<>(arr.get(0)));
		System.out.println(tree);
		ArrayList<Integer> newArr=tr.treeToArr(tree, arr2,0);
		System.out.println(newArr);

	}
	
	public Node<Integer> arrToTree(List<Integer> arr,int i, Node<Integer> root) {
		if(i<arr.size()) {
			Node<Integer> curr=new Node<Integer>(arr.get(i));
			root=curr;
			root.left=arrToTree(arr,2*i,root.left);
			root.right=arrToTree(arr,2*i+1,root.right);

		}
		return root;
	}
	
	public ArrayList<Integer> treeToArr(Node<Integer> root, ArrayList<Integer> arr, int ind) {
		if(!root.equals(null)) {
			int val=root.data;
			System.out.println(ind);

			if(root.left instanceof Node) {
				treeToArr(root.right,arr,2*ind);
			}
			if(root.left instanceof Node) {
				treeToArr(root.left,arr,2*ind+1);

			}
			
			arr.set(ind,val);
		}
		return arr;
	}
}
