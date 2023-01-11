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