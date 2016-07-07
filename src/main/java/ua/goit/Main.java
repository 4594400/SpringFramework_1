package ua.goit;


import ua.goit.common.OperationExecutor;
import ua.goit.common.OperationProvider;
import ua.goit.operation.OperationSubtract;

public class Main {
    public static void main(String[] args) {
        //OperationExecutor executor = new OperationExecutor(new OperationAdd());
        //System.out.println(executor.executeOperation(4, 5));

        OperationExecutor executor = new OperationExecutor(new OperationProvider());
        System.out.println(executor.executeOperation("33 + 36"));

       /* executor = new OperationExecutor(new OperationMultiply());
        System.out.println(executor.executeOperation(2, 8));

        executor = new OperationExecutor(new OperationDivide());
        System.out.println(executor.executeOperation(6, 3));*/

    }
}
