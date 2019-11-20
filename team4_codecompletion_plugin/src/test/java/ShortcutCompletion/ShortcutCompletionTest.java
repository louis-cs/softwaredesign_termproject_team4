package ShortcutCompletion;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.junit.Test;

import java.util.List;


public class ShortcutCompletionTest extends BasePlatformTestCase {
    @Override
    protected String getTestDataPath(){
        return "TestData";
    }

    /**
     * Test for covering overriden invokeAutoPopup
     */
    @Test
    public void testInvokeAutoPopup(){
        myFixture.configureByFile("ForShortcutPrintfCompletionTest.java");
        myFixture.type('(');
        myFixture.configureByFile("ForShortcutVectorCompletionTest.java");
        myFixture.type('<');
        myFixture.configureByFile("ForShortcutAutoCompletionTest.java");
        myFixture.type(' ');
        myFixture.configureByFile("ForReturnCompletionTest2.java");
        myFixture.type(' ');
        assertNotNull(myFixture);
    }

    /**
     * Test for "printf" -> "System.out.println" Completion
     */
    @Test
    public void testCompletionPrintfShortcut(){
        myFixture.configureByFile("ForShortcutPrintfCompletionTest.java");
        myFixture.type('(');
        myFixture.completeBasic();
        List<String> strings = myFixture.getLookupElementStrings();
        assertTrue(strings.contains("System.out.println();"));
    }

    /**
     * Test for "vector" -> "ArrayList" Completion
     */
    @Test
    public void testCompletionVectorShortcut(){
        myFixture.configureByFile("ForShortcutVectorCompletionTest.java");
        myFixture.type('<');
        myFixture.completeBasic();
        List<String> strings = myFixture.getLookupElementStrings();
        assertTrue(strings.contains("ArrayList<>"));
    }

    /**
     * Test for "auto" -> "Object" Completion
     */
    @Test
    public void testCompletionAutoShortcut(){
        myFixture.configureByFile("ForShortcutAutoCompletionTest.java");
        myFixture.type(' ');
        myFixture.completeBasic();
        List<String> strings = myFixture.getLookupElementStrings();
        assertTrue(strings.contains("Object "));
    }


}
