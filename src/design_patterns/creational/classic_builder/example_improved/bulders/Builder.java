package design_patterns.creational.classic_builder.example_improved.bulders;

import design_patterns.creational.classic_builder.example_improved.products.OperationSystem;

public interface Builder {
    void setType();
    void setButton();
    void setTaskBar();
    void setIcons();
    OperationSystem getResult();
}
