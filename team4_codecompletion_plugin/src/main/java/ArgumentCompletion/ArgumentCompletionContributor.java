package ArgumentCompletion;

import com.intellij.codeInsight.completion.*;
import com.intellij.openapi.editor.Editor;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Custom Completion Contributor
 * : to add condition to show popup. (condition: 'return ' typed)
 */
//BeforeCompletion -> DuringCopletion -> FillCompletion
public class ArgumentCompletionContributor extends CompletionContributor {
    public ArgumentCompletionContributor() {
        super();
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(), new ArgumentCompletionProvider());


    }

    @Override
    public void fillCompletionVariants(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result) {
    // System.out.println("FillCompletion");
        result.addLookupAdvertisement("Argument Completion from Team G4!");

        super.fillCompletionVariants(parameters, result);
    }

    @Override
    public void beforeCompletion(@NotNull CompletionInitializationContext context) {
        System.out.println("Before");

        super.beforeCompletion(context);
    }

    @Nullable
    @Override
    public String handleEmptyLookup(@NotNull CompletionParameters parameters, Editor editor) {
       // System.out.println("HandleEmptyLookup");
        return super.handleEmptyLookup(parameters, editor);
    }

    @Nullable
    @Override
    public AutoCompletionDecision handleAutoCompletionPossibility(@NotNull AutoCompletionContext context) {
       // System.out.println("Text");
        return super.handleAutoCompletionPossibility(context);
    }

    @Override
    public void duringCompletion(@NotNull CompletionInitializationContext context) {
        System.out.println("duringCompletion");
        super.duringCompletion(context);
    }

    public boolean invokeAutoPopup(@NotNull PsiElement position, char typeChar){
            return typeChar == ')';
    }
}

