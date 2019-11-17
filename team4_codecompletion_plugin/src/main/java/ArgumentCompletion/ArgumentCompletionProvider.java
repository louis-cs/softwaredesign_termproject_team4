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
        String now=null;
        String inside_parenthese = null;
        final Editor editor = parameters.getEditor();
        final CaretModel caretmodel = editor.getCaretModel();
        int line_num = caretmodel.getCurrentCaret().getLogicalPosition().line;

        int st_off = editor.getDocument().getLineStartOffset(line_num);
        int ed_off = editor.getDocument().getLineEndOffset(line_num);
        now = editor.getDocument().getText(new TextRange(st_off, ed_off));
        int last_pos_now = now.length();
        char last_word = now.charAt(last_pos_now-1);
        StringBuilder fixed_string = new StringBuilder();
        if(last_word == ')'){
            //check whether this statement is function declaration
            String[] string_split_version1 = now.split("\\(");
            fixed_string.append(string_split_version1[0]);
            if(string_split_version1.length==2){
                String last_type=null;
                String after_parenthese = string_split_version1[1];
                String[] string_split_version2 = after_parenthese.split(",");
                for(String param : string_split_version2){
                    String[] string_split_version3 = param.split("\\s+");

                    if(string_split_version3.length == 2)
                        last_type = string_split_version3[0];
                    if(last_type != null)
                        fixed_string.append(last_type);
                    fixed_string.append(" ");
                    fixed_string.append(string_split_version3[0]);
                    fixed_string.append(", ");
                }
                fixed_string.append(")");
            }
        }
        result.addElement(new ArgumentCompletionLookupElement(fixed_string.toString()));

    }


}
