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
    public void CmdDir_WithoutParameters()
    {
        executeCommand("clear");
        TestHelper.assertContains("", testOutput);
    }

    @Test
    public void CmdDir_WithParameter()
    {
        executeCommand("clear");
        TestHelper.assertContains("", testOutput);
    }
}
