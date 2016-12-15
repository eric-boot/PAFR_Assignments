package scenario_3;

/**
 * Created by Maarten de Klerk on 15-12-2016.
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying high resolution" + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading high resolution" + fileName);
    }
}
