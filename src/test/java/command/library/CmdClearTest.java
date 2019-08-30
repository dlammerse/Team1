package command.library;

import helpers.TestHelper;
import org.junit.Before;
import org.junit.Test;

public class CmdClearTest extends CmdTest {
    @Before
    public void setUp()
    {
        // Add all commands which are necessary to execute this unit test
        // Important: Other commands are not available unless added here.
        commandInvoker.addCommand(new CmdClear("clear", drive));
    }

    @Test
    public void CmdClear_WithoutParameter()
    {
        executeCommand("clear");
        TestHelper.assertContains("", testOutput);
        TestHelper.assertContains("", testOutput);
    }

    @Test
    public void CmdClear_WithParameter()
    {
        executeCommand("clear bla");
        TestHelper.assertContains("", testOutput);
        TestHelper.assertContains("", testOutput);
    }
}
