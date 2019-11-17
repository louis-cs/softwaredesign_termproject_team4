package ArgumentCompletion;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
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
                                  @NotNull CompletionResultSet result) {

        PsiElement psiElement = parameters.getOriginalPosition();


        System.out.println(psiElement.toString());
        System.out.println(parameters.toString());
        result.addElement(LookupElementBuilder.create("is_test"));
    }
}
