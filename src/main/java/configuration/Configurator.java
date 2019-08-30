/*
 * DOSBox, Scrum.org, Professional Scrum Developer Training
 * Authors: Rainer Grau, Daniel Tobler, Zuehlke Technology Group
 * Copyright (c) 2013 All Right Reserved
 */ 

package configuration;

import filesystem.Drive;
import interfaces.IDrive;
import interfaces.IExecuteCommand;
import invoker.CommandInvoker;

import command.library.CommandFactory;

import console.Console;

import java.io.File;

/**Configures the system. Contains the method main().
 */
public class Configurator {

	public static void main(String[] args) {
		Configurator config = new Configurator();
		config.configurateSystem();
	}

	/**Configures the system for a console application.
	 */
	public void configurateSystem() {
		
		// Create file system with initial root directory
		// and read any persistent information.
		IDrive drive = new Drive("C");
		drive.restore();

		// Create all commands and invoker
		CommandFactory factory = new CommandFactory(drive);
		CommandInvoker commandInvoker = new CommandInvoker();
		commandInvoker.setCommands(factory.getCommandList());
		IExecuteCommand invoker = commandInvoker;
		


		// Add file for logging if that file does not exist yet
		try{
			String content = "This is the content to write into create file";
            String path = System.getProperty("user.dir") + "\\commandLogs.txt";

            File file = new File(path);

			if (!file.exists()) {
				file.createNewFile();
			}
		}
		catch(Exception e){
			System.out.println(e);
		}

		// Setup console for input and output
		Console console = new Console(invoker, drive);

		// Start console
		console.processInput();
	}
}
