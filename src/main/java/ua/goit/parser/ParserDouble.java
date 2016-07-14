package ua.goit.parser;


import java.util.ArrayList;
import java.util.List;

public class ParserDouble implements Parser <Double> {
    private char operator;
    private List<Double> operands = new ArrayList<>();

    @Override
    public void parseExpression(String expression) {
        String regex = "(?<=[-+*/])|(?=[-+*/])";
        String [] splitExpression = expression.trim().split(regex);
        try {
            if(splitExpression.length==3) {
                operator = splitExpression[1].charAt(0);
                operands.add(Double.parseDouble(splitExpression[0]));
                operands.add(Double.parseDouble(splitExpression[2]));
            }

        }catch (IllegalArgumentException e) {
            throw new RuntimeException("Incorrect expression");
        }
    }

    @Override
    public char getOperator() {
        return operator;
    }

    @Override
    public List<Double> getOperands() {
        return operands;
    }
}
