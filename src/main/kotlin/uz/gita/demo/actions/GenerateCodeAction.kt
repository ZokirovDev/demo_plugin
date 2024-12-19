//package uz.gita.demo.actions
//
//import com.intellij.openapi.actionSystem.AnAction
//import com.intellij.openapi.actionSystem.AnActionEvent
//import com.intellij.psi.PsiFileFactory
//import com.intellij.lang.Language;
//
//class GenerateCodeAction : AnAction() {
//    override fun actionPerformed(event: AnActionEvent) {
//        val project = event.project
//        if (project == null) return;
//
//        val srcDir = project.baseDir.findChild("app")?.findChild("src")?.findChild("main")?.findChild("java")
//        if (srcDir != null) {
//            val code =
//                "package com.example;\n\npublic class GeneratedClass {\n    public void generatedMethod() {\n        System.out.println(\"Hello, generated code!\");\n    }\n}"
//            Language.findLanguageByID("kotlin")
//                ?.let { PsiFileFactory.getInstance(project).createFileFromText("GeneratedClass.java", it,code) }
//        }
//    }
//
//}