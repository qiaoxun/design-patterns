package com.study.design.patterns.singleton;

/**
 * double check
 */
public class SingletonLazyDoubleCheck {

    private static SingletonLazyDoubleCheck instance;

    private SingletonLazyDoubleCheck() {}

    public static SingletonLazyDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (null == instance) {
                    instance = new SingletonLazyDoubleCheck();
                }
            }
        }
        return instance;
    }

}
