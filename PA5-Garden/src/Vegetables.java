
public class Vegetables extends Plant {
    private int[] lastLoc;
    private char ch;

    public Vegetables(String name, char ch) {
        super(name);
        this.ch = ch;
        this.arr[0][2] = ch;
        lastLoc = new int[] { 0, 2 };
    }

    public void grow() {
        if (this.lastLoc[0] + 1 < 5) {
            this.lastLoc[0] = this.lastLoc[0] + 1;
            this.arr[lastLoc[0]][lastLoc[1]] = this.ch;
        }
    }

    public void harvest() {
        this.arr = this.reset();

    }
}
