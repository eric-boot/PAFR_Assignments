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
}
