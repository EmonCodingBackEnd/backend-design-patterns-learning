package com.coding.design.patterns.structural.p10composite.define;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component comp) {
        children.add(comp);
    }

    @Override
    public void remove(Component comp) {
        children.remove(comp);
    }

    @Override
    public void display(int depth) {
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            prefix.append("-");
        }
        System.out.println(prefix + name);
        children.forEach(component -> {
            component.display(depth + 2);
        });
    }
}
