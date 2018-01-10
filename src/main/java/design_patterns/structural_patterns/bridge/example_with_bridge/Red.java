package design_patterns.structural_patterns.bridge.example_with_bridge;

public class Red implements Color {

    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
