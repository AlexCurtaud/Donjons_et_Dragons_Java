# Dungeons and Dragons Java

## Project Description
The project aim to recreate the well-known game Dungeons & Dragons using Java.
It's a school project where the goal is to learn the langage.

## Installation Instructions
### From an IDE, IntelliJ for example:
1. Clone the Repo
2. Go to Project Structure
3. Select a JDK or download the latest version from the Menu.
4. Go to src/Main and press CTRL + F5 or Run it from the button at the left bottom of the IDE.

### From the Terminal (Linux/MacOS)
Be sure to have a JDK or download/install it from : https://www.oracle.com/fr/java/technologies/downloads/
1. **Clone the Repository**:
   Open your terminal and clone the repository using the following command:  
   ```bash
   git clone https://github.com/AlexCurtaud/DungeonsAndDragons_Java.git
   ```  
2. **Navigate to the Project Directory**:  
   Change your directory to the project folder:  
   ```bash
   cd DungeonsAndDragons_Java
   ```  
3. **Build the Project**:  
   Compile the files from .java to .class 
   ```bash
   javac *.java
   ```
   Create the MANIFEST.MF and write Main-class: Main
   ```bash
   nano MANIFEST.MF
   // Write Main:class Main and press Enter
   // Save and Close
   ```
   Create the .jar file
   ```bash
   jar -cvmf MANIFEST.MF Prog.jar *.class
   ```
4. **Run the Application**:
   Run the prog.jar file
   ```bash
   java -jar prog.jar
   ```

## Features
[Currently working on it]
