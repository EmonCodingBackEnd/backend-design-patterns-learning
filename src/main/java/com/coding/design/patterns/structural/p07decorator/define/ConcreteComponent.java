package com.coding.design.patterns.structural.p07decorator.define;

public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }

}
