import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class PA5Main {
    static int row = 2;
    static int col = 2;
    public static Plant[][] gardenArr;
    public static String gardenStr = "";
    static HashMap<String, String> map = new HashMap<String, String>();

    public static void main(String[] args) throws FileNotFoundException {
        mapping();

        Scanner file = new Scanner(new File("./PublicTestCases/plantcool.in"));

        String firstLine = file.nextLine();
        row = Integer.valueOf(firstLine.split(" ")[1]);
        String secondLine = file.nextLine();
        col = Integer.valueOf(secondLine.split(" ")[1]);
        String line;
        garden(row, col);

        while (file.hasNext()) {
            line = file.nextLine();
            System.out.println(line);
            String[] words = line.split(" ");
            if (words[0].equals("cut")) {
                if (words.length == 1) {
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (gardenArr[i][j] instanceof Tree) {
                                Tree tr = (Tree) gardenArr[i][j];
                                tr.cut();
                            }
                        }
                    }
                } else if (words[1].charAt(0) == '(') {
                    String[] word1 = words[1].replace("(", "").replace(")", "")
                            .split(",");
                    int x = Integer.parseInt(word1[0]);
                    int y = Integer.parseInt(word1[1]);
                    if (gardenArr[x][y] instanceof Tree) {
                        Tree tr = (Tree) gardenArr[x][y];
                        tr.cut();
                    } else {
                        System.out.println("Can’t cut there.");
                    }

                } else {
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (gardenArr[i][j].getName().equals(words[1])) {
                                Tree tr = (Tree) gardenArr[i][j];
                                tr.cut();
                            }
                        }
                    }

                }
                // -----------------------------------------------------------------------
            } else if (words[0].equals("pick")) {
                if (words.length == 1) {
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (gardenArr[i][j] instanceof Flower) {
                                Flower fl = (Flower) gardenArr[i][j];
                                fl.pick();
                            }
                        }
                    }
                } else if (words[1].charAt(0) == '(') {
                    String[] word1 = words[1].replace("(", "").replace(")", "")
                            .split(",");
                    int x = Integer.parseInt(word1[0]);
                    int y = Integer.parseInt(word1[1]);
                    if (gardenArr[x][y] instanceof Flower) {
                        Flower fl = (Flower) gardenArr[x][y];
                        fl.pick();
                    } else {
                        System.out.println("Can’t pick there.");
                    }

                } else {
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (gardenArr[i][j].getName().equals(words[1])) {
                                Flower fl = (Flower) gardenArr[i][j];
                                fl.pick();
                            }
                        }
                    }

                }
                // -----------------------------------------------------------------------
            } else if (words[0].equals("harvest")) {
                if (words.length == 1) {
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (gardenArr[i][j] instanceof Vegetables) {
                                Vegetables veg = (Vegetables) gardenArr[i][j];
                                veg.harvest();
                            }
                        }
                    }
                 } else if (words[1].charAt(0) == '(') {
                        String[] word1 = words[1].replace("(", "")
                                .replace(")", "").split(",");
                        int x = Integer.parseInt(word1[0]);
                        int y = Integer.parseInt(word1[1]);
                        if (gardenArr[x][y] instanceof Vegetables) {
                            Vegetables veg = (Vegetables) gardenArr[x][y];
                            veg.harvest();
                        } else {
                            System.out.println("Can’t harvest there.");
                        }

                    } else {
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < col; j++) {
                                if (gardenArr[i][j].getName()
                                        .equals(words[1])) {
                                    Vegetables veg = (Vegetables) gardenArr[i][j];
                                    veg.harvest();
                                }
                            }
                        }

                    }

            } else if (words[0].equals("PLANT")) {
                String[] word1 = words[1].replace("(", "").replace(")", "")
                        .split(",");
                int x = Integer.parseInt(word1[0]);
                int y = Integer.parseInt(word1[1]);

                plant(x, y, words[2]);
            } else if (words[0].equals("print")) {
                System.out.println(print(gardenArr));
            }
            if (words[0].equals("grow")) {
                System.out.println("=======");
                if (words.length == 2) {
                    for (int k = 0; k < Integer.valueOf(words[1]); k++) {
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < col; j++) {
                                if (gardenArr[i][j] instanceof Flower) {
                                    Flower fl = (Flower) gardenArr[i][j];
                                    fl.grow();
                                } else if (gardenArr[i][j] instanceof Tree) {
                                    Tree tr = (Tree) gardenArr[i][j];
                                    tr.grow();
                                } else if (gardenArr[i][j] instanceof Vegetables) {
                                    Vegetables veg = (Vegetables) gardenArr[i][j];
                                    veg.grow();
                                }
                            }
                        }
                    }
                } else if (words.length == 3) {
                    if (words[2].charAt(0) == '(') {
                        String[] word3 = words[2].replace("(", "")
                                .replace(")", "").split(",");
                        int xx = Integer.parseInt(word3[0]);
                        int yy = Integer.parseInt(word3[1]);
                        for (int k = 0; k < Integer.valueOf(words[1]); k++) {
                            if (gardenArr[xx][yy] instanceof Flower) {
                                Flower fl = (Flower) gardenArr[xx][yy];
                                fl.grow();
                            } else if (gardenArr[xx][yy] instanceof Tree) {
                                Tree tr = (Tree) gardenArr[xx][yy];
                                tr.grow();
                            } else if (gardenArr[xx][yy] instanceof Vegetables) {
                                Vegetables veg = (Vegetables) gardenArr[xx][yy];
                                veg.grow();
                            }
                        }
                    } else {
                        if (words[2].equals("Flower") || words[2].equals("Tree")
                                || words[2].equals("Vegetable")) {
                            for (int k = 0; k < Integer
                                    .valueOf(words[2]); k++) {
                                for (int i = 0; i < row; i++) {
                                    for (int j = 0; j < col; j++) {
                                        if (gardenArr[i][j] instanceof Flower) {
                                            Flower fl = (Flower) gardenArr[i][j];
                                            fl.grow();
                                        } else if (gardenArr[i][j] instanceof Tree) {
                                            Tree tr = (Tree) gardenArr[i][j];
                                            tr.grow();
                                        } else if (gardenArr[i][j] instanceof Vegetables) {
                                            Vegetables veg = (Vegetables) gardenArr[i][j];
                                            veg.grow();
                                        }
                                    }
                                }
                            }


                        } else if (map.containsKey(words[2])) {
                            for (int k = 0; k < Integer
                                    .valueOf(words[1]); k++) {
                                for (int i = 0; i < row; i++) {
                                    for (int j = 0; j < col; j++) {
                                        if (gardenArr[i][j] instanceof Flower) {
                                            Flower fl = (Flower) gardenArr[i][j];
                                            if (fl.getName().equals(words[2])) {
                                                fl.grow();
                                            }

                                        } else if (gardenArr[i][j] instanceof Tree) {
                                            Tree tr = (Tree) gardenArr[i][j];
                                            if (tr.getName().equals(words[2])) {
                                                tr.grow();
                                            }
                                        } else if (gardenArr[i][j] instanceof Vegetables) {
                                            Vegetables veg = (Vegetables) gardenArr[i][j];
                                            if (veg.getName()
                                                    .equals(words[2])) {
                                                veg.grow();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(print(gardenArr));
    }

    public static Plant[][] garden(int row, int col) {
        gardenArr = new Plant[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                gardenArr[i][j] = new Plant("");
                gardenStr += ".....";

            }
            gardenStr += "\n";
            for (int k = 0; k < 4; k++) {
                for (int l = 0; l < col; l++) {
                    gardenStr += ".....";
                }
                gardenStr += "\n";
            }

        }

        return gardenArr;
    }

    public static void mapping() {
        map.put("iris", "Flower");
        map.put("lily", "Flower");
        map.put("rose", "Flower");
        map.put("daisy", "Flower");
        map.put("tulip", "Flower");
        map.put("sunflower", "Flower");

        map.put("oak", "Tree");
        map.put("banana", "Tree");
        map.put("willow", "Tree");
        map.put("pine", "Tree");
        map.put("coconut", "Tree");

        map.put("garlic", "Vegetable");
        map.put("zucchini", "Vegetable");
        map.put("yam", "Vegetable");
        map.put("tomato", "Vegetable");
        map.put("lettuce", "Vegetable");

    }

    public static Plant[][] plant(int x, int y, String name) {

        if (x > row || y > col) {
            System.out.println("Cannot plant outside the garden");
        } else {
            if (map.get(name).equals("Flower")) {
                Flower fl = new Flower(name, name.charAt(0));
                gardenArr[x][y] = fl;

            } else if (map.get(name).equals("Tree")) {
                Tree tr = new Tree(name, name.charAt(0));
                gardenArr[x][y] = tr;
            } else if (map.get(name).equals("Vegetable")) {
                Vegetables veg = new Vegetables(name, name.charAt(0));
                gardenArr[x][y] = veg;
            }
        }
        return gardenArr;
    }

    public static String print(Plant[][] arr) {
        gardenStr = "";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                gardenStr += arr[i][j].toString().split("\n")[0];
            }
            gardenStr += "\n";
            for (int k = 1; k < 5; k++) {
                for (int l = 0; l < col; l++) {
                    gardenStr += arr[i][l].toString().split("\n")[k];
                }
                gardenStr += "\n";
            }

        }

        return gardenStr;
    }
}
