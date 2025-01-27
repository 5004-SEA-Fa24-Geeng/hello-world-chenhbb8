# Homework Aloha World Report

The following report contains questions you need to answer as part of your submission for the homework assignment. 


## Design Doc
Please link your UML design file here. See resources in the assignment on how to
link an image in markdown. You may also use [mermaid] class diagrams if you prefer, if so, include the mermaid code here.  You DO NOT have to include Greeting.java as part of the diagram, just the AlohaWorld application that includes: [AlohaWorld.java], [Greeter.java], and [ConsoleView.java].
```mermaid
---
title: Aloha World UML
---
classDiagram
    direction LR
    AlohaWorld --> Greeter 
    AlohaWorld --> ConsoleView : uses
    ConsoleView --> Greeter : uses
    class AlohaWorld {
        -AlohaWorld()
        +main(String[] args)
    }
    class Greeter {
        -String name
        -int locality
        -static List~String~ localityList
        -static final int HAWAII
        -static final int CHINA
        -static final int ITALY
        -static final int DEFAULT_LOCALITY
        +Greeter(String name)
        +Greeter(String name, int locality)
        +getName() String
        +getLocality() int
        +setLocality(int locality)
        +greet() String
        +greet(boolean asciiOnly) String
        +hashCode() int
        +equals(Object obj) boolean
        +toString() String
        +getLocalityList() List~String~
    }
    class ConsoleView {
        -Scanner SCANNER
        -List~String~ LOCALITY_OPTIONS
        -ConsoleView()
        +getName() String
        +getLocality() int
        +checkRunAgain() boolean
        +printGreeting(String greeting)
    }
```


### Program Flow

The program starts in the main() method of the AlohaWorld class, where the client is prompted for their name and location using methods from the ConsoleView class.  A Greeter object is then created with this information to generate a personalized greeting, which is displayed using ConsoleView.printGreeting().  The program enters a loop, allowing the client to update their location and receive new greetings until they choose to exit.

## Assignment Questions

1. List three additional java syntax items you didn't know when reading the code.  (make sure to use * for the list items, see example below, the backtick marks are used to write code inline with markdown)
   
   *  `final class`
   *  `String greeting = asciiOnly ? asciiGreeting : unicodeGreeting;`
   *  `Scanner`
   *  `instanceof`

2. For each syntax additional item listed above, explain what it does in your own words and then link a resource where you figured out what it does in the references section. 

    * (example) The `final` keyword when used on a class prevents the class from being subclassed. This means that the class cannot be extended by another class. This is useful when you want to prevent a class from being modified or extended[^1] . It is often the standard to do this when a class only contains static methods such as driver or utility classes. Math in Java is an example of a final class[^2] .
    * `String greeting = asciiOnly ? asciiGreeting : unicodeGreeting;`, This pops up when I write greeting class, Now I know "?" for condition, if true, execute left side of ":", if false, the right side.
    * `Scanner` is from java.util package, and is used to get user input
    * `instanceof` checks whether an object is an instance of a specific class or an interface, the return value is either true or false.

3. What does `main` do in Java?

   
      Main is the main program, which can be understood as the backbone of an APP and is where the program starts running


4. What does `toString()` do in Java? Why should any object class you create have a `toString()` method?


      The return type of toString is String, so its purpose is to convert the object to a String representation. This is very convenient and intuitive for output

5. What is javadoc style commenting? What is it used for? 

    
      It's like /**  */ and @param and @return, like these, Programmers can add these comments to explain what each part of the code does, making it easier for others to read. Its main purpose is to generate a web document file, which  provides a clear, organized reference for other developers who use or maintain the code. Javadoc comments also improve code readability and help ensure that the purpose and behavior of code elements are well-documented, making it easier to understand and use the code


6. Describe Test Driving Development (TDD) in your own words. 

   
      Write test code for the main code we write, give some expected results for some methods in the main code, and check the feasibility of the code by comparing the expected results with the actual output results    

7. Go to the [Markdown Playground](MarkdownPlayground.md) and add at least 3 different markdown elements you learned about by reading the markdown resources listed in the document. Additionally you need to add a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that there). Add the elements into the markdown file, so that the formatting changes are reserved to that file. 

# Heading 1

This is a paragraph with a line break.<br>
This is the next line.

---

## 3 Elements I learned about Markdown

- Space between "#" and Heading
- Change line "br"
-  put blank lines before and after horizontal rules

***


```mermaid
---
title: Aloha World UML
---
classDiagram
    direction LR
    AlohaWorld --> Greeter 
    AlohaWorld --> ConsoleView : uses
    ConsoleView --> Greeter : uses
    class AlohaWorld {
        -AlohaWorld()
        +main(String[] args)
    }
    class Greeter {
        -String name
        -int locality
        -static List~String~ localityList
        -static final int HAWAII
        -static final int CHINA
        -static final int ITALY
        -static final int DEFAULT_LOCALITY
        +Greeter(String name)
        +Greeter(String name, int locality)
        +getName() String
        +getLocality() int
        +setLocality(int locality)
        +greet() String
        +greet(boolean asciiOnly) String
        +hashCode() int
        +equals(Object obj) boolean
        +toString() String
        +getLocalityList() List~String~
    }
    class ConsoleView {
        -Scanner SCANNER
        -List~String~ LOCALITY_OPTIONS
        -ConsoleView()
        +getName() String
        +getLocality() int
        +checkRunAgain() boolean
        +printGreeting(String greeting)
    }
```

## Deeper Thinking Questions

These questions require deeper thinking of the topic. We don't expect 100% correct answers, but we encourage you to think deeply and come up with a reasonable answer. 


1. Why would we want to keep interaction with the client contained to ConsoleView?


      I think it's like organizing things, we put the same kind of items together. In this project, the ConsoleView assumes the responsibility of interacting with the client. All the related codes are placed in the ConsoleView, which will make the whole project more logical. When problems related to the ConsoleView are encountered, it is only necessary to solve them in the ConsoleView. It also does not affect other classes. In addition, this is also helpful for future debugging. If you encounter related problems, you can return to the ConsoleView for the first time to solve them, which helps the debugging efficiency

2. Right now, the application isn't very dynamic in that it can be difficult to add new languages and greetings without modifying the code every time. Just thinking programmatically,  how could you make the application more dynamic? You are free to reference Geeting.java and how that could be used in your design.



> [!IMPORTANT]
>  After you upload the files to your github (ideally you have been committing throughout this progress / after you answer every question) - make sure to look at your completed assignment on github/in the browser! You can make sure images are showing up/formatting is correct, etc. The TAs will actually look at your assignment on github, so it is important that it is formatted correctly.


## References

[^1]: Final keyword in Java: 2024. https://www.geeksforgeeks.org/final-keyword-in-java/. Accessed: 2024-03-30. 

[^2]: Math (Java Platform SE 17). https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html. Accessed: 2024-03-30.


<!-- This is a comment, below this link the links in the document are placed here to make ti easier to read. This is an optional style for markdown, and often as a student you will include the links inline. for example [mermaid](https://mermaid.js.org/intro/syntax-reference.html) -->
[mermaid]: https://mermaid.js.org/intro/syntax-reference.html
[AlohaWorld.java]: src/main/java/student/AlohaWorld.java
[Greeter.java]: src/main/java/student/Greeter.java
[ConsoleView.java]: src/main/java/student/ConsoleView.java