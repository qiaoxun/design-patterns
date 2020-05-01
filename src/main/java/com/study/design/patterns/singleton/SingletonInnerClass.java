package com.study.design.patterns.singleton;

/**
 * double check
 */
public class SingletonInnerClass {

    private static class SingletonHolder {
        static SingletonInnerClass instance = new SingletonInnerClass();
    };

    private SingletonInnerClass() {}

    public static SingletonInnerClass getInstance() {
        return SingletonHolder.instance;
    }

}
