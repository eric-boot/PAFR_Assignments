package Assignment_2.src.command;

import Assignment_2.src.gui.GUIFacade;
import Assignment_2.src.models.Train;

/**
 * Created by Eric Boot on 02-01-17.
 */
public class NewTrainCommand implements Command {
    private GUIFacade guiFacade = GUIFacade.getInstance();

    public void execute(String inputCommand) {
//        https://github.com/cwi-swat/dokre/blob/master/systems/RichRail10/src/assignment2/command/NewTrainCommand.java
        String[] result = inputCommand.split(" ");
        String id = result[2];

        guiFacade.addTrain(new Train(id));
    }
}
