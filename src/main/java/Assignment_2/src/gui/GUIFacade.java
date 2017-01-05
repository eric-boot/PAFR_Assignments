package Assignment_2.src.gui;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by Maarten de Klerk on 5-1-2017.
 */
public class GUIFacade extends Observable{

    private ArrayList<String> logLines;
    private static GUIFacade GUIFacadeInstance;

    private GUIFacade(){logLines = new ArrayList<String>(); GUIFacadeInstance = null;}

    public static GUIFacade getInstance(){
        System.out.println("getInstance");
        if(GUIFacadeInstance == null){
            GUIFacadeInstance = new GUIFacade();
        }
        return GUIFacadeInstance;
    }
    public void addLogline(String line){
        System.out.println("addLogline");
        logLines.add(line);
        setChanged();
        notifyObservers();

    }
    public synchronized ArrayList<String> getLogLines(){return logLines;}
}
