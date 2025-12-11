# 1.9-Enums, Dates and Records

## 📄Exercises Level 1 of Sprint1 Task 9

### Level 1 Exercice1 :

This exercise focuses on defining a basic Java Enum and using it within a function to apply conditional logic
based on the enumerated constants (determining if a day is a workday or a weekend day):

1. Create an enum named Day which contains the names of the days of the week;
2. Create a function (or method) that accepts an instance of the Day enum as a parameter:
    * The function must evaluate the passed Day parameter;
    * The function must print a message indicating whether the received day is a workday or a weekend day.

### Level 1 Exercise 2

This exercise focuses on defining a custom Java Enum and integrating it as a property within a class (Task)
to demonstrate how an enum value can dynamically change the class's behavior or output:

1.Create an enum named Level with three constant values: LOW, MEDIUM, and HIGH;
2. Create a class named Task:
    * The class must contain a property (field) of the type Level;
3. Implement a method within the Task class or external logic in main() that demonstrates how the 
   program's output or logic changes based on the value of the Level property;
4. Instantiate the Task class multiple times, assigning different Level values, 
   and print the resulting for each instance.

### Level 1 Exercise 3

This exercise focuses on extending the functionality of an existing Java Enum (from the exercise 2)
by embedding custom methods and associated logic within each enumerated constant:

1. Use the existing Level enum created previously;
2. Add a new method, such as getColor(), directly inside the Level enum definition;
3. Each enum constant must override or define its own specific return value for the new method;
4. Demonstrate that these custom methods can be invoked on an enum instance and return the value for that constant:
    * Use the Task class from exercise 2 and call the new method on different Levels;
    * Print the returned color result to the standard output.

### Level 1 Exercise 4

This exercise focuses on the common programming task of converting a String value into its corresponding Enum constant using 
the built-in valueOf() method, and ensuring proper error management if the input string does not match any valid enum constant:

1. Use a defined Java enum (e.g. Level from exercise 2);
2. Implement a process (method or block of code) that attempts to convert a String input into an instance
   of the target enum using the Enum.valueOf(Class, String) method;
3. The implementation must anticipate and handle potential errors that occur if the input string is invalid;
4. Output:
     * If the conversion is successful, print the resulting enum constant;
     * If the conversion fails (invalid string), print a specific error message explaining that the value is not valid.

## 💻Technologies Used
* Java JDK 21.0.6.

## 📋Requirements
* IntelliJ

## 🛠️Installation
Clone this repository : -> [git clone]https://github.com/FedEx8525/1.9-Enums-Dates-and-Records

## ▶️Execution 
* Run the program in IntelliJ

## 🤝Contributions
* Review the exercises
