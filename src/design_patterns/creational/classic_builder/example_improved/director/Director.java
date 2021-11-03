package design_patterns.creational.classic_builder.example_improved.director;

import design_patterns.creational.classic_builder.example_improved.bulders.Builder;
import design_patterns.creational.classic_builder.example_improved.products.OperationSystem;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void createOS(){
        builder.setButton();
        builder.setIcons();
        builder.setType();
        builder.setTaskBar();
    }

    public OperationSystem getResult(){
        return builder.getResult();
    }
}
