package PostfixCompletion.Template;

import com.intellij.codeInsight.template.postfix.templates.PostfixTemplate;
import com.intellij.codeInsight.template.postfix.templates.PostfixTemplateProvider;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.*;
import com.intellij.ide.projectView.impl.nodes.PackageUtil;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.psi.*;
import com.thaiopensource.xml.dtd.om.Def;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IfPostfixTemplate extends PostfixTemplate {
    protected IfPostfixTemplate()
    {
        super("if","Make default if structure","if([statement]) {}");
    }

    @Override
    public boolean isApplicable(@NotNull PsiElement context, @NotNull Document copyDocument, int newOffset) {
        //TODO: Implement this
        return true;
    }

    @Override
    public void expand(@NotNull PsiElement context, @NotNull Editor editor) {
        //TODO: IMplement this
        
    }
}

p