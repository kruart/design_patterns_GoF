package design_patterns.behavioral_patterns.command.command_ex;

import java.util.List;

public class AllLightsCommand implements Command {

    private List<Light> lights;

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for (Light light : lights) {
            if(light.isOn()) {
                light.toggle();
            }
        }
    }

}
