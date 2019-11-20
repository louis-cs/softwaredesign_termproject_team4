package ShortcutCompletion;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class ShortcutCompletionProvider extends CompletionProvider {
    /**
     * In 3 conditions(printf, vector, auto), completion will be added to completion list.
     * Most of variables exist just for figuring out condition.
     */
    @Override
    public void addCompletions(@NotNull CompletionParameters parameters,
                               ProcessingContext context,
                               @NotNull CompletionResultSet resultSet) {
        PsiElement position = parameters.getPosition();
        final Editor editor = parameters.getEditor();
        final CaretModel caretmodel = editor.getCaretModel();
        int line_num = caretmodel.getCurrentCaret().getLogicalPosition().line;

        int st_off = editor.getDocument().getLineStartOffset(line_num);
        int ed_off = editor.getDocument().getLineEndOffset(line_num);

        String now = editor.getDocument().getText(new TextRange(st_off, ed_off));

        if(now.contains("printf")){
            resultSet.addElement(new ShortcutCompletionLookupElement("System.out.println();"));
        }

        if(now.contains("vector")){
            resultSet.addElement(new ShortcutCompletionLookupElement("ArrayList<>"));
        }

        if(now.contains("auto")){
            resultSet.addElement(new ShortcutCompletionLookupElement("Object "));
        }

    }
}
