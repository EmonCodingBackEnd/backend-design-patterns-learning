package com.coding.design.patterns.behavioral.p15strategy.example1;

public class ManJianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("满减促销，满200减20元！");
    }
}
