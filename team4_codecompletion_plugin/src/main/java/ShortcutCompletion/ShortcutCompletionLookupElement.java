package ShortcutCompletion;

import com.intellij.codeInsight.completion.InsertionContext;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.util.TextRange;
import org.jetbrains.annotations.NotNull;

/**
 * custom class for replacing string (e. g. printf() -> System.out.println();)
 */

public class ShortcutCompletionLookupElement extends LookupElement {

    //  "Func" is string like "System.out.println();" or "ArrayList<>" or "Object "
    private String Func;

    public ShortcutCompletionLookupElement(String Func){
        this.Func = Func;
    }

    //  Actually means this element's name
    @Override
    public String getLookupString(){
        return Func;
    }

    /**
     * replace the C language string to Java Language string (for printf, vector, auto)
     * We should consider 'indentation'. So, I use new variable "indentation_off".
     * "indentation_off" has role that represents relative offset of trimmed string.
     * Finally, wrong string would be replaced with correct string(i.e. Func)
     */
    @Override
    public void handleInsert(@NotNull InsertionContext context){
        final Editor editor = context.getEditor();
        final Document document = editor.getDocument();

        int line_num = editor.getCaretModel().getLogicalPosition().line;

        int st_off = document.getLineStartOffset(line_num);
        int ed_off = document.getLineEndOffset(line_num);
        int indentation_off = 0;
        String now = editor.getDocument().getText(new TextRange(st_off, ed_off));

        //get trimmed string's start offset
        while (now.charAt(indentation_off) == ' ') {
            indentation_off++;
        }

        document.replaceString(st_off + indentation_off, ed_off, Func);

    }
}
