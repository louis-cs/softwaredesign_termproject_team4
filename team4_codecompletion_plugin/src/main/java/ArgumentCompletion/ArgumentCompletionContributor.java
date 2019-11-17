package ArgumentCompletion;

import com.intellij.codeInsight.completion.*;
import com.intellij.openapi.editor.Editor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Custom Completion Contributor
 * : to add condition to show popup. (condition: 'return ' typed)
 */
//BeforeCompletion -> DuringCOmpletion -> FillCompletion  순으로 호출되는거 같음
public class ArgumentCompletionContributor extends CompletionContributor {

    public ArgumentCompletionContributor() {

        super();
        System.out.println("Creation");
    }

    @Override
    public void fillCompletionVariants(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result) {
     System.out.println("FillCompletion");
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
        System.out.println("HandleEmptyLookup");
        return super.handleEmptyLookup(parameters, editor);
    }

    @Nullable
    @Override
    public AutoCompletionDecision handleAutoCompletionPossibility(@NotNull AutoCompletionContext context) {
        System.out.println("Text");
        return super.handleAutoCompletionPossibility(context);
    }

    @Override
    public void duringCompletion(@NotNull CompletionInitializationContext context) {
        System.out.println("duringCompletion");
        super.duringCompletion(context);
    }
}

