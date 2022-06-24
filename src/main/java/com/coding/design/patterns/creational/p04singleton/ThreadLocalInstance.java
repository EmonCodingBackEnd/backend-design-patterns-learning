package com.coding.design.patterns.creational.p04singleton;

public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance>
            threadLocalInstanceThreadLocal = ThreadLocal.withInitial(ThreadLocalInstance::new);

    private ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstanceThreadLocal.get();
    }
}
