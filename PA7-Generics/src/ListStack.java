public class ListStack<E> implements StackInterface<E> {
    private int size;
    private Node<E> front;
    private Node<E> last;

    public ListStack() {
        this.size = 0;
        this.front = null;
        this.last = this.front;
    }

    public ListStack(ListStack<E> copy) {
        this.front = copy.front;
        this.last = this.front;
        Node<E> curr = copy.front;
        while (curr != null) {
            this.last.next = curr.next;
            this.last = this.last.next;
            curr = curr.next;
        }
        this.size = copy.size;
    }

    @Override
    public void push(E value) {
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
    public E pop() {

        Node<E> curr = this.front;
        while (curr.next != null) {
            this.last = curr;
            curr = curr.next;
        }
        // this.last.next = null;
        this.size--;
        return curr.data;
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
        int counter = 0;
        Node<E> curr = new Node<E>();
        String str = "[";
        if (!this.front.equals(null)) {
            str += this.front.data;
            curr = this.front.next;
            counter++;
        }
        while (curr != null && counter < this.size) {
            str += ", " + curr.data;
            curr = curr.next;
            counter++;
        }
        str += "]";
        return str;
    }

    public boolean equals(Object o) {
        if (o instanceof ListStack) {
            ListStack<E> other = (ListStack<E>) o;
            if (this.size == other.size) {
                if (this.front != null) {
                    Node<E> thisCurr = this.front;
                    Node<E> otherCurr = other.front;
                    while (thisCurr != null) {
                        if (thisCurr.data != otherCurr.data) {
                            return false;
                        } else {
                            thisCurr = thisCurr.next;
                            otherCurr = otherCurr.next;
                        }
                    }

                }
                return true;

            }
        }
        return false;
    }

    private class Node<T> {
        private T data;
        private Node<T> next;

        Node() {

        }

        Node(T value, Node<T> next) {
            this.data = value;
            this.next = next;
        }

    }

}
