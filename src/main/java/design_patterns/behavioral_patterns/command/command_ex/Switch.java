package design_patterns.behavioral_patterns.command.command_ex;

//invoker
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
