public class ListStack implements StackInterface {
    private int size;
    private Node front;
    private Node last;

    public ListStack() {
        this.size = 0;
        this.front = null;
        this.last = this.front;
    }

    public ListStack(ListStack copy) {
        this.front = copy.front;
        this.last = this.front;
        Node curr = copy.front;
        while (curr != null) {
            this.last.next = curr.next;
            this.last = this.last.next;
            curr = curr.next;
        }
        this.size = copy.size;
    }

    @Override
    public void push(int value) {
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
    public int pop() {

        Node curr = this.front;
        while (curr.next != null) {
            this.last = curr;
            curr = curr.next;
        }
        // this.last.next = null;
        this.size--;
        return curr.data;
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
        int counter = 0;
        Node curr = new Node();
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
            ListStack other = (ListStack) o;
            if (this.size == other.size) {
                if (this.front != null) {
                    Node thisCurr = this.front;
                    Node otherCurr = other.front;
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

    private class Node {
        private int data;
        private Node next;

        Node() {

        }
        Node(int value, Node next) {
            this.data = value;
            this.next = next;
        }

    }

}
