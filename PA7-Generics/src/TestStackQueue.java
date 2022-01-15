
public class TestStackQueue {

    public static void main(String[] args) {
        ListQueue<Integer> q = new ListQueue<>();
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q);
        // int deq = q.dequeue();
        // System.out.println(q + " deq: " + deq);
        ListQueue<Integer> q2 = new ListQueue<>(q);
        // q2.clear();
        System.out.println(q2);
        // q.clear();
        System.out.println(q + " " + q2);
        System.out.println(q.equals(q2));

        // ArrayQueue arr = new ArrayQueue();
        // arr.enqueue(2);
        // arr.enqueue(1);
        // arr.enqueue(3);
        // arr.enqueue(5);
        // ArrayQueue arr2 = new ArrayQueue(arr);
        // System.out.println(arr);
        // System.out.println(arr2);
        // int pp = arr.dequeue();
        // System.out.println(arr);
        // arr.enqueue(2);
        // System.out.println(arr);
        //
        // System.out.println(arr2.equals(arr));
        //
        // System.out.println(arr.peek());

        // ListStack arr = new ListStack();
        // arr.push(2);
        // arr.push(1);
        // arr.push(3);
        // arr.push(5);
        // System.out.println("arr1: " + arr);
        // ListStack arr2 = new ListStack(arr);
        // System.out.println("arr2: " + arr2);
        // System.out.println(arr2.equals(arr));
        //
        // int pp = arr.pop();
        // System.out.println(pp);
        //
        // System.out.println("arr1: " + arr);
        // System.out.println("arr2: " + arr2);
        // //
        // System.out.println(arr2.equals(arr));
        //
        //
        // System.out.println(arr.peek());
        // ArrayStack arr = new ArrayStack();
        // arr.push(2);
        // arr.push(1);
        // arr.push(3);
        // arr.push(5);
        // System.out.println(arr);
        // ArrayStack arr2 = new ArrayStack(arr);
        // int pp = arr.pop();
        // System.out.println(arr);
        // System.out.println(arr2);
        //
        // System.out.println(arr2.equals(arr));
        //
        //
        // System.out.println(arr.peek());

    }

}
