package ArgumentCompletion;

import com.intellij.codeInsight.completion.InsertionContext;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import org.jetbrains.annotations.NotNull;

public class ArgumentCompletionLookupElement extends LookupElement {

    private String msg;
    private String annotation;

    ArgumentCompletionLookupElement(String s)
    {
        annotation = "Missing Arguments!";
        msg = s;
    }

    @NotNull
    @Override
    public String getLookupString() {
        return msg;
    }

    @Override
    public void handleInsert(@NotNull InsertionContext context) {

        final Editor editor = context.getEditor();
        final Document document = editor.getDocument();

        int line_num = editor.getCaretModel().getLogicalPosition().line;

        int st_off = editor.getDocument().getLineStartOffset(line_num);
        int ed_off = editor.getDocument().getLineEndOffset(line_num);
        // Replace the selection with a fixed string.
        document.replaceString(st_off,ed_off,msg);

    }
}
