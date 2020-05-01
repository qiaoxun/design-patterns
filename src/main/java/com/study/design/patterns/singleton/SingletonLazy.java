package com.study.design.patterns.singleton;

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        synchronized (instance) {
            if (null == instance) {
                instance = new SingletonLazy();
            }
            return instance;
        }
    }

}
