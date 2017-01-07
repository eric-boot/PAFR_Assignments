package Assignment_2.src.command;

import Assignment_2.src.gui.GUIFacade;

import java.util.regex.Pattern;

/**
 * Created by Eric Boot on 02-01-17.
 */
public class CommandFactory {
    private String inputCommand;

    private final String ID = "([a-z])([a-z|0-9])*";
    private final String TYPE = "(train|wagon)";
    private final String NUMSEATS = "(\\snumseats\\s(([1-9])([0-9]){0,3}))?";

    // New commands
    private final String NEWTRAIN_COMMAND = "^(new\\strain\\s" + ID + ")$";
    private final String NEWWAGON_COMMAND = "^(new\\swagon\\s" + ID + NUMSEATS + ")$";
    private final String NEW_COMMAND = "(" + NEWTRAIN_COMMAND + "|" + NEWWAGON_COMMAND + ")";

    // Add, Get, Del and Rem Command
    private final String ADD_COMMAND = "^(add\\s" + ID + "\\sto\\s" + ID + ")$";
    private final String GET_COMMAND = "^(getnumseats\\s" + TYPE + "\\s" + ID + ")$";
    private final String DEL_COMMAND = "^(delete\\s" + TYPE + "\\s" + ID + ")$";
    private final String REM_COMMAND = "^(remove\\s" +ID + "\\sfrom\\s" + ID + ")$";

    private final String HELP_COMMAND = "^(help)$";

    private final String COMMANDS = NEW_COMMAND + "|" + ADD_COMMAND + "|" + GET_COMMAND + "|"
                                    + DEL_COMMAND + "|" + REM_COMMAND + "|" + HELP_COMMAND;

//    OM AAN TE ROEPEN!
//    CommandInputControl cic = new CommandInputControl(txtCommandInput.getText());
//			cic.checkCommand();


    public CommandFactory(String cmd)
    {
        inputCommand = cmd;
    }

    public boolean isCommand(String commandPattern)
    {
        Pattern p = Pattern.compile(commandPattern);
        return p.matcher(inputCommand).find();
    }

    public boolean checkCommand()
    {
        if (isCommand(COMMANDS))
        {
            try
            {
                handleCommand();
                return true;
            }

            catch (NullPointerException npe)
            {
                System.err.println(npe.getMessage());
            }
        }
        else
        {
            GUIFacade log = GUIFacade.getInstance();
            log.addLogline("command not correct, type 'help' for more info");
        }
        return false;
    }

    public void handleCommand() throws NullPointerException
    {
        Command command = null;

        if (isCommand(NEWTRAIN_COMMAND))
        {
            command = new NewTrainCommand();
        }
        else if (isCommand(NEWWAGON_COMMAND))
        {
            command = new NewWagonCommand();
        }
        else if (isCommand(ADD_COMMAND))
        {
            command = new AddCommand();
        }
        else if (isCommand(GET_COMMAND))
        {
            command = new GetCommand();
        }
        else if (isCommand(DEL_COMMAND))
        {
            command = new DelCommand();
        }
        else if (isCommand(REM_COMMAND))
        {
            command = new RemCommand();
        }
        else if (isCommand(HELP_COMMAND))
        {
            command = new HelpCommand();
        }

        command.execute(inputCommand);
    }
}
