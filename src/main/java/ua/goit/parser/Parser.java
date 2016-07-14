package ua.goit.parser;

import java.util.List;

public interface Parser <T>{
    void parseExpression(String expression);
    char getOperator();
    List<T> getOperands();
}
