
public class ArrayQueue implements QueueInterface {
    private int[] array;
    private int size;
    private final int MAX_CAPACITY;

    public ArrayQueue() {
        this.MAX_CAPACITY = 10;
        this.size = 0;
        this.array = new int[this.MAX_CAPACITY];
    }

    public ArrayQueue(ArrayQueue copy) {
        this.MAX_CAPACITY = 10;
        this.size = copy.size;
        this.array = new int[copy.array.length];
        for (int i = 0; i < copy.size; i++) {
            this.array[i] = copy.array[i];
        }
    }

    @Override
    public void enqueue(int value) {
        if (this.size >= this.array.length) {
            growArr();
        }
        this.array[this.size] = value;
        this.size++;
    }

    private void growArr() {
        int[] newArr = new int[this.array.length * 2];
        for (int i = 0; i < this.array.length; i++) {
            newArr[i] = this.array[i];
        }
        this.array = newArr;

    }

    @Override
    public int dequeue() {
        int val = this.array[0];
        for (int i = 0; i < this.size - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.size--;
        return val;
    }

    @Override
    public int peek() {

        return this.array[0];
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return this.size == 0;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return this.size;
    }

    @Override
    public void clear() {
        this.size = 0;
    }

    public boolean equals(Object o) {
        if (o instanceof ArrayQueue) {
            ArrayQueue other = (ArrayQueue) o;
            if (this.size == other.size) {
                for (int i = 0; i < this.size; i++) {
                    if (this.array[i] != other.array[i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String str = "{";
        if (this.size > 0) {
            str += this.array[0];
        }
        for (int i = 1; i < this.size; i++) {
            str += ", " + this.array[i];
        }
        str += "}";
        return str;
    }

}
