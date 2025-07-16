// Package names are separated by dots
// names are always lower case, with no underscores
// leftmost name is the highest most level
// rightmos name is the lowest level package

// ex.: package com.organisation.project.configuration:

// Package Hierarchy
/*
    com.organisation
        com.organisation.project1
            com.organisation.project1.feature1
            com.organisation.project1.feature2
        com.organisation.project2
            com.organisation.project2.feature1
        com.organisation.project3
            com.organisation.project3.feature1
            com.organisation.project3.feature2
            com.organisation.project3.feature3
*/
package namingConvetions:
    @main
    def packages1(): Unit = {

        // since its on same file there is no need to import
        admin.management.doMgmt()
        hr.doHr()
    }

    package admin:
        def doAdmin() = 
            println("Doing admin")
        
        package management:
            def doMgmt() =
                println("Doing admin management")

    package hr:
        def doHr() =
            println("Doing Hr")