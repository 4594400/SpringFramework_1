package ua.goit.common;


import ua.goit.operation.OperationAdd;
import ua.goit.operation.OperationSubtract;

import java.util.List;

public class OperationExecutor {
    private List<Operation> operations;

    public OperationExecutor(OperationProvider operationProvider) {
        this.operations = operationProvider.getOperations();
    }

    public String executeOperation(String expression) {
        if(expression.isEmpty()) {
            throw new IllegalArgumentException("Incorrect expression! Expression is empty.");
        }
        for (Operation operation : operations) {
            String result = operation.doOperation(expression);
            if (result!=null) {
                return result;
            }
        }

        throw new IllegalArgumentException("Unsupported operation");
    }

    private Operation determinantOperation (String expression) {
        String regex = "(?<=[-+*/])|(?=[-+*/])";
        String [] operands = expression.trim().split(regex);
        switch (operands[1].trim()) {
            case "+": return new OperationAdd();
            case "-": return new OperationSubtract();
            case "*": return new OperationAdd();
            case "/": return new OperationAdd();
            default: throw new IllegalArgumentException("Unsupported operation");
        }
    }
}
