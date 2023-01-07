/* OBJECT ORIENTED PROGRAMMING */

public class ClockHand {
    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        this.value = this.value + 1;

        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return "" + this.value;
    }
}


public class Clock {
    private ClockHand hours;
    private ClockHand minutes;
    private ClockHand seconds;

    public Clock() {
        this.hours = new ClockHand(24);
        this.minutes = new ClockHand(60);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.seconds.advance();

        if (this.seconds.value() == 0) {
            this.minutes.advance();

            if (this.minutes.value() == 0) {
                this.hours.advance();
            }
        }
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}

Clock clock = new Clock();

while (true) {
    System.out.println(clock);
    clock.advance();
}

/* 
The clock we implemented above is an object whose functionality is based on 
"simpler" objects, i.e., its hands. This is precisely the great idea behind 
object-oriented programming: a program is built from small and distinct objects 
that work together 
*/

/*
Object oriented programming is primarily about isolating concepts into their
own entities or, in other words, creating abstractions

Separating a concept into its own class is a good idea for many reasons:

Firstly, certain details can be hidden inside the class (i.e., abstracted)

Another massive advantage is that since the details of the implementation are
not visible to its user, they can be changed if desired.
*/

