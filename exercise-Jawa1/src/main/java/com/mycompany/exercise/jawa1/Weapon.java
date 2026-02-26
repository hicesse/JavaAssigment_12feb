package com.mycompany.exercise.jawa1;

public abstract class Weapon {

    private int atk;
    private int def;
    private int intel;
    private int agil;
    String name;

    public Weapon(int atk, int def, int intel, int agil, String name) {
        this.atk = atk;
        this.def = def;
        this.intel = intel;
        this.agil = agil;
        this.name = name;
    }

    public int getAtk() { return atk; }
    public int getDef() { return def; }
    public int getIntel() { return intel; }
    public int getAgil() { return agil; }
    public String getName() { return name; }

    public abstract void getInfo();

    public boolean isSameWeapon(Weapon other) {
    return this.name.equals(other.name);
}
}

class Sword extends Weapon {
    public Sword() {
        super(20, 0, 0, 0, "Sword");
    }

    @Override
    public void getInfo() {
        System.out.println("Sword +20 ATK");
    }
}

class Shield extends Weapon {
    public Shield() {
        super(0, 30, 0, 0, "Shield");
    }

    @Override
    public void getInfo() {
        System.out.println("Shield +30 DEF");
    }
}