# Digital Testing #

This is a example project which demonstrates the creation of how to use the UnitTester class
to implement more complex circuit test scenarios.  

## How it works ##

Digital comes with a class UnitTester which helps to implement test cases
which are difficult or even impossible to implement with Digitals test case component.

The included example contains code which allows to load a circuit, to load a hex file to a memory component and then execute the model until a break signal is detected.
After that the content of a memory component is written to a file. This file can then be further evaluated. 

## How do I get set up? ##

The easiest way to build the necessary Jar is to use [maven](https://maven.apache.org/).

* JDK 1.8 is needed (either the Oracle JDK 1.8 or OpenJDK 1.8)  
* Clone the repository.
* Replace the `Digital.jar` which is included in this repo with the version you want to use.
* Modify the de.neemann.digital.test.TestCircuit class as appropriate.
* After that run `mvn install` to create the library jar file
* A example of how to start a test see the file `start.sh`.
