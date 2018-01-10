package design_patterns.structural_patterns.bridge.example_with_bridge;

public class Green implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying green color");
    }
}
