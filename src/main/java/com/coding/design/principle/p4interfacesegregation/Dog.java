package com.coding.design.principle.p4interfacesegregation;

public class Dog implements ISwimAnimalAction, IEatAnimalAction {
    @Override
    public void eat() {}

    @Override
    public void swim() {}
}
