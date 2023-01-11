/* Objects and References */

public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this(name, 0, 0, 0);
    }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // other constructors and methods

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}

Person joan = new Person("Joan Ball");

/* Calling a constructor with the command new causes several things to happen. 
First, space is reserved in the computer memory for storing object variables. 
Then default or initial values are set to object variables (e.g. an int type 
variable receives an initial value of 0). Lastly, the source code in the 
constructor is executed.

A constructor call returns a reference to an object. A reference is information 
about the location of object data.

So the value of the variable is set to be a reference, i.e. knowledge about the 
location of related object data. The image above also reveals that strings — 
the name of our example person, for instance — are objects, too.


/* Assigning a reference type variable copies the reference */

/* Let's add a Person type variable called ball into the program, and 
assign joan as its initial value. What happens then? */

Person joan = new Person("Joan Ball");
System.out.println(joan);

Person ball = joan;

/* The statement Person ball = joan; creates a new Person variable ball, and 
copies the value of the variable joan as its value. As a result, ball refers 
to the same object as joan. 

Let's inspect the same example a little more thoroughly: */

Person joan = new Person("Joan Ball");
System.out.println(joan);

Person ball = joan;
ball.growOlder();
ball.growOlder();

System.out.println(joan);
// outputs:
// Joan Ball, age 0 years
// Joan Ball, age 2 years


/* Joan Ball — i.e. the Person object that the reference in the joan variable 
points at — starts as 0 years old. After this the value of the joan variable is 
assigned (so copied) to the ball variable. The Person object ball is aged by 
two years, and Joan Ball ages as a consequence!

An object's internal state is not copied when a variable's value is assigned. 
A new object is not being created in the statement Person ball = joan; — the 
value of the variable ball is assigned to be the copy of joan's value, i.e. a 
reference to an object. 

Next, the example is continued so that a new object is created for the joan 
variable, and a reference to it is assigned as the value of the variable. The 
variable ball still refers to the object that we created earlier. */

Person joan = new Person("Joan Ball");
System.out.println(joan);

Person ball = joan;
ball.growOlder();
ball.growOlder();

System.out.println(joan);

joan = new Person("Joan B.");
System.out.println(joan);
// outputs:
// Joan Ball, age 0 years
// Joan Ball, age 2 years
// Joan B., age 0 years

/* So in the beginning the variable joan contains a reference to one object, 
but in the end a reference to another object has been copied as its value. 
Here is a picture of the situation after the last line of code.

// //


/* null value of a reference variable */

/* Let's extend the example further by setting the value of the reference 
variable ball to null, i.e. a reference "to nothing". The null reference can 
be set as the value of any reference type variable. */

Person joan = new Person("Joan Ball");
System.out.println(joan);

Person ball = joan;
ball.growOlder();
ball.growOlder();

System.out.println(joan);

joan = new Person("Joan B.");
System.out.println(joan);

ball = null;

/* The object whose name is Joan Ball is referred to by nobody. In other words, 
the object has become "garbage". In the Java programming language the programmer
need not worry about the program's memory use. From time to time, the automatic
garbage collector of the Java language cleans up the objects that have become 
garbage. If the garbage collection did not happen, the garbage objects would 
reserve a memory location until the end of the program execution.

Let's see what happens when we try to print a variable that references "nothing"
i.e. null: */

Person joan = new Person("Joan Ball");
System.out.println(joan);

Person ball = joan;
ball.growOlder();
ball.growOlder();

System.out.println(joan);

joan = new Person("Joan B.");
System.out.println(joan);

ball = null;
System.out.println(ball);
// output:
// Joan Ball, age 0 years
// Joan Ball, age 2 years
// Joan B., age 0 years
// null

/* Printing a null reference prints "null". How about if we were to try and call
a method, say growOlder, on an object that refers to nothing: */

Person joan = new Person("Joan Ball");
System.out.println(joan);

joan = null;
joan.growOlder();
// output:
// Joan Ball, age 0 years
// Exception in thread "main" java.lang.NullPointerException
// at Main.main(Main.java:(row))
// Java Result: 1

/* In the course of the program, there occured an error indicating that we 
called a method on a variable that refers to nothing. Fortunately, the error 
message is useful: it tells which row caused the error. */

// //


//
// Object as a method parameter
//

public class AmusementParkRide {
    private String name;
    private int lowestHeight;

    public AmusementParkRide(String name, int lowestHeight) {
        this.name = name;
        this.lowestHeight = lowestHeight;
    }

    // passing a person object to the allowedToRide method
    public boolean allowedToRide(Person person) { 
        if (person.getHeight() < this.lowestHeight) {
            return false;
        }

        return true;
    }

    public String toString() {
        return this.name + ", minimum height: " + this.lowestHeight;
    }
}

// another example:
Person matt = new Person("Matt");
matt.setWeight(86);
matt.setHeight(180);

Person jasper = new Person("Jasper");
jasper.setWeight(34);
jasper.setHeight(132);

AmusementParkRide waterTrack = new AmusementParkRide("Water track", 140);

if (waterTrack.allowedToRide(matt)) {
    System.out.println(matt.getName() + " may enter the ride");
} else {
    System.out.println(matt.getName() + " may not enter the ride");
}

if (waterTrack.allowedToRide(jasper)) {
    System.out.println(jasper.getName() + " may enter the ride");
} else {
    System.out.println(jasper.getName() + " may not enter the ride");
}

System.out.println(waterTrack);
// output:
// Matt may enter the ride
// Jasper may not enter the ride
// Water track, minimum height: 140

/* Assisted creation of constructors, getters, and setters
IntelliJ IDEA = Shift + G (custom)
IntelliJ IDEA = Alt + Insert (default)