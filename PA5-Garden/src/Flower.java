
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
        growHelper(0, 0);

    }

    public void growHelper(int i, int j) {
        // System.out.println("i: " + i + " j: " + j);

        if (i < 5 && j<5) {
            int x = -1;
            int y = -1;
            if (this.arr[i][j] == this.ch) {
                x = i;
                y = j;
            }
            if (j == 4) {

                growHelper(i + 1, 0);

            } else{
                growHelper(i, j + 1);
            }
            if (x != -1 && j != -1) {
                if (i > 0) {
                    this.arr[i - 1][j] = ch;
                    if (j > 0) {
                        this.arr[i][j - 1] = ch;
                    }
                }

                if (i < 4) {
                    this.arr[i + 1][j] = ch;
                    if (j < 4) {
                        this.arr[i][j + 1] = ch;
                    }
                }

            }

        }
    }

    public void pick() {
        this.arr = this.reset();

    }



}
