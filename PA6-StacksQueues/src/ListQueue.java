
public class ListQueue implements QueueInterface {
    private int size;
    private Node front;
    private Node last;

    public ListQueue() {
        this.size = 0;
        this.front = null;
        this.last = this.front;
    }

    public ListQueue(ListQueue copy) {
        this.size = copy.size;
        this.front = copy.front;
        this.last = this.front;
        Node curr = copy.front;
        for (int i = 0; i < copy.size; i++) {
            this.last.next = curr.next;
            this.last = this.last.next;
            curr = curr.next;
        }
    }

    @Override
    public void enqueue(int value) {
        if (this.size > 0) {
            Node newNode = new Node(value, null);
            this.last.next = newNode;
            this.last = newNode;
            this.size++;
        } else {
            this.front = new Node(value, null);
            this.last = this.front;
            this.size++;
        }
    }

    @Override
    public int dequeue() {
        int out = -3333;
        if(this.size==1) {
            out=this.front.data;
            this.front=null;
            this.last=null;
            this.size--;
        } else if (this.size > 1) {
            Node curr = this.front;
            while (curr.next != null) {
                this.last = curr;
                curr = curr.next;

            }
            out = curr.data;
            this.last.next = null;
            this.size--;
        }

        return out;

    }

    @Override
    public int peek() {
        return this.last.data;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        this.size = 0;
        this.front = null;
        this.last = null;

    }

    public String toString() {
        String str = "{";
        if (this.size > 0) {
            str += this.front.data;
            Node curr = this.front.next;
            for (int i = 1; i < this.size; i++) {
                str += ", " + curr.data;
                curr = curr.next;
            }
        }
        str += "}";
        return str;
    }

    public boolean equals(Object o) {
        if (o instanceof ListQueue) {
            ListQueue other = (ListQueue) o;
            if (this.size == other.size) {
                Node thisCurr = this.front;
                Node otherCurr = other.front;
                for (int i = 0; i < this.size; i++) {
                    if (thisCurr != otherCurr) {
                        return false;
                    }
                    otherCurr = otherCurr.next;
                    thisCurr = thisCurr.next;
                }
                return true;
            }
        }
        return false;
    }

    private class Node {
        private int data;
        private Node next;

        public Node() {
        }
        public Node(int value, Node next) {
            this.data = value;
            this.next = next;
        }
    }

}
