package com.coding.design.patterns.structural.p08adapter.example1classadapter;

import com.coding.design.patterns.structural.p08adapter.example2objectadapter.Adaptee;
import com.coding.design.patterns.structural.p08adapter.example2objectadapter.Target;

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
