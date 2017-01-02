package Assignment_2.src.models;

/**
 * Created by Maarten de Klerk on 2-1-2017.
 */
public class Wagon1 {
    private String name;
    private int seats;

    public Wagon1(String name, int seats) {
        this.name = name;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
