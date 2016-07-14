package ua.goit.common;


import ua.goit.operation.OperationAdd;
import ua.goit.operation.OperationSubtract;

import java.util.ArrayList;
import java.util.List;

public class OperationProvider {
    List<Operation> operations;

    public OperationProvider() {
        init();
    }

    public void addNewOperation(Operation operation) {
        operations.add(operation);
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public void init(){
        operations = new ArrayList<>();
        this.operations.add(new OperationAdd());
        this.operations.add(new OperationSubtract());
    }
}
