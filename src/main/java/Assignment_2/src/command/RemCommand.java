package Assignment_2.src.command;

import Assignment_2.src.gui.GUIFacade;
import Assignment_2.src.models.PassengerWagon;
import Assignment_2.src.models.Train;

/**
 * Created by Eric Boot on 02-01-17.
 */
public class RemCommand implements Command {
    private GUIFacade guiFacade = GUIFacade.getInstance();

    public void execute(String inputCommand) {
        String[] result = inputCommand.split(" ");
        String wg = result[1];
        String tr = result[3];

        guiFacade.removeWagonFromTrain(new PassengerWagon(wg), new Train(tr));

    }
}
