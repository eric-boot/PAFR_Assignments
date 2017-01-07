package Assignment_2.src.command;

import Assignment_2.src.gui.GUIFacade;
import Assignment_2.src.models.PassengerWagon;
import Assignment_2.src.models.Train;

/**
 * Created by Eric Boot on 02-01-17.
 */
public class DelCommand implements Command {
    private GUIFacade guiFacade = GUIFacade.getInstance();

    public void execute(String inputCommand) {
        String[] result = inputCommand.split(" ");
        String type = result[1];
        String id = result[2];

        if(type.equals("train")){
            guiFacade.deleteTrain(new Train(id));
        }
        else if(type.equals("wagon")){
            guiFacade.deleteWagon(new PassengerWagon(id));
        }
    }
}
