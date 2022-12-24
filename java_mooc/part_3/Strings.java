// Initialize & Print
String magicWord = "abracadabra";
System.out.println(magicWord);



// Read & Print
Scanner reader = new Scanner(System.in);

System.out.print("What's your name? ");
// reading a line from the user and assigning it to the name variable
String name = reader.nextLine();

System.out.println(name);



// Concatenate Strings
String greeting = "Hi ";
String name = "Lily";
String goodbye = " and see you later!";

String phrase = greeting + name + goodbye;

System.out.println(phrase);
