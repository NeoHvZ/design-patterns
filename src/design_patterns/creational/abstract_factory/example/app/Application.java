package design_patterns.creational.abstract_factory.example.app;

import design_patterns.creational.abstract_factory.example.factories.GuiFactory;
import design_patterns.creational.abstract_factory.example.components.buttons.Button;

// client code
public class Application {
    private final Button button;


    public Application(GuiFactory guiFactory) {
        button = guiFactory.createButton();
    }

    public void render(){
        button.render();
    }
}
