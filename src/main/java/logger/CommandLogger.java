package logger;

import interfaces.IOutputter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CommandLogger {
    public void logCommand(String command, IOutputter outputter) {
        try{
            //Log the command in the log file
            String path = System.getProperty("user.dir") + "\\commandLogs.txt";
            File file = new File(path);

            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);

            // Write in file
            bw.append(command);
            bw.newLine();

            // Close connection
            bw.close();
        } catch (Exception e){
            outputter.printLine("warning: this command could not be logged");
        }

    }
}
