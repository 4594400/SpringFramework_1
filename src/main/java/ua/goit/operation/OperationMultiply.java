package ua.goit.operation;


import ua.goit.common.Strategy;

public class OperationMultiply implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
