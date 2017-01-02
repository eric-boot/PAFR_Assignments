package Assignment_2.src.models;

import java.util.ArrayList;

/**
 * Created by Maarten de Klerk on 2-1-2017.
 */
public class Train {
    private String name;
    private ArrayList<WagonType> wagons;

    public Train(String name) {
        this.name = name;
        this.wagons = new ArrayList<WagonType>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<WagonType> getWagons() {
        return wagons;
    }

    public void setWagons(ArrayList<WagonType> wagons) {
        this.wagons = wagons;
    }

    public void addWagon(WagonType wagon){
        wagons.add(wagon);
    }
    public void deleteWagon(WagonType wagon){
        wagons.remove(wagon);
    }
}
