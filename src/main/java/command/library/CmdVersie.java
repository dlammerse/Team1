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
        if(this.getParameterCount() > 0) {
            String parameter = this.getParameterAt(0);
            if(parameter.equals("/w") || parameter.equals("/W")){
                outputter.printLine("Team UNICORN!! :D");
            } else {
                outputter.printLine("unknown parameter, please use /w to get information about the team.");
            }
        } else {
            outputter.printLine(System.getProperty("os.name"));
        }
    }
}
