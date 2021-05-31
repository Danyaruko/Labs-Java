# Labs-Java
 This repository will contain Laboratory works № 8, 9, 10. As they will be added, this file will change correspondingly.

 ## Lab-8
 ### Task:
1. Create class hierarchy in Java according to UML diagrame from Laboratory work №2
2. For creating getters, setters, some other constructions and standard methods use Lombok
3. Package is created with maven using plugins: Jacoco, FindBugs, PMD, Checkstyle
### How to run:
Download zipped reposiory from GitHub and run App.java

## Lab-9
### Task
+ Create REST service and implement GET/POST/PUT/DELETE operations on object from 8-th lab
+ GET operation with id provided should return object with requested id,
+ Get operation without id provided should return list of all objects
+ Code should be checked with checkstyle and pmd plugins
+ Code should be in a different pull request than lab8
+ Controller and RestApplication should be in a different packages
+ Objects should be stored in a `Map`

### Project description
Project consist of 4 packages in ua.lviv.iot.foodstoragegoods package, App.java and pom.xml:
+ `models` package contains all classes and enums from lab-8 with modified classes `FoodStorageGood`(addded field id and constructor with all args except id), 'TraditionalFoodStorageItem' and 'Basket'(non-nulled attributes)
+ `manager` package contains class `ShopManager`(class to find good in list of goods and to sort list of goods) and enum `SortOrder` from lab-8
+ `services` package contains only one class `FoodStorageGoodsService` which is used to create hashmap of goods, to add, modify, get and delete saws from this hashmap and to automatically provide id's for goods.
+ `controllers` package contains only one class `FoodStorageGoodController` aim of which is to deal with GET/POST/PUT/DELETE requests with the help of `FoodStorageGoodService`
+ `App.java` aim of which is to run spring boot site on the local host and which shows some of `ShopManager` capabilities from Lab-8
+ `pom.xml` which contains dependencies and plugins correspondingly for Lombok, Spring Web, PMD, Checkstyle

### How to run
+ You should have maven installed and Java 11 selected
+ Download zip-version of repository
+ `cd` into folder where you stored this repository
+ Run `mvn install`
+ Run `java -jar target/Lab_9-VERSION.jar`, where `VERSION` is version of the app (can be found in `pom.xml`, under `<version>` tag)
+ Use whatever REST-testing programs are convenient to you(I personally used Postman)
