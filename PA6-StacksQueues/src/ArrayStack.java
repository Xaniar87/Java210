
public class ArrayStack implements StackInterface {
    private final int MAX_CAPACITY = 10;
    private int size;
    private int[] arr;

    public ArrayStack() {
        this.size = 0;
        arr = new int[MAX_CAPACITY];
    }

    public ArrayStack(ArrayStack copy) {
        this.size = copy.size;
        this.arr = new int[copy.arr.length];
        for (int i = 0; i < copy.size; i++) {
            this.arr[i] = copy.arr[i];
        }
    }

    private void growArr() {
        int[] newArr = new int[2 * this.arr.length];
        for (int i = 0; i < this.size; i++) {
            newArr[i] = this.arr[i];
        }
        this.arr = newArr;
    }

    @Override
    public void push(int value) {
        if (this.size >= this.arr.length) {
            growArr();
        }
        this.arr[this.size] = value;
        this.size++;
    }

    @Override
    public int pop() {
        if (this.size > 0) {
            this.size--;
            return this.arr[this.size];
        }
        return -1;

    }

    @Override
    public int peek() {
        return this.arr[this.size - 1];
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
        if (o instanceof ArrayStack) {

            ArrayStack other = (ArrayStack) o;
            if (this.size == other.size) {
                for (int i = 0; i < other.size; i++) {
                    if (this.arr[i] != other.arr[i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String str = "{";
        if (this.size > 0) {
            str += this.arr[0];
            for (int i = 1; i < this.size; i++) {
                str += "," + this.arr[i];
            }
        }
        str += "}";
        return str;

    }

}
