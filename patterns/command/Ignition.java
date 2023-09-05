package patterns.command;

// This is an invoker.
public class Ignition {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
