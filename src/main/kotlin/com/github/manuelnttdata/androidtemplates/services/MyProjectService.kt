package com.github.manuelnttdata.androidtemplates.services

import com.intellij.openapi.project.Project
import com.github.manuelnttdata.androidtemplates.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
