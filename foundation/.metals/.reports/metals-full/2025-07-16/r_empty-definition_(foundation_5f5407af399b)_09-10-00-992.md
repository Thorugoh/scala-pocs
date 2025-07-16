error id: file://<WORKSPACE>/PackagesnamingConvention.scala:`<none>`.
file://<WORKSPACE>/PackagesnamingConvention.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 746
uri: file://<WORKSPACE>/PackagesnamingConvention.scala
text:
```scala
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
    
@main
def packages(): Unit = {

    // since its on same file there is n@@o need to import
    admin.doAdmin()
    hr.doHr()
}

package admin:
    def doAdmin() = 
        println("Doing admin")

package hr:
    def doHr() =
        println("Doing Hr")
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.