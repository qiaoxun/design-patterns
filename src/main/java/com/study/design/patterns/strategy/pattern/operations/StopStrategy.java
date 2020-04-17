package com.study.design.patterns.strategy.pattern.operations;

public class StopStrategy extends OperationStrategy {
    public StopStrategy(OperationType operationType) {
        super(operationType);
    }

    public void doOperation() {
        System.out.println("Stopping...");
    }
}
