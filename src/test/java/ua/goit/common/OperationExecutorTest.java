package ua.goit.common;

import org.junit.Before;
import org.junit.Test;
import ua.goit.parser.ParserDouble;

import static org.junit.Assert.assertEquals;


public class OperationExecutorTest {
    OperationExecutor operationExecutor;
    OperationProvider operationProvider;

    @Before
    public void setUp() throws Exception {
        operationExecutor = new OperationExecutor();
        operationProvider = new OperationProvider();
        operationProvider.init();
        operationExecutor.setOperationProvider(new OperationProvider());
        operationExecutor.setParser(new ParserDouble());

    }

    @Test
    public void testExecuteOperationInteger() throws Exception {
        String expression = "32 - 6";
        String actual = expression + " = " + operationExecutor.executeOperation(expression);
        assertEquals("32 - 6 = 26.0", actual);
    }
    @Test
    public void testExecuteOperationLong() throws Exception {
        String expression = "800 - 200";
        String actual = expression + " = " + operationExecutor.executeOperation(expression);
        assertEquals("800 - 200 = 600.0", actual);
    }


    @Test
    public void testExecuteOperationFloat() throws Exception {
        String expression = "32.6f - 6.3f";
        String actual = expression + " = " + operationExecutor.executeOperation(expression);
        assertEquals("32.6f - 6.3f = 26.3", actual);
    }

    @Test
    public void testExecuteOperationDouble() throws Exception {
        String expression = "52.6 - 16.3";
        String actual = expression + " = " + operationExecutor.executeOperation(expression);
        assertEquals("52.6 - 16.3 = 36.3", actual);
    }
    @Test(expected = Exception.class)
    public void testExecuteOperationText() throws Exception {
        String expression = "sa - da";
        String actual = expression + " = " + operationExecutor.executeOperation(expression);
        //assertEquals("32.6 - 6.3 = 26.3", actual);
    }
}