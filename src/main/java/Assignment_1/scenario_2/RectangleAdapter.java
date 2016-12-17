package scenario_2;

/**
 * Created by Boot on 16-12-16.
 */
public class RectangleAdapter implements Shape
{
    private Rectangle adapter = new Rectangle();

    public void display(int x, int y, int w, int h) {
        adapter.display(x, y, w, h);
    }
}