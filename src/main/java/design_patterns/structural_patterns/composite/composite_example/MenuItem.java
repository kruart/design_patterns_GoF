package design_patterns.structural_patterns.composite.composite_example;

public class MenuItem  extends MenuComponent {
    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
