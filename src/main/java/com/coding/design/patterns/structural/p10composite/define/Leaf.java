package com.coding.design.patterns.structural.p10composite.define;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component comp) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component comp) {
        System.out.println("cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            prefix.append("-");
        }
        System.out.println(prefix + name);
    }
}
