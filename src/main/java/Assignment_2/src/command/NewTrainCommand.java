package Assignment_2.src.command;

import Assignment_2.src.gui.GUIFacade;
import Assignment_2.src.models.Train;

/**
 * Created by Eric Boot on 02-01-17.
 */
public class NewTrainCommand implements Command {
    private GUIFacade guiFacade = GUIFacade.getInstance();

    public void execute(String inputCommand) {
        String[] result = inputCommand.split(" ");
        String id = result[2];

        guiFacade.addTrain(new Train(id));
    }
}
