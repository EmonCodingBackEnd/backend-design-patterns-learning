package com.coding.design.principle.p3singleresponsibility;

public class Method {

    private void updateUserInfo(String userName, String... properties) {
        System.out.println("更新用户信息");
    }

    private void updateUsername(String userName, String address) {
        System.out.println("更新用户名称");
    }

    private void updateUserAddress(String userName, String address) {
        System.out.println("更新用户地址");
    }
}
