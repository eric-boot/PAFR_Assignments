package Assignment_2.src.command;

import Assignment_2.src.gui.GUIFacade;

/**
 * Created by Eric Boot on 06-01-17.
 */
public class HelpCommand implements Command {
    GUIFacade guiFacade = GUIFacade.getInstance();

    public void execute(String inputCommand) {
        guiFacade.addLogline("\n" +
                "newcommand \t: newtraincommand | newwagoncommand;\n" +
                "newtraincommand \t: 'new' 'train' ID;\n" +
                "newwagoncommand\t: 'new' 'wagon' ID ('numseats' NUMBER)?;\n" +
                "addcommand \t: 'add' ID 'to' ID;\n" +
                "getcommand \t: 'getnumseats' type ID;\n" +
                "delcommand \t: 'delete' type ID;\n" +
                "remcommand\t: 'remove' ID 'from' ID;\n" +
                "\n" +
                "type\t\t: ('train') | ('wagon');\n");
    }
}
