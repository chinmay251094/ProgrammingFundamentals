package edu.java.basics;

      /*
        Build the classes Animal, Cat, and Bug.
        Define the properties "color" and "leg_number" on the relevant and necessary classes.
        Have them be initialized within a constructor.
        Add the functionality that would allow us to call a method "move" with the Cat and Bug classes.
        Have the method return a string "I'm moving with <number of legs> legs!",
        with the "<number of legs>" being leg_number as set on the class.
        Add a new class called Bird. Add the property "wing_number".
        Add the functionality that would allow us to call a method "move" with the Bird class.
        Have the method return the string "I'm moving with <number of legs> legs!"
        if wing_number doesn't have an applicable value.
        If wing_number does have an applicable value, return the string "I'm flying".
      */

public class AncientAnimals {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird("pink", 4);
        Cat cat = new Cat("white",4);
        System.out.println(cat.move());
        System.out.println(bird.move(0));
    }
}

class Animal {
    Animal(){}

    String color;
    int leg_number;
}

class Cat extends Animal {

    Cat(){}

    Cat(String c, int ln){
        color = c;
        leg_number = ln;
    }
    String move() {
        if(leg_number <= 0) {
            return "Unfortunately! I have not legs";
        }
        else {
            return "My color is "+color+" and I'm moving with "+ leg_number +" legs!";
        }
    }
}

class Bug extends Animal {

    Bug(){}

    Bug(String c, int ln){
        color = c;
        leg_number = ln;
    }
    String move() {
        if(leg_number <= 0) {
             return "Unfortunately! I have not legs";
        }
        else {
            return "My color is "+color+" and I'm moving with "+ leg_number +" legs!";
        }
    }
}

class Bird extends Animal{

    Bird(){}

    Bird(String c, int ln){
        color = c;
        leg_number = ln;
    }
    String move(int wing_number) {
        if(wing_number <= 0) {
            return "My color is "+color+ " and I'm flying";
        }
        else {
            return "My color is "+color+ " and I'm moving with "+ leg_number +" legs!";
        }
    }
}