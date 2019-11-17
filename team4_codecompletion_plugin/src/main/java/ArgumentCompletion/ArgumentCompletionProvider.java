package ArgumentCompletion;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class ArgumentCompletionProvider extends CompletionProvider {
  //  private PsiKeyword last_keyword;

    ArgumentCompletionProvider()
    {
        super();
      //  last_keyword = null;
    }
    @Override
    protected void addCompletions(@NotNull CompletionParameters parameters,
                                  @NotNull ProcessingContext context,
                                  @NotNull CompletionResultSet result)
    {
        final Editor editor = parameters.getEditor();
        final CaretModel caretmodel = editor.getCaretModel();
        int line_num = caretmodel.getCurrentCaret().getLogicalPosition().line;

        int st_off = editor.getDocument().getLineStartOffset(line_num);
        int ed_off = editor.getDocument().getLineEndOffset(line_num);
        System.out.println(editor.getDocument().getText(new TextRange(st_off, ed_off)));

        //TODO: Check declaration text
        String fixed_string = " ";
        result.addElement(new ArgumentCompletionLookupElement(fixed_string));

    }


}
