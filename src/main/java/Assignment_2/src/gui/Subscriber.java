package Assignment_2.src.gui;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Eric Boot on 06-01-17.
 */
public abstract class Subscriber {


    private List<View> views;

    public Subscriber() {
        this.views = new ArrayList<View>();
    }

    public void registerObserver(View view){
        if(!views.contains(view)){
            views.add(view);
        }
    }

    protected void removeRandomOne(){

        if(views.size() > 0){
            int randomIndex = new Random().nextInt(views.size());
            View randomObserver = views.get(randomIndex);
            removeObserver(randomObserver);

            System.out.println(randomObserver + " is removed as an Observer");
        }

    }

    protected void removeObserver(View view){
        views.remove(view);
    }


    protected void notifyObservers(){
        for (View view: views) {
            view.update();
        }
    }
}
