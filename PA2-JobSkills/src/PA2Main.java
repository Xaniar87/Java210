import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class PA2Main {
    static HashMap<String, HashMap<String, List<List<String>>>> map = new HashMap<>();
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(args[1]);
        csvToMap(args[0]);
        List<String> sortedKeys = new ArrayList<String>(map.keySet());
        Collections.sort(sortedKeys);
        if (args[1].equals("CATCOUNT")) {
            for (String cat : sortedKeys) {
                System.out.println(cat + ", " + map.get(cat).keySet().size());
            }
        } else if (args[1].equals("LOCATIONS")) {
            List<String> sortedKeys1 = new ArrayList<String>(
                    map.get(args[2]).keySet());
            Collections.sort(sortedKeys1);
            for (String loc : sortedKeys1) {
                System.out
                        .println(loc + ", " + map.get(args[2]).get(loc).size());
            }
        }else {
            System.out.println("args[1]: " + args[1]
                    +
                    " Command line arguments are not valid, first arg=file path,"
                            + " second arg = CATCOUNT or LOCATIONS");
        }
    }
    public static void csvToMap(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(",");
            String cat = line[2];
            if (!map.containsKey(cat)) {
                HashMap<String, List<List<String>>> inner = new HashMap<>();
                List<List<String>> prop = new ArrayList<>();
                List<String> oneProp = new ArrayList<>();
                oneProp.add(line[0]);
                oneProp.add(line[1]);
                oneProp.add(line[4]);
                oneProp.add(line[5]);
                oneProp.add(line[6]);
                prop.add(oneProp);
                inner.put(line[3], prop);
                map.put(cat, inner);
            } else {
                if (!map.get(cat).containsKey(line[3])) {
                    List<List<String>> prop = new ArrayList<>();
                    List<String> oneProp = new ArrayList<>();
                    oneProp.add(line[0]);
                    oneProp.add(line[1]);
                    oneProp.add(line[4]);
                    oneProp.add(line[5]);
                    oneProp.add(line[6]);
                    prop.add(oneProp);
                    map.get(cat).put(line[3], prop);
                } else {
                    List<String> oneProp = new ArrayList<>();
                    oneProp.add(line[0]);
                    oneProp.add(line[1]);
                    oneProp.add(line[4]);
                    oneProp.add(line[5]);
                    oneProp.add(line[6]);
                    map.get(cat).get(line[3]).add(oneProp);
                }
            }
        }
        // System.out.println("here is the map: " + map.toString());
    }
}

