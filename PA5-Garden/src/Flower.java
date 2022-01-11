
public class Flower extends Plant {
    private int numGrow = 0;
    private char ch;
    private int[] center = new int[] { 2, 2 };

    public Flower(String name, char ch) {
        super(name);
        this.ch = ch;
        this.arr[2][2] = ch;
    }


    public void grow() {
        if (numGrow < 10) {
            numGrow++;
            for (int i = center[0] - (1 * numGrow); i < center[0] + numGrow
                    + 1; i++) {
                for (int j = center[1] - (1 * numGrow); j < center[1] + numGrow
                        + 1; j++) {
                    if (Math.pow(i - center[0], 2)
                            + Math.pow(j - center[1], 2) <= Math.pow(numGrow,
                                    2)
                            && i < 5 && i > -1 && j < 5 && j > -1) {
                        this.arr[i][j] = this.ch;
                    }
                }
            }
        }
    }

    public void pick() {
        this.arr = this.reset();

    }



}
