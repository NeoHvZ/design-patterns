package design_patterns.creational.abstract_factory.example.factories;

import design_patterns.creational.abstract_factory.example.components.buttons.Button;

public interface GuiFactory {
    Button createButton();
}
