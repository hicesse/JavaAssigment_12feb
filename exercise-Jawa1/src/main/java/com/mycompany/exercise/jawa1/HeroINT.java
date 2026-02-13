package com.mycompany.exercise.jawa1;
// /com/mycompany/exercise/jawa1/HeroINT.java;

public class HeroINT extends Hero {

    int intel;
     public HeroINT(String name, int hp, int mana, int intel) { // this is the "construct method" [1] from HeroINT() class, you aslo can make "overloading construct method" [2] to get different input state
        super.name = name;
        super.baseHealth = hp;
        super.baseMana = mana;
        this.intel = intel;
    }
    @Override
    void display(){ // this is the fuction display [3]
        System.out.println("Type: intelegence");
        super.display(); // class HeroINT are extend from class Hero, therefore, the super[4] here are point to the parent (the Hero class from Hero.java)
        System.out.println("Intelegent: " + intel);

    }
    
}

/*
Footnote

[1] = a constructor is a special method used to initialize objects. therefore, if you make an object that include this class, you need to fill the requipment from it construct.

[2] = Constructor overloading in Java refers to the use of more than one constructor in an instance class. However, each overloaded constructor must have different signatures

[3] = if you take a look at the Main.java we use this function in our object called hero1int.display, cuz this function are void, it will not return anything after the execution.

[4] = in Java is used to refer to the immediate parent class object.

*/