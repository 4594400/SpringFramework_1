package ua.goit.common;


import ua.goit.operation.OperationAdd;
import ua.goit.operation.OperationSubtract;

import java.util.ArrayList;
import java.util.List;

public class OperationProvider {
    List<Operation> operations = new ArrayList();

    public void addNewOperation(Operation operation) {
        operations.add(operation);
    }

    public OperationProvider() {
        this.operations.add(new OperationAdd());
        this.operations.add(new OperationSubtract());
    }

    public List<Operation> getOperations() {
        return operations;
    }
}
