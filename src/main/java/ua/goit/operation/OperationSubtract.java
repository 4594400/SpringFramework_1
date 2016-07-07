package ua.goit.operation;


import ua.goit.common.Operation;

import java.util.Date;

public class OperationSubtract implements Operation {
    @Override
    public String doOperation(String expression) {
        String result = "";
        String regex = "(?<=[-+*/])|(?=[-+*/])";
        String [] operands = expression.trim().split(regex);

        if (operands[1].equals("-") && (operands.length == 3)) {
            try {
                if(operands[0].contains(".") || operands[2].contains(".")) {
                    return  (expression + " = " + (Double.parseDouble(operands[0].trim()) -  Double.parseDouble(operands[2].trim())));
                } else {
                    return  (expression + " = " + (Long.parseLong(operands[0].trim()) - Long.parseLong(operands[2].trim())));
                }

            } catch (IllegalArgumentException e ) {
                throw new RuntimeException("Incorrect expression");
            }
        } else
        return null;
    }
}
