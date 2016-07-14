package ua.goit.operation;


import ua.goit.common.Operation;

public class OperationSubtract implements Operation {


    @Override
    public double doOperation(double valueOne, double valueTwo) {
        return valueOne - valueTwo;
    }

    @Override
    public char getOperator() {
        return '-';
    }
}































     /*@Override
    public String doOperation(String expression) {
        String result = "";
        String regex = "(?<=[-+*//*])|(?=[-+*//*])";
        String [] operands = expression.trim().split(regex);

        if (operands[1].equals("-") && (operands.length == 3)) {
            try {
                if(operands[0].contains("f") || operands[2].contains("f") ) {
                    return  (expression + " = " + (Double.parseDouble(operands[0].trim()) -  Double.parseDouble(operands[2].trim())));
                } else {
                    return  (expression + " = " + (new BigDecimal(operands[0].trim()).subtract(new BigDecimal(operands[2].trim()))));
                }

            } catch (IllegalArgumentException e ) {
                throw new RuntimeException("Incorrect expression");
            }
        } else
        return null;
    }*/

