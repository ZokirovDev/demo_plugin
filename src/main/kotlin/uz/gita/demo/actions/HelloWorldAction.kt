package uz.gita.demo.actions

import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class HelloWorldAction:AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        val notificationGroup = NotificationGroup(
            displayId = "myActionId",
            displayType = NotificationDisplayType.BALLOON,
            isLogByDefault = true
        )
        notificationGroup.createNotification(
            title = "My Title",
            content = "Hello world",
            type = NotificationType.INFORMATION,
            listener = null
        ).notify(event.project)
    }

}