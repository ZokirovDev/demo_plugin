//package uz.gita.demo.add_dependency
//
//import com.intellij.openapi.project.Project
//
//
//class AddDependency {
//    companion object{
//        fun addDependency(project: Project){
//            val buildFile = project.baseDir.findChild("app")?.findChild("build.gradle")
//
//            if (buildFile!=null){
//                try {
//                    var content = String(buildFile.contentsToByteArray())
//                    content+="\nimplementation(\"com.squareup.retrofit2:retrofit:2.9.0\")"
//                    buildFile.setBinaryContent(content.toByteArray())
//                }catch (e:Exception){
//                    e.printStackTrace()
//                }
//            }
//        }
//    }
//}