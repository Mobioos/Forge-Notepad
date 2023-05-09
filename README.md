# The Notepad Application

> **The Notepad application used here is initially an example application provided by the [FeatureIDE framework](https://featureide.github.io/)**

Notepad is **a simple text editor** written in Java. It offers classical functionalities such as **_Copy_**, **_Paste_**, **_Cut_**, **_Undo_**, **_Redo_**, and **_Find_**.

## Pre-requisites
To ensure the computation of Maps by <span style="color: #e66300;">Mobioos Forge</span> for the Notepad application (or any Java application), you need to configure VScode to support Java development. Thus you need to perform the following steps: 
1. **Ensure you have a [Java Development Kit](https://www.oracle.com/java/technologies/downloads/) installed on your computer**: It lets you compile and execute the Notepad application.
2. **Install the extension [Language Support for Java(TM) by Red Hat](https://marketplace.visualstudio.com/items?itemName=redhat.java)**: This allows <span style="color: #e66300;">Mobioos Forge</span> compute the Maps of the application.
3. **(Optional) Install the extension [Debugger for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug)**: This extension allows you to easily build and execute the notepad application.

Before going into details about the SPL implementation, the following section will describe in more detail the Notepad application.

## Project overview

### Execution

By installing the [Debugger for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug) extension, you can execute the Notepad application by opening the `src/Notepad.java` file and pressing the _F5_ button.

![Notepad execution](https://mobioosstorageaccount.blob.core.windows.net/public-documentation/Forge-tutorials/Notepad/images/execution.png)

The application is made up of a text area as well as different menus and icons at the top allowing to execute the different functionalities of the application (_Cut_, _Copy_, _Paste_, _Find_, etc).

### Architecture

All the source code of the application is contained in the `src` folder. This folder also contains the images used by the application. Those images are located in two different folders:

- `images`: Folder that contains the images used by the Notepad application.
- `fa-images`: Folder that contains additional images that **can be used while customizing the application**.

The `main` method of the Notepad application is located in the `Notepad.java` file.

The screenshot below summarizes the project architecture.

<img src="https://mobioosstorageaccount.blob.core.windows.net/public-documentation/Forge-tutorials/Notepad/images/project-files.png" height="600px"/>

## SPL Overview

### The Feature Model

![Notepad feature model](https://mobioosstorageaccount.blob.core.windows.net/public-documentation/Forge-tutorials/Notepad/images/spl/full-fm.png)

In the given Feature Model, **we have 13 Features (7 Functional Features and 6 Resource Features)**. Each created Functional Feature has a sub-resource (a child in the tree) that represents the icon used by the functionality in the UI. **We also have 2 Constraints** that result from business relations between functionalities. For instance, since the Functionality Feature _Redo_ needs the _Undo_ Functional Feature to be effective, we created the Constraint: _Undo ⇒ Redo_.

### The Feature Mappings

Mapping the Features of the Notepad application has been made with 23 Markers (21 Code-Markers and 2 File-Marker). Those markers provided 55 Maps in total.
The biggest share of Markers and Maps is located inside the file `Notepad.java`. Indeed, this file contains 15 Markers and 45 Maps.

![Feature Maps View](https://mobioosstorageaccount.blob.core.windows.net/public-documentation/Forge-tutorials/Notepad/images/spl/feature-maps-view.png)

### An Example of Customization

To test the customization process, we created a customization configuration where **the features _Cut_, and _Redo_ are disabled**. In this configuration, we also gave new images from the `src-fa-images` folder as new icons for the enabled features.

![Notepad Customization](https://mobioosstorageaccount.blob.core.windows.net/public-documentation/Forge-tutorials/Notepad/images/spl/customization/demo-configuration.png)

If we generate a variant from this configuration, we get the following variant.

![Notepad variant execution](https://mobioosstorageaccount.blob.core.windows.net/public-documentation/Forge-tutorials/Notepad/images/spl/customization/demo-variant.png)

You can see on the generated variant that the features _Cut_ and _Redo_ are disabled. Also, the images provided in the configuration are used in the UI.
