package command.library;

import command.framework.Command;
import interfaces.IDrive;
import interfaces.IOutputter;

public class CmdExit extends Command {
    public CmdExit(String exit, IDrive drive) {
        super(exit, drive);
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

    }
}
