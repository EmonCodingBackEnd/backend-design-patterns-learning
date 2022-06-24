package com.coding.design.patterns.behavioral.p15strategy.example1;

public class EmptyPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("无促销活动！");
    }
}
