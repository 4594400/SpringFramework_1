package ua.goit.common;


import ua.goit.parser.Parser;

public class OperationExecutor {
    private OperationProvider operationProvider;
    private Parser<Double> parser;


    public double executeOperation(String expression) {
        boolean isOperatorFound = false;
        double result = 0;

        if (expression.isEmpty()) {
            throw new IllegalArgumentException("Incorrect expression! Expression is empty.");
        }

        parser.parseExpression(expression);

        for (Operation operation : operationProvider.getOperations()) {
            if (operation.getOperator() != parser.getOperator()) {
                continue;
            }
            result = operation.doOperation(parser.getOperands().get(0), parser.getOperands().get(1));
            isOperatorFound = true;
        }
        if (!isOperatorFound) {
            throw new IllegalArgumentException("Unsupported operation");
        }
        return result;
    }


    public OperationProvider getOperationProvider() {
        return operationProvider;
    }

    public void setOperationProvider(OperationProvider operationProvider) {
        this.operationProvider = operationProvider;
    }

    public Parser getParser() {
        return parser;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }


}
