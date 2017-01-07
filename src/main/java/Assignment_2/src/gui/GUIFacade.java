package Assignment_2.src.gui;

import Assignment_2.src.models.Train;
import Assignment_2.src.models.WagonType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Maarten de Klerk on 5-1-2017.
 */
public class GUIFacade extends Subscriber {

    private ArrayList<String> logLines;
    private ArrayList<Train> allTrains;
    private ArrayList<WagonType> allWagons;
    private static GUIFacade GUIFacadeInstance = null;
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private GUIFacade(){
        logLines = new ArrayList<String>();
        allTrains = new ArrayList<Train>();
        allWagons = new ArrayList<WagonType>();
        GUIFacadeInstance = null;
        notifyObservers();

    }

    public static GUIFacade getInstance(){
        if(GUIFacadeInstance == null){
            GUIFacadeInstance = new GUIFacade();
        }
        return GUIFacadeInstance;
    }

    public Train getTrain(Train train){
        Train trainToReturn = null;

        for(Train t : allTrains){
            if(t.getName().equals(train.getName())){
                trainToReturn = t;
            }
        }

        return trainToReturn;
    }

    public WagonType getWagon(WagonType wagon){
        WagonType wagonToReturn = null;

        for(WagonType w : allWagons){
            if(w.getName().equals(wagon.getName())){
                wagonToReturn = w;
            }
        }

        return wagonToReturn;
    }

    public synchronized ArrayList<String> getLogLines(){return logLines;}
    public synchronized ArrayList<Train> getAllTrains(){return allTrains;}
    public synchronized ArrayList<WagonType> getAllWagons(){return allWagons;}

    public void addLogline(String line){
        LocalDateTime now = LocalDateTime.now();
        logLines.add(dtf.format(now) + " >\t" + line);
        notifyObservers();
    }

    public void addTrain(Train train){
        if(getTrain(train) == null){
            allTrains.add(train);
            addLogline("train " + train.getName() + " created");
        } else {
            addLogline("train " + train.getName() + " does already exist");
        }

        notifyObservers();
    }

    public void addWagon(WagonType wagon){
        if(getWagon(wagon) == null){
            allWagons.add(wagon);
            addLogline("wagon " + wagon.getName() + " created with " + wagon.getSeats() + " seats");
        } else {
            addLogline("wagon " + wagon.getName() + " does already exist");
        }

        notifyObservers();
    }

    public void addWagonToTrain(WagonType wagon, Train toTrain){

        //check if the wagon exists
        if(getWagon(wagon) != null){
            WagonType wagonToAdd = getWagon(wagon);

            //check if the train exists
            if(getTrain(toTrain) != null){
                Train t = getTrain(toTrain);
                t.addWagon(wagonToAdd);
                addLogline("wagon " + wagonToAdd.getName() + " added to train " + t.getName());
            } else {
                addLogline("train " + toTrain.getName() + " does not exist");
            }

        } else {
            addLogline("wagon " + wagon.getName() + " does not exist");
        }

        notifyObservers();
    }

    public void getNumseatsTrain(Train train){
        if(getTrain(train) != null){
            addLogline("number of seats in train " + getTrain(train).getName() + ": " + getTrain(train).getAllSeats());
        } else {
            addLogline("train " + train.getName() + " does not exist");
        }
        notifyObservers();
    }

    public void getNumseatsWagon(WagonType wagon){
        if(getWagon(wagon) != null){
            addLogline("number of seats in wagon " + getWagon(wagon).getName() + ": " + getWagon(wagon).getSeats());
        } else {
            addLogline("wagon " + wagon.getName() + " does not exist");
        }
        notifyObservers();
    }

    public void removeWagonFromTrain(WagonType wagon, Train fromTrain){
        boolean success = false;

        //check if the wagon exists
        if(getWagon(wagon) != null) {
            WagonType wagonToDelete = getWagon(wagon);

            //check if train exists
            if(getTrain(fromTrain) != null){
                Train train = getTrain(fromTrain);

                //get all te wagons from the train
                Iterator<WagonType> wagonTypeIterator = train.getWagons().listIterator();

                while (wagonTypeIterator.hasNext()) {
                    WagonType wagonType = wagonTypeIterator.next();

                    if(wagonType.getName().equals(wagonToDelete.getName())){
                        wagonTypeIterator.remove();
                        success = true;
                    }
                }

                //send the message if deleted
                if(success){
                    addLogline("wagon " + wagon.getName() + " removed from train " + fromTrain.getName());
                } else {
                    addLogline("train " + train.getName() + " does not has " + wagonToDelete.getName());
                }
            } else {
                addLogline("train " + fromTrain.getName() + " does not exist");
            }

        } else {
            addLogline("wagon " + wagon.getName() + " does not exist");
        }
        notifyObservers();
    }

    public void deleteTrain(Train train){

        //check if the train exists
        if(getTrain(train) != null) {
            Train trainToDelete = getTrain(train);
            allTrains.remove(trainToDelete);
            addLogline("train " + trainToDelete.getName() + " deleted");
        } else {
            addLogline("train " + train.getName() + " does not exist");

        }

        notifyObservers();
    }

    public void deleteWagon(WagonType wagon){

        //check if the wagon exists
        if(getWagon(wagon) != null) {
            WagonType wagonToDelete = getWagon(wagon);
            allWagons.remove(wagonToDelete);

            //get for each train the wagons
            for (Train t : allTrains) {
                //get all te wagons from the train
                Iterator<WagonType> wagonTypeIterator = t.getWagons().listIterator();

                while (wagonTypeIterator.hasNext()) {
                    WagonType wagonType = wagonTypeIterator.next();

                    if(wagonType.getName().equals(wagonToDelete.getName())){
                        wagonTypeIterator.remove();
                    }
                }
            }
        } else {
            addLogline("wagon " + wagon.getName() + " does not exist");
        }

        notifyObservers();
    }


}
