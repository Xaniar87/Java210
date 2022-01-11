public class Plant {
    private String name;
    public char[][] arr = new char[][] { { '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.' } };

    public Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public char[][] reset() {
        arr = new char[][] { { '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.' } };
        return arr;
    }


    public String toString() {
        String str = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                str += this.arr[i][j];
            }
            str += "\n";
        }
        return str;
    }

    public char[][] getArr() {
        return arr;
    }

}
