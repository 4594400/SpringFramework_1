package ua.goit.common;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class OperationExecutorTest {
    OperationExecutor operationExecutor;

    @Before
    public void setUp() throws Exception {
        operationExecutor = new OperationExecutor(new OperationProvider());


    }

    @Test
    public void testExecuteOperationInteger() throws Exception {
        assertEquals("32 - 6 = 26", operationExecutor.executeOperation("32 + 6"));
    }

    @Ignore
    @Test
    public void testExecuteOperationDouble() throws Exception {
        assertEquals("32.6 - 6 = 26.6", operationExecutor.executeOperation("32.6 - 6"));
    }
}