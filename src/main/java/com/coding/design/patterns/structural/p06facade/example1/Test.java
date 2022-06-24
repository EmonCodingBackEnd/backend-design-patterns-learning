package com.coding.design.patterns.structural.p06facade.example1;

public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService service = new GiftExchangeService();
        service.giftExchange(pointsGift);
    }
}
