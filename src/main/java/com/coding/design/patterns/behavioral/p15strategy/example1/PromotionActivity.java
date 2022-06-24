package com.coding.design.patterns.behavioral.p15strategy.example1;

public class PromotionActivity {

    private PromotionStrategy strategy;

    public PromotionActivity(PromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePromotionStrategy() {
        strategy.doPromotion();
    }
}
