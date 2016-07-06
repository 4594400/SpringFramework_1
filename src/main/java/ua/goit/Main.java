package ua.goit;


import ua.goit.common.Executor;
import ua.goit.operation.OperationAdd;
import ua.goit.operation.OperationDivide;
import ua.goit.operation.OperationMultiply;
import ua.goit.operation.OperationSubstract;

public class Main {
    public static void main(String[] args) {
        Executor executor = new Executor(new OperationAdd());
        System.out.println(executor.executeStrategy(4, 5));

        executor = new Executor(new OperationSubstract());
        System.out.println(executor.executeStrategy(3, 2));

        executor = new Executor(new OperationMultiply());
        System.out.println(executor.executeStrategy(2, 8));

        executor = new Executor(new OperationDivide());
        System.out.println(executor.executeStrategy(6, 3));

    }
}
