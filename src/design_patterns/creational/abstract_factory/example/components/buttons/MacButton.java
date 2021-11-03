package design_patterns.creational.abstract_factory.example.components.buttons;

public class MacButton implements Button {

    @Override
    public void render() {
        System.out.println("render - MacButton");
    }

    @Override
    public void onClick() {
        System.out.println("onClick - MacButton");
    }
}
