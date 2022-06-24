package com.coding.design.patterns.creational.p04singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class HungrySingleton implements Serializable, Cloneable {
    private static final long serialVersionUID = 5909303667436216796L;


    private static final HungrySingleton hungrySingleton = new HungrySingleton();

//    static {
//        hungrySingleton = new HungrySingleton();
//    }

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * Called when object has been deserialized from a stream.
     *
     * @return {@code this}, or a replacement for {@code this}.
     * @throws ObjectStreamException if the object cannot be restored.
     * @see <a href="http://download.oracle.com/javase/1.3/docs/guide/serialization/spec/input.doc6.html">The Java Object Serialization Specification</a>
     */
    private Object readResolve() throws ObjectStreamException {
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
