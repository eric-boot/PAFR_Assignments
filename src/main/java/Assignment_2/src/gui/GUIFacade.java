package Assignment_2.src.gui;

import Assignment_2.src.models.Train;
import Assignment_2.src.models.WagonType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by Maarten de Klerk on 5-1-2017.
 */
public class GUIFacade extends Observable{

    private ArrayList<String> logLines;
    private ArrayList<Train> allTrains;
    private ArrayList<WagonType> allWagons;
    private static GUIFacade GUIFacadeInstance = null;
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private GUIFacade(){
        logLines = new ArrayList<String>();
        setChanged();
        notifyObservers();
    }

    public static GUIFacade getInstance(){
        if(GUIFacadeInstance == null){
            GUIFacadeInstance = new GUIFacade();
        }
        return GUIFacadeInstance;
    }
    public void addLogline(String line){
        LocalDateTime now = LocalDateTime.now();
        logLines.add(dtf.format(now) + " >\t" + line);
        setChanged();
        notifyObservers();

    }

    public void addWagon(WagonType wagon){
        allWagons.add(wagon);
        setChanged();
        notifyObservers();
    }


    public void addTrain(Train train){
        allTrains.add(train);
        setChanged();
        notifyObservers();
    }

    public synchronized ArrayList<String> getLogLines(){return logLines;}
    public synchronized ArrayList<Train> getAllTrains(){return allTrains;}
    public synchronized ArrayList<WagonType> getAllWagons(){return allWagons;}
}
