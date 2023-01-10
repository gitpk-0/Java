/* Primitive and Reference Variables */

/* Variables in Java are classified into primitive and reference variables. 
From the programmer's perspective, a primitive variable's information is 
stored as the value of that variable, whereas a reference variable holds 
a reference to information related to that variable. reference variables 
are practically always objects in Java. 

Let's take a look at both of these types with the help of two examples: */

int value = 10;
System.out.println(value); // outputs 10

public class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }
}
Name luke = new Name("Luke");
System.out.println(luke); // outputs Name@4aa298b7

/* In the first example, we create a primitive int variable, and the number 10 
is stored as its value. When we pass the variable to the System.out.println 
method, the number 10 is printed. In the second example, we create a 
reference variable called luke. A reference to an object is returned by the 
constructor of the Name class when we call it, and this reference is stored 
as the value of the variable. 

When we print the variable, we get Name@4aa298b7 as output. 
What is causing this? 

The method call System.out.println prints the value of the variable. The 
value of a primitive variable is concrete, whereas the value of a reference 
variable is a reference. When we attempt to print the value of a reference 
variable, the output contains the type of the variable and an identifier 
created for it by Java: the string Name@4aa298b7 tells us that the given 
variable is of type Name and its identifier is 4aa298b7.

The previous example applies whenever the programmer has not altered an 
object's default print format. You can modify the default print by defining 
the toString method within the class of the given object, where you specify 
what the objects print should look like. In the example below, we've defined 
the public String toString() method within the Name class, which returns the 
instance variable name. 

Now, when we print any object that is an instance of 
the Name class with the System.out.println command, the string returned by 
the toString method is what gets printed. */

public class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}

Name luke = new Name("Luke");
System.out.println(luke); // equal to System.out.println(luke.toString());
// outputs Luke

//
// Primative Variables
//

/* Java has eight different primitive variables. These are: */
boolean // (a truth value: either true or false), 
byte // (a byte containing 8 bits, between the values -128 and 127), 
char // (a 16-bit value representing a single character), 
short // (a 16-bit value that represents a small integer, between the values -32768 and 32767), 
int // (a 32-bit value that represents a medium-sized integer, between the values -2^31 and 2^31-1), 
long // (a 64-bit value that represents a large integer, between values -2^63 and 2^63-1), 
float // (a floating-point number that uses 32 bits), and 
double // (a floating-point number that uses 64 bits).

boolean truthValue = false;
int integer = 42;
double floatingPointNumber = 4.2;

System.out.println(truthValue); 
System.out.println(integer);
System.out.println(floatingPointNumber);
// outputs:
// false
// 42
// 4.2

/* Declaring a primitive variable causes the computer to reserve some memory 
where the value assigned to the variable can be stored. The size of the 
storage container reserved depends on type of the primitive.

In the example below, we create three variables. Each one has its own memory 
location to which the value that is assigned is copied. */

int first = 10;
int second = first;
int third = second;
System.out.println(first + " " + second + " " + third);
second = 5;
System.out.println(first + " " + second + " " + third);

// outputs:
// 10 10 10 
// 10 5 10

/* The name of the variable tells the memory location where its value is stored. 
When you assign a value to a primitive variable with an equality sign, the value
on the right side is copied to the memory location indicated by the name of the
variable. For example, the statement int first = 10 reserves a location called
first for the variable, and then copies the value 10 into it.

Similarly, the statement int second = first; reserves in memory a location 
called second for the variable being created and then copies into it the value 
stored in the location of variable first. */

/* The values of variables are also copied whenever they're used in method 
calls. What this means in practice is that the value of a variable that's 
passed as a parameter during a method call is not mutated in the calling 
method by the method called. In the example below, we declare a 'number' 
variable in the main method whose value is copied as the method call's 
parameter. In the method being called, the value that comes through the 
parameter is printed, its value is then incremented by one. The value of the 
variable is then printed once more, and the program execution finally returns 
to the main method. The value of the 'number' variable in the main method 
remains unaltered because it has nothing to do with the 'number' variable 
defined as the parameter of the method that's called. */

public class Example {
    public static void main(String[] args) {
        int number = 1;
        call(number);
       
        System.out.println("Number still: " + number);
    }
   
    public static void call(int number) {
        System.out.println("Number in the beginning: " + number);
        number = number + 1;
        System.out.println("Number in the end: " + number);
    }
}
// outputs:
// Number in the beginning: 1
// Number in the end: 2
// Number still: 1



//
// Reference Variables
//