import java.util.HashMap;

public class Garden {
    public Plant[][] gardenArr;
    HashMap<String, String> map = new HashMap<String, String>();



    public Plant[][] getGardenArr() {
        return gardenArr;
    }

    public void setGardenArr(Plant[][] gardenArr) {
        this.gardenArr = gardenArr;
    }

    public void mapping() {
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

        map.put("garlic", "vegetable");
        map.put("zuchini", "vegetable");
        map.put("yam", "vegetable");
        map.put("tomato", "vegetable");
        map.put("lettuce", "vegetable");

    }


}
