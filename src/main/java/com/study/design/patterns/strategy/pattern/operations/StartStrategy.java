package com.study.design.patterns.strategy.pattern.operations;

public class StartStrategy extends OperationStrategy {
    public StartStrategy(OperationType operationType) {
        super(operationType);
    }

    public void doOperation() {
        System.out.println("Starting...");
    }
}
