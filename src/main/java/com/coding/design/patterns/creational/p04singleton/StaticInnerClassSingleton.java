package com.coding.design.patterns.creational.p04singleton;

/**
 * 虽然可以重排序，但由于 Class对象的初始化锁，保证了其他线程看不到重排序的结果。
 */
public class StaticInnerClassSingleton {
    private static class InnerClass {
        private static final StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }

    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
}
