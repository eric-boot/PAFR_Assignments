package Assignment_2.src.models;

/**
 * Created by Maarten de Klerk on 2-1-2017.
 */
public class Wagon1 implements WagonType {
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

    @Override
    public boolean equals(Object obj){
        boolean isWagon1 = false;
        if(obj instanceof Wagon1){
            Wagon1 wagon1 = (Wagon1) obj;
            if(wagon1.getName().equals(this.getName()) && wagon1.getSeats() == this.getSeats()) {
                isWagon1 = true;
            }
        }
        return isWagon1;
    }
}
