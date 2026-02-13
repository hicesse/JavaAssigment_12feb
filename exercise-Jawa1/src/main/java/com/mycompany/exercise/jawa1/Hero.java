package com.mycompany.exercise.jawa1;
// /com/mycompany/exercise/jawa1/Hero.java;

class Hero { // this class are not a extend from any class, so it can't use function from any classes except you make a new object

// ======= base atrribute ======
    String name = "Player";
    int baseHealth = 2;
    int baseMana = 50;
    
    void display(){ // this is the super [1] class function display, therefore, if you use this function at class HeroINT() in file HeroINT.java that function will point at this fuction
        System.out.println("Name: " + name);
        System.out.println("Mana: " + baseMana);
        System.out.println("HP: " + baseHealth);
    }

}

/*
Footnote

[1] = in Java super is used to refer to the immediate parent class object.

*/
