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
System.out.println(integers.size());
