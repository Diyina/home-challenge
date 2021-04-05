# Home Challenge

### Setup 
I used Java (8 or higher), Gradle (Dependencies, plugins), Junit 5 (runner), Gson (A Java serialization/deserialization library), RESTAssured (testing for REST services).

You do not need to worry about to install this. All the dependencies or configurations are already setted in build.gradle file (root folder).

### Installing

Make sure to import it using a configuration for a Gradle project.

#### - Cloning the git repository:

> $ git clone https://github.com/Diyina/home-challenge.git

### How to Run
 - Using CLI

Open the terminal and go to project folder
> cd ./home-challenge/Part2/API-Testing 

Run this command

>./gradlew :test --tests "APITests"


### Using IDE

- Make sure to import the project using gradle option 
- Go to _src/main/test_, you will find java folder and run **APITests** file.

**Take a look to the console, it will show the results.**

### Test results in HTML

Junit with Gradle has a reports for the Tests. 

Go to build/reports/tests/test, and check index.html file

You can review it using your favorite browser.
