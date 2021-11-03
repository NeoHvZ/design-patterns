package design_patterns.creational.factory_method.example.components.buttons;

//concrete product
public class WinButton implements Button{

    @Override
    public void render() {
        System.out.println("render - winbutton");
    }

    @Override
    public void onClick() {
        System.out.println("onClick - winbutton");
    }
}
