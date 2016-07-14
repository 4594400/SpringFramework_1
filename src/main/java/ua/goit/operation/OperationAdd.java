package ua.goit.operation;


import ua.goit.common.Operation;

public class OperationAdd implements Operation {


    @Override
    public double doOperation(double valueOne, double valueTwo) {
        return valueOne + valueTwo;
    }

    @Override
    public char getOperator() {
        return '+';
    }
}
