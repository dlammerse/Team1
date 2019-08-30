package command.library;

import command.framework.Command;
import interfaces.IDrive;
import interfaces.IOutputter;

public class CmdVersie extends Command {
    public CmdVersie(String versie, IDrive drive) {
        super(versie, drive);
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
        outputter.printLine(System.getProperty("os.name"));
    }
}
