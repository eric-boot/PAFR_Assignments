package Assignment_2.src.models;

import java.util.ArrayList;

/**
 * Created by Maarten de Klerk on 2-1-2017.
 */
public class Train{
    private String name;
    private ArrayList<WagonType> wagons;
    private int allSeats;

    public Train(String name) {
        this.name = name;
        this.wagons = new ArrayList<WagonType>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<WagonType> getWagons() {
        return wagons;
    }

    public void addWagon(WagonType wagon){
        wagons.add(wagon);
    }


    public int getAllSeats(){
        for(WagonType w : wagons){
             allSeats += w.getSeats();
        }
        return allSeats;
    }
}
