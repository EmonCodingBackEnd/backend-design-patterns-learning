package com.coding.design.patterns.creational.p04singleton;

public enum EnumInstance {
    // 单例引用欧冠
    INSTANCE {
        protected void printTest() {
            System.out.println("Emon Print Test");
        }
    };

    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
