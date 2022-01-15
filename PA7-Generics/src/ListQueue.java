
public class ListQueue<E> implements QueueInterface<E> {
    private int size;
    private Node<E> front;
    private Node<E> last;

    public ListQueue() {
        this.size = 0;
        this.front = null;
        this.last = this.front;
    }

    public ListQueue(ListQueue<E> copy) {
        this.size = copy.size;
        this.front = copy.front;
        this.last = this.front;
        Node<E> curr = copy.front;
        for (int i = 0; i < copy.size; i++) {
            this.last.next = curr.next;
            this.last = this.last.next;
            curr = curr.next;
        }
    }

    @Override
    public void enqueue(E value) {
        if (this.size > 0) {
            Node<E> newNode = new Node<E>(value, null);
            this.last.next = newNode;
            this.last = newNode;
            this.size++;
        } else {
            this.front = new Node<E>(value, null);
            this.last = this.front;
            this.size++;
        }
    }

    @Override
    public E dequeue() {
        E out = null;
        if(this.size==1) {
            out=this.front.data;
            this.front=null;
            this.last=null;
            this.size--;
        } else if (this.size > 1) {
            Node<E> curr = this.front;
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
    public E peek() {
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
            Node<E> curr = this.front.next;
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
            ListQueue<E> other = (ListQueue<E>) o;
            if (this.size == other.size) {
                Node<E> thisCurr = this.front;
                Node<E> otherCurr = other.front;
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

    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node() {
        }

        public Node(T value, Node<T> next) {
            this.data = value;
            this.next = next;
        }
    }

}
