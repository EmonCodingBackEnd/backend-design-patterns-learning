package com.coding.design.patterns.creational.p04singleton;

public class T implements Runnable {
    @Override
    public void run() {
        // LazySingleton instance = LazySingleton.getInstance();
        // LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        // StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();

//        ContainerSingleton.putInstance("singleton", new Object());
//        Object instance = ContainerSingleton.getInstance("singleton");

        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + instance);
    }
}
