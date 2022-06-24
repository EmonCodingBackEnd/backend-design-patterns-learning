package com.coding.design.patterns.creational.p04singleton;

import java.util.HashMap;
import java.util.Map;

public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static final Map<String, Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (key != null && key.length() > 0 && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
