package com.study.design.patterns.strategy.pattern.operations;

public abstract class OperationStrategy {

    private OperationType operationType;

    public OperationStrategy(OperationType operationType) {
        this.operationType = operationType;
    }

    protected void addLogs() {
        System.out.println("Operation " + operationType.getName() + " is happening...");
    }

    abstract void doOperation();

    public void execute() {
        addLogs();
        doOperation();
    }
}
