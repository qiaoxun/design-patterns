package com.study.design.patterns.strategy.pattern.operations;

public class OperationContext {
    private OperationStrategy operationStrategy;

    public OperationContext(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public void execute() {
        this.operationStrategy.execute();
    }

}
