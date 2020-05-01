package com.study.design.patterns.singleton;

public class SingletonApp {
    public static void main(String[] args) {
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        SingletonHungry singletonHungry = SingletonHungry.getInstance();
        SingletonInnerClass singletonInnerClass = SingletonInnerClass.getInstance();
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonLazyDoubleCheck singletonLazyDoubleCheck = SingletonLazyDoubleCheck.getInstance();
    }
}
