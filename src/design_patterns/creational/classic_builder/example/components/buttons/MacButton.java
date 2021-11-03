package design_patterns.creational.classic_builder.example.components.buttons;

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
