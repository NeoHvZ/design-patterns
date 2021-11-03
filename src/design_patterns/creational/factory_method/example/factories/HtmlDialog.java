package design_patterns.creational.factory_method.example.factories;

import design_patterns.creational.factory_method.example.components.buttons.Button;
import design_patterns.creational.factory_method.example.components.buttons.HtmlButton;

//concrete creator
public class HtmlDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
