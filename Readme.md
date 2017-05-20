# Identity Management

Search top K reviews from given set of review based on matching search words

## Introduction

This project try to solve the problem for keeping user and group data as per [SCIM] (http://www.simplecloud.info/). This application loads the reviews at startup and provides a [Rest API](http://www.restapitutorial.com/) to do that.

### Prerequisites

One need to have Java 8 installed on the their system. It can be checked on console by command.

```
java -version
```

### Building

[Gradle](https://gradle.org/) is used as a build tool for the project. 
Jar from the project can be created by running following command from root directory of the project

```
Linux / Mac OS: 	./gradlew clean build jar
Windows: 			./gradlew.bat clean build jar
```
This will generate jar file at path ./build/libs/document-search.jar

## Built With

* [Spark](http://sparkjava.com/) - A micro framework for web application
* [Gradle](https://gradle.org/) - Java project build tool

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests.


## Authors

* **Jitendra Kushwaha** - *jitendra.theta@gmail.com* 


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Thanks to Stackoverflow :)
