package design_patterns.structural_patterns.bridge.example_with_bridge;

public class ShapeWithBridgeDemo {
    public static void main(String[] args) {
        Color blue = new Blue();

        Shape square = new Square(blue);

        Color red = new Red();

        Shape circle = new Circle(red);

        square.applyColor();
        circle.applyColor();


        Shape greenCircle = new Circle(new Green());
        greenCircle.applyColor();
    }

}
