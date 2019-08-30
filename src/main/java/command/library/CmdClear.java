package command.library;

import command.framework.Command;
import interfaces.IDrive;
import interfaces.IOutputter;

public class CmdClear extends Command {
    public CmdClear(String clear, IDrive drive) {
        super(clear, drive);
    }

    @Override
    protected boolean checkNumberOfParameters(int numberOfParametersEntered) {
        return true;
    }

    @Override
    protected boolean checkParameterValues(IOutputter outputter) {
        return true;
    }

    @Override
    public void execute(IOutputter outputter) {
        for(int i = 0; i < 40; i++){
            outputter.newLine();
        }
    }
}
