# Repository Overview:

This repository contains the code for an assignment I completed as part of the Object Oriented Software Engineering course I took in the second year of my degree.

Within the labexamstart folder there is:
- A Class Diagram image to show how the classes of the project interact with one another
- A Design Pattern md file which explains my choice for the design patterns I implemented
- The src/main/java folder which contains the project code itself

To run the project, navigate to labexamstart/src/main/java and input into the command line:

javac *.java

java Race

The main method of the project is implemented in the Race.java file. To adjust the Race output, you can edit the makeFourCars function in Race.java and assign new DrivingBehaviours to the drivers. Or you can also change the driving behaviour using the changeDrivingBehaviour function on one of the racers of the racers array in the main of Race.java.
