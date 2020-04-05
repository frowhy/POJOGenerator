package com.robohorse.robopojogenerator.models

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiDirectory
import com.robohorse.robopojogenerator.generator.consts.annotations.AnnotationEnum

data class GenerationModel(
        val rewriteClasses: Boolean,
        val useKotlin: Boolean,
        val annotationEnum: AnnotationEnum,
        val rootClassName: String,
        val content: String?,
        val useSetters: Boolean,
        val useGetters: Boolean,
        val useStrings: Boolean
)

data class ProjectModel(
        val directory: PsiDirectory,
        val packageName: String?,
        val virtualFolder: VirtualFile,
        val project: Project
)

data class FieldModel(
        val classType: String? = null,
        val fieldName: String? = null,
        val fieldNameFormatted: String? = null,
        val annotation: String? = null
)
