# GravityTTC
Solution for the Java Refactoring Case at TTC'15

# Contents of the Repository:
  
  - ExtendedJamopp      
      - Generated source code of the preprocessed JaMoPP Meta Model
  
  - GravityMetaModels
      - Contains the visual specification of TGGs, SDMs and Meta Models
        (Open the GravityMetaModels.eap with Enterprise Architect to explore the specifications)
  
  - GravityTGG
      - Genrated code of the transformation from preprocessed JaMoPP to PG using TGGs
  
  - org.emftext.language.java.recource.bcel
      - Apache BCEL 6 Beta for JaMoPP running with Java 8
      
  - Refactorings
      - Generated source code of the Refactorings using SDMs
      
  - TTCSolution
      - Connecting all the code fragments and implementing the “TestInterface”
      
  - TypeGraphBasic
      - Generated source code representing the TypeGraph
      
  - GravityTTC.jar
      - Compiled solution (executable with ARTE)
      
  - README.md
      - this README
      
  - SolutionGravityTCC.pdf
      - Solution description paper
      
      
# Required Programs:

  - Java JDK8 (available at: "http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html")
  - Eclipse Modeling Tools (available at: "http://www.eclipse.org/downloads/"), with installed plug-ins: 
      - JaMoPP (available in "Eclipse Marketplace)
      - eMoflon (available at: "http://www.emoflon.org/emoflon/installation/")
  - Enterprise Architect (Free 30 day trial avaivable at "http://www.sparxsystems.com/products/ea/trial.html"), with installed plug-in:
      - eMoflon (available at: "http://www.emoflon.org/emoflon/installation/")

# How to build the solution

The Java sources available in this repository already contain all necessary generated code. To build the solution the projects have to be built with Eclipse as Elipse plug-in projects are used. The solution jar file can be generated with the "build.xml" ant script located in the project "TTCSolution".

To generate the java source code from the visual representation, the specification contained in "GravityMetaModels.eap" have to be exported. There are two possible ways to export these specifications:

  1. In Eclipse: right-click on "GravityMetaModels.eap" and choose "eMoflon"->"export and build"
  2. In Enterprise Architect: press "Export All" in the "Add-Ins" window in the tab "eMoflon Global Function"
  
After the export the Eclipse workspace has to be refreshed. With this refresh the generated eMoflon projects are checked for modifications. If the specification has changed for a project this project is highlighted with "***".

To generate Java source code for a project witrh changes, right-clock on the project and choose "eMoflon"->"Build"

In the "ExtendedJamopp" project the used EMF versions of JaMoPP and eMoflon do not harmonize and the generated eMoflon source code references some fields not available in JaMoPP. These fields have to be manual deleted.

# SHARE

A virtual machine to explore our solution without installing the required programs and cloning this repository is available at SHARE:

http://is.ieis.tue.nl/staff/pvgorp/share/?page=ConfigureNewSession&vdi=XP-TUe_TTC15-Refactoring.vdi
