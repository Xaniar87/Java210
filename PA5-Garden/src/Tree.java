
public class Tree extends Plant {
    private int[] lastLoc;
    private char ch;


    public Tree(String name, char ch) {
        super(name);
        this.ch = ch;
        this.arr[4][2] = ch;
        lastLoc = new int[] { 4, 2 };
    }

    public void grow() {
        if (this.lastLoc[0] - 1 >= 0) {
            this.lastLoc[0] = this.lastLoc[0] - 1;
            this.arr[lastLoc[0]][lastLoc[1]] = this.ch;
        }
    }

    public void cut() {
        this.arr = this.reset();

    }

}
