import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.junit.Test;

public class ArgumentCompletionTest extends BasePlatformTestCase {
    @Override
    protected String getTestDataPath(){
        return "TestData";
    }

    /**
     * Test for covering overriden invokeAutoPopup
     */
    @Test
    public void testInvokeAutoPopup(){
        myFixture.configureByFile("CompleteTestData.java");
        myFixture.type(' ');
        assertNotNull(myFixture);
    }
}
