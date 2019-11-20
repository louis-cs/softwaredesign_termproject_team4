package ShortcutCompletion;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class ShortcutCompletionContributor extends CompletionContributor {
    public ShortcutCompletionContributor(){
        super();
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(), new ShortcutCompletionProvider());

    }
    /**
     * Overriden invokeAutoPopup: invoke auto popup when '(' is typed after 'printf'
     *                                               ||  '<' is typed after 'vector'
     *                                               ||  ' ' is typed after 'auto'
     */
    @Override
    public boolean invokeAutoPopup(@NotNull PsiElement position, char typeChar){
        if(position.getText().contains("printf"))
            return typeChar == '(';
        if(position.getText().contains("vector"))
            return typeChar == '<';
        if(position.getText().contains("auto"))
            return typeChar == ' ';
        return false;
    }
}
