//package uz.gita.demo.add_dependency
//
//import com.intellij.openapi.project.Project
//
//fun updateProjectBuildFile(project: Project) {
//    val rootBuildFile = project.baseDir.findChild("build.gradle")
//    if (rootBuildFile != null) {
//        try {
//            var content = rootBuildFile.contentsToByteArray().toString()
//            if (!content.contains("id(\"com.google.dagger.hilt.android\")")) {
//                content =
//                    content.replace("}", "\nid(\"com.google.dagger.hilt.android\") version \"2.50\" apply false\n}")
//                rootBuildFile.setBinaryContent(content.toByteArray())
//            }
//            if (!content.contains("id(\"com.google.devtools.ksp\") ")) {
//                content =
//                    content.replace("}", "\nid(\"com.google.devtools.ksp\") version \"1.9.24-1.0.20\" apply false\n}")
//                rootBuildFile.setBinaryContent(content.toByteArray())
//            }
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
//    }
//}
//
//fun updateModuleBuildFile(project: Project) {
//    val appBuildFile = project.baseDir.findChild("app")?.findChild("build.gradle")
//
//    if (appBuildFile != null) {
//        try {
//            var content = appBuildFile.contentsToByteArray().toString()
//            //hilt plugin qoshish
//            if (!content.contains("id(\"com.google.dagger.hilt.android\")")) {
//                content = content.replace("plugins {", "plugins {\nid(\\\"com.google.dagger.hilt.android\\\")\"\n")
//            }
//            if (!content.contains("id(\"com.google.devtools.ksp\")")) {
//                content = content.replace("plugins {", "plugins {\nid(\"com.google.devtools.ksp\")\n")
//            }
//            //dependency qo`shish
//            if (!content.contains("ksp(\"com.google.dagger:hilt-compiler")) {
//                content =
//                    content.replace("dependencies {", "dependencies {\nksp(\"com.google.dagger:hilt-compiler:2.50\")\n")
//            }
//            if (!content.contains("implementation(\"com.google.dagger:hilt-android")) {
//                content = content.replace(
//                    "dependencies {",
//                    "dependencies {\nimplementation(\"com.google.dagger:hilt-android:2.50\")\n"
//                )
//            }
//
//            appBuildFile.setBinaryContent(content.toByteArray())
//
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
//    }
//}