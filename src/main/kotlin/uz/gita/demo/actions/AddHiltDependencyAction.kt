//package uz.gita.demo.actions
//
//import com.android.tools.idea.gradle.project.sync.GradleSyncInvoker
//import com.android.tools.idea.gradle.project.sync.GradleSyncListener
//import com.google.wireless.android.sdk.stats.GradleSyncStats
//import com.intellij.openapi.actionSystem.AnAction
//import com.intellij.openapi.actionSystem.AnActionEvent
//import com.intellij.openapi.project.Project
//import uz.gita.demo.add_dependency.updateModuleBuildFile
//import uz.gita.demo.add_dependency.updateProjectBuildFile
//
//class AddHiltDependencyAction : AnAction() {
//    override fun actionPerformed(event: AnActionEvent) {
//        val project = event.project
//        if (project != null) {
//            updateProjectBuildFile(project)
//            updateModuleBuildFile(project)
//            val request = GradleSyncInvoker.Request(
//                trigger = GradleSyncStats.Trigger.TRIGGER_USER_REQUEST, // Specify the reason for the sync
//                importDefaultVariants = false // Set to true if sync is triggered during build
//            )
//            val listener = object : GradleSyncListener {
//                override fun syncSucceeded(project: Project) {
//                    println("Gradle sync succeeded!")
//                }
//            }
//            GradleSyncInvoker.getInstance().requestProjectSync(
//                project,
//                request = request,
//                listener = listener,
//            )
//        }
//    }
//
//}