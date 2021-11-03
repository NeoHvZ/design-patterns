package design_patterns.creational.factory_method.example.factories;

import design_patterns.creational.factory_method.example.components.buttons.Button;

//base creator
public abstract class Dialog {

    // some business logic
    public void render(){
        System.out.println("render - Dialog");
        Button button = createButton();
        button.render();
        button.onClick();
    }

    protected abstract Button createButton();
}
