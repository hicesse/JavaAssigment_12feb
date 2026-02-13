package com.mycompany.exercise.jawa1;
// /com/mycompany/exercise/jawa1/Main.java;
// make sure to put your package all of anything before you put your code or import


public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero(); /* [1] */
        HeroINT/* [2] */ hero1int /*[3] */= new HeroINT/* [4] */("lukman", 100, 50, 12); 
        // in short we make another object named hero1int from class HeroINT() in file HeroINT,java
                                                               
        hero1int.display()/* [5] */;
        System.out.println("-------------------------");
        hero1.display();

    }
}

/*
Footnote

[1] : in short here, we make a new object called hero1 from file Hero, and the class Hero()
[2] : left side is name of your file
[3] : left side is name of your new object 
[4] : left side is name of your class target to be declared in your object
[5] : we called our object there is hero1int and the function inside called display()

*/