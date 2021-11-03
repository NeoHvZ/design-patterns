package design_patterns.creational.factory_method.example.components.buttons;

//concrete product
public class HtmlButton implements Button{

    @Override
    public void render() {
        System.out.println("render - HtmlButton");
    }

    @Override
    public void onClick() {
        System.out.println("onClick - HtmlButton");
    }
}
