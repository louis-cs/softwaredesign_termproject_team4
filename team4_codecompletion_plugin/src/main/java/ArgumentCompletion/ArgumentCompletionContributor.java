package ArgumentCompletion;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Custom Completion Contributor
 * : to add condition to show popup. (condition: 'return ' typed)
 */

public class ArgumentCompletionContributor extends CompletionContributor {

    @Override
    public void fillCompletionVariants(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result) {
        result.addLookupAdvertisement("Argument Completion from Team G4!");

        super.fillCompletionVariants(parameters, result);
    }
}

