package design_patterns.creational.abstract_factory.example.factories;

import design_patterns.creational.abstract_factory.example.components.buttons.Button;
import design_patterns.creational.abstract_factory.example.components.buttons.WinButton;

public class WinFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }
}
