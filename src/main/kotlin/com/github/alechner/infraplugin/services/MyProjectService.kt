package com.github.alechner.infraplugin.services

import com.intellij.openapi.project.Project
import com.github.alechner.infraplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
