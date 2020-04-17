package com.study.design.patterns.strategy.pattern.operations;

public class ReStartStrategy extends OperationStrategy {
    public ReStartStrategy(OperationType operationType) {
        super(operationType);
    }

    public void doOperation() {
        System.out.println("ReStarting...");
    }
}
