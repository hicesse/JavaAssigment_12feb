package com.mycompany.exercise.jawa1;

import java.util.Scanner;


public class Main {

    public static Hero hero;
    public static Weapon shield;
    public static Weapon sword;
    public static final Scanner scanner = new Scanner(System.in);
    public static final Menu menu = new Menu();
    public static void main(String[] args) {

        hero = new HeroINT("Ezra");
        shield = new Shield();
        sword = new Sword();

        boolean running = true;

        while (running) {

            menu.menuInterface();


            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    System.out.println("later yaa...");

                case "2":
                    ((HeroINT) hero).equip(shield);
                    break;

                case "3":
                    ((HeroINT) hero).equip(sword);
                    break;

                case "4":
                    hero.display();
                    break;

                default:
                    running = false;
                    System.out.println("Game Over.");
            }
        }
    }
}