package org.acme.wib;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@CommandLine.Command(mixinStandardHelpOptions = true)
public class GreetingCommand implements Runnable {

    @CommandLine.Option(names = {"-n", "--name"}, description = "Who will we greet?", defaultValue = "World")
    String name;

    @Override
    public void run() {
        System.out.println("Hello " + name + "!");
    }
}
