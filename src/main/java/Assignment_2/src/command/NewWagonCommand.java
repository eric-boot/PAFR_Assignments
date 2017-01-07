package Assignment_2.src.command;


import Assignment_2.src.gui.GUIFacade;
import Assignment_2.src.models.PassengerWagon;

/**
 * Created by Eric Boot on 02-01-17.
 */
public class NewWagonCommand implements Command {
    private GUIFacade guiFacade = GUIFacade.getInstance();

    public void execute(String inputCommand) {
        String[] result = inputCommand.split(" ");
        String id = result[2];

        int numseats = 0;
        if(result.length > 3){
            numseats = Integer.parseInt(result[4]);
        }

        if(numseats > 0){
            guiFacade.addWagon(new PassengerWagon(id, numseats));
        }
        else {
            guiFacade.addWagon(new PassengerWagon(id));
        }

    }
}
