package com.mycompany.exercise.jawa1;


public abstract class Hero {

    // ===== Base Attributes =====
    protected String name;
    protected int health;
    protected int defense;
    protected int baseAtk;
    protected int agility;
    protected int intelligence;
    protected int strength;

    protected Weapon equippedWeapon;

    public Hero(String name, int health, int defense, int baseAtk,
                int agility, int intelligence, int strength) {

        this.name = name;
        this.health = health;
        this.defense = defense;
        this.baseAtk = baseAtk;
        this.agility = agility;
        this.intelligence = intelligence;
        this.strength = strength;
    }

    public void display() {
        System.out.println("Name      : " + name);
        System.out.println("HP        : " + health);
        System.out.println("Defense   : " + defense);
        System.out.println("Attack    : " + baseAtk);
        System.out.println("Agility   : " + agility);
        System.out.println("INT       : " + intelligence);
        System.out.println("STR       : " + strength);
    }

    public abstract void attack(Hero target);

    public abstract int getPower();

    public int getHealth() {
        return health;
    }

    public void receiveDamage(int damage) {
        this.health -= Math.max(damage - defense, 0);
    }
}