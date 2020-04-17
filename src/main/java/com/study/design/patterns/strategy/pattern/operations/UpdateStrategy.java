package com.study.design.patterns.strategy.pattern.operations;

public class UpdateStrategy extends OperationStrategy {
    public UpdateStrategy(OperationType operationType) {
        super(operationType);
    }

    public void doOperation() {
        System.out.println("updating...");
    }
}
