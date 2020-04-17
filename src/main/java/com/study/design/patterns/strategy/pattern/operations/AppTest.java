package com.study.design.patterns.strategy.pattern.operations;

public class AppTest {

    public static void main(String[] args) {
        OperationContext operationContext = new OperationContext(new StartStrategy(OperationType.START));
        operationContext.execute();
    }

}
