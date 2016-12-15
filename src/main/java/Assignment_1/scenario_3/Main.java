package scenario_3;

/**
 * Created by Boot on 30-11-16.
 */
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("image.png");

        image.display();
        System.out.println("");

        image.display();
    }
}
