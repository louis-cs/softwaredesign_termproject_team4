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
import com.intellij.psi.impl.source.tree.java.PsiIfStatementImpl;
import com.thaiopensource.xml.dtd.om.Def;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sun.security.util.Debug;
import sun.tools.tree.Context;

public class IfPostfixTemplate extends PostfixTemplate {

    public IfPostfixTemplate()
    {
        super(null,"if","if([statement]) {}",null);
    }

    @Override
    public boolean isApplicable(@NotNull PsiElement context, @NotNull Document copyDocument, int newOffset) {
        //TODO: Implement this
        return true;
    }

    @Override
    public void expand(@NotNull PsiElement context, @NotNull Editor editor) {
    }
}
