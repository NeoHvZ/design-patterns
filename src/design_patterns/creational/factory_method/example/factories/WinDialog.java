package design_patterns.creational.factory_method.example.factories;

import design_patterns.creational.factory_method.example.components.buttons.Button;
import design_patterns.creational.factory_method.example.components.buttons.WinButton;

//concrete creator
public class WinDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new WinButton();
    }
}
