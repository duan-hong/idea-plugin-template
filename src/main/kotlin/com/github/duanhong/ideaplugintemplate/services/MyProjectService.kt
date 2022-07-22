package com.github.duanhong.ideaplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.duanhong.ideaplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
