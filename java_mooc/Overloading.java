/* Constructor Overloading */

public Person(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

public Person(String name, int age) {
    this.name = name;
    this.age = age;
    this.weight = 0;
    this.height = 0;
}

/* The technique of having two (or more) constructors in a class is known as
constructor overloading

A class can have multiple constructors that differ in the number and/or type of
their parameters. It's not, however, possible to have two constructors with the
exact same parameters.

*/

// Calling your constructor
/* A constructor can be called from another constructor using the this keyword,
which refers to this object in question */

public Person(String name) {
    this(name, 0);
    //here the code of the second constructor is run, and the age is set to 0
}

public Person(String name, int age) {
    this.name = name;
    this.age = age;
    this.weight = 0;
    this.height = 0;
}

/* If a constructor calls another constructor, the constructor call must be the
first command in the constructor */

// New objects can be created just as before:
public static void main(String[] args) {
    Person paul = new Person("Paul", 24);
    Person eve = new Person("Eve");

    System.out.println(paul);
    System.out.println(eve);
}