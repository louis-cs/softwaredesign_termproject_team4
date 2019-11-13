package ReturnCompletion;

import com.intellij.codeInsight.completion.*;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

/**
 * Custom Completion Contributor
 * : to add condition to show popup. (condition: 'return ' typed)
 */

public class ReturnCompletionContributor extends CompletionContributor {

    /**
     * Overriden invokeAutoPopup: invoke auto popup when ' ' is typed after 'return'
     */
    @Override
    public boolean invokeAutoPopup(@NotNull PsiElement position, char typeChar){
        if(position.getText().contains("return"))
            return typeChar == ' ';
        return false;
    }
}

