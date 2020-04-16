package com.study.design.patterns.strategy.pattern;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        this.strategy.strategyInterface();
    }

}
