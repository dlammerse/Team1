package command.library;

import org.junit.Before;
import org.junit.Test;
import helpers.TestHelper;

public class CmdVersieTest extends CmdTest {
    @Before
    public void setUp() {
        // Check this file structure in base class: crucial to understand the tests.
        this.createTestFileStructure();

        // Add all commands which are necessary to execute this unit test
        // Important: Other commands are not available unless added here.
        this.commandInvoker.addCommand(new CmdVersie("ver", this.drive));
    }

    @Test
    public void CmdVersie_isRetruningOSVersion()
    {
        // given
        String system = System.getProperty("os.name");

        // when
        executeCommand("ver");

        // then
        TestHelper.assertContains(system, testOutput.toString());
    }

    @Test
    public void CmdVersie_slashw_isRetruningOSVersion()
    {
        // given
        String system = System.getProperty("os.name");

        // when
        executeCommand("ver /w");

        // then
        TestHelper.assertContains("Team UNICORN!! :D", testOutput.toString());
    }

    @Test
    public void CmdVersie_slashW_isRetruningOSVersion()
    {
        // given
        String system = System.getProperty("os.name");

        // when
        executeCommand("ver /W");

        // then
        TestHelper.assertContains("Team UNICORN!! :D", testOutput.toString());
    }

    @Test
    public void CmdVersie_withIncorrectParameter_isReturningError()
    {
        // given
        String system = System.getProperty("os.name");

        // when
        executeCommand("ver /Wasdas");

        // then
        TestHelper.assertContains("unknown parameter, please use /w to get information about the team.", testOutput.toString());
    }
}
