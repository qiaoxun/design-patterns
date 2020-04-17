package com.study.design.patterns.strategy.pattern.operations;

public enum OperationType {
    START("start"), STOP("stop"), RESTART("restart"), UPDATE("update");
    private String name;

    OperationType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
