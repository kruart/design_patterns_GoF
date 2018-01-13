package design_patterns.behavioral_patterns.command.command_ex;

//receiver
public class Light {

    public void on() {
        System.out.println("Light switched on.");
    }

    public void off() {
        System.out.println("Light switched off.");
    }
}
