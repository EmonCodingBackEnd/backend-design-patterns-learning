package com.coding.design.patterns.creational.p04singleton;

public class LazyDoubleCheckSingleton {
    // 设置 volatile 禁止了重排序
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {

                if (lazyDoubleCheckSingleton == null) {
                    /*
                    第一步：分配内存给这个对象
                    第二步：初始化这个对象
                    第三步：设置 lazyDoubleCheckSingleton 指向刚分配的内存
                    重点：指令重排序，可能会颠倒 第二步 和 第三步
                    intra-thread semantics
                     */
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
