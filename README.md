# Page Object model Test automation framework using Selenium with Java, TestNG and Maven-
This is a sample project is for the test automation assignment using Selenium(Java), TestNG and Maven and this project will try to automate demo.automationtesting.in website 

The test script should compile and run from the command line and within IDE.

### Prerequisite | Java
1. Java JDK is installed on your system
2. Any IDE like Eclipse or IntelliJ is installed on your system

### Prerequisite | TestNG
1. TestNG plugin is added in eclipse / intelliJ

### Prerequisite | Maven
Maven should be available on your system, if not please do as below
1. Download Maven from https://maven.apache.org/download.cgi
2. Unzip maven to choice of your directory
3. Add the directory path to PATH environment variable

Check if maven is successfully installed using "mvn -version" in command prompt, this command should return your command version

### Steps to clone project
1. git clone https://github.com/NealsArcade/sdet-case-study-1.git
2. cd sdet-case-study-1

### Steps to run project via Command Prompt
mvn clean test -DtestNGxmlName=testng.xml

### Steps to run project via Eclipse IDE 
1.	Open Eclipse IDE -> File -> Import
2.	In the Import Wizard, select “Existing Maven Projects”
3.	Select the directory where you have cloned the project
4.	Select pom.xml using checkbox under projects
5.	Click on Finish.
6.	Wait for some time for eclipse to download all dependencies from Maven Repository which are in POM.xml 
7.	Right click on testing.xml and select Run As-> TestNG Suite.

### Steps to run project via intelliJ IDE
1. Open IntelliJ IDEA.
2. Import the project: File -> New -> Project from Existing Sources...
3. Select the directory where you have cloned the project.
4. Click on pom.xml file and then click on "Open"
5. Wait for the import to complete: IntelliJ IDEA will automatically import the project and download all dependencies specified in pom.xml.
6. Open the TestNG XML file: Navigate to your TestNG XML file (typically testing.xml).
7. Run the TestNG Suite: Right-click on testing.xml -> Select "Run 'testing.xml'".

### Login Configuration change
If you want to change the user login configuration, please modify "src/main/java/org/example/config/config.properties" file.

