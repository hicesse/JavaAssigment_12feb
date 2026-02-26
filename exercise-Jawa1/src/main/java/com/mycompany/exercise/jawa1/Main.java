package com.mycompany.exercise.jawa1;

import java.util.Scanner;



public class Main {

    public static Hero hero;
    public static Hero heroSelected;
    public static Weapon shield;
    public static Weapon sword;
    public static DialogState current = new Dialog1();
    public static final Menu menu = new Menu();
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        hero = new HeroINT("Ezra");
        shield = new Shield();
        sword = new Sword();
        String enter;

        boolean running = true;

        while (running) {

            menu.menuInterface();

            String input = scanner.nextLine().trim();



            switch (input) {
                case "1":
                    System.out.println("masih tahap pengembangan...");
                    enter = scanner.nextLine().trim();
                    menu.heroPick();

                    // Hero heroSelect = new herom();
                    break;

                case "2":
                    ((HeroINT) hero).equip(shield);
                    enter = scanner.nextLine().trim();
                    break;

                case "3":
                    ((HeroINT) hero).equip(sword);
                    enter = scanner.nextLine().trim();
                    break;

                case "4":
                    hero.display();
                    enter = scanner.nextLine().trim();
                    break;

                default:
                    running = false;
                    System.out.println("Game Over.");
                    enter = scanner.nextLine().trim();
                    break;
            }
        }

        while (current != null) {
            current.render();
            scanner.nextLine(); // tunggu ENTER
            current = current.next();
        }
    }
}