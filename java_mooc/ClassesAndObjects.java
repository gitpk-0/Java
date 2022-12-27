/** 
A class defines the attributes of objects, i.e., the information related to 
them (instance variables), and their commands, i.e., their methods. The values 
of instance (i.e., object) variables define the internal state of an individual 
object, whereas methods define the functionality it offers.
**/

/** 
 * A Method is a piece of source code written inside a class that's been named 
 * and has the ability to be called. A method is always part of some class and 
 * is often used to modify the internal state of an object instantiated from a 
 * class.
 **/


/** 
 * As an example, ArrayList is a class offered by Java, and we've made use of 
 * objects instantiated from it in our programs. Below, an ArrayList object 
 * named integers is created and some integers are added to it.
 **/

// we create an object from the ArrayList class named integers
ArrayList<Integer> integers = new ArrayList<>();

// let's add the values 15, 34, 65, 111 to the integers object
integers.add(15);
integers.add(34);
integers.add(65);
integers.add(111);

// we print the size of the integers object
System.out.println(integers.size()); // prints 4

// An object is always instantiated by calling a method that created an object, 
// i.e., a constructor by using the new keyword.


// CREATING CLASSES

/** 
 * A class specifies what the objects instantiated from it are like:

    The object's variables (instance variables) specify the internal state of
        the object

    The object's methods specify what the object does

We'll now familiarize ourselves with creating our own classes and defining the 
variable that belong to them.
**/

public class Person {
    private String name;
    private int age;
}

/** 
 * We specify above that each object created from the Person class has a name 
 * and an age. Variables defined inside a class are called instance variables, 
 * or object fields or object attributes. Other names also seem to exist.

Instance variables are written on the lines following the class definition 
public class Person {. Each variable is preceded by the keyword private. The 
keyword private means that the variables are "hidden" inside the object. This 
is known as encapsulation.
**/


// Defining a Constructor
// Objects are always created using a constructor.

public static void main(String[] args) {
    Person ada = new Person("Ada");
    // ...
}

public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }
}

// The constructor's name is always the same as the class name.

// Default Constructor
// If the programmer does not define a constructor for a class, Java 
// automatically creates a default one for it. A default constructor is a 
// constructor that doesn't do anything apart from creating the object. The 
// object's variables remain uninitialized (generally, the value of any object 
//     references will be null, meaning that they do not point to anything, and 
//     the values of primitives will be 0)

// For example, an object can be created from the class below by making the 
// call new Person()

public class Person {
    private String name;
    private int age;
}
// If a constructor has been defined for a class, no default constructor exists.
 // For the class below, calling new Person would cause an error, as Java cannot 
 // find a constructor in the class that has no parameters.

public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }
}