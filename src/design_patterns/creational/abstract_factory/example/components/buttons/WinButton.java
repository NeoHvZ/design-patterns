package design_patterns.creational.abstract_factory.example.components.buttons;

public class WinButton implements Button {


    @Override
    public void render() {
        System.out.println("render - WinButton");
    }

    @Override
    public void onClick() {
        System.out.println("onClick - WinButton");
    }
}
