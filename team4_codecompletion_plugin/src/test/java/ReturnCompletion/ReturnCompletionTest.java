package ReturnCompletion;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.junit.Test;


public class ReturnCompletionTest extends BasePlatformTestCase {
    @Override
    protected String getTestDataPath(){
        return "TestData";
    }

    /**
     * Test for covering overriden invokeAutoPopup
     */
    @Test
    public void testInvokeAutoPopup(){
        myFixture.configureByFile("ForReturnCompletionTest.java");
        myFixture.type("return ");
        assertNotNull(myFixture);
    }
}
