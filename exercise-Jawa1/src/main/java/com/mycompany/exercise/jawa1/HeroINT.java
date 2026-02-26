package com.mycompany.exercise.jawa1;


public class HeroINT extends Hero {

    public HeroINT(String name) {
        super(name, 80, 10, 5, 8, 25, 5); // even he's a mage, they still have lack of strength
    }

    @Override
    public int getPower() {
        return baseAtk + intelligence;
    }

    @Override
    public void attack(Hero target) {
        int damage = getPower();
        System.out.printf("\n%s casts magic on %s for %d damage!",
                this.name, target.name, damage);

        target.receiveDamage(damage);
    }

    @Override
    public void display() {
        System.out.println("Type      : Intelligence");
        super.display();
    }

    public void equip(Weapon weapon) {

        if (equippedWeapon != null && equippedWeapon.isSameWeapon(weapon)){
            System.out.printf("\nYou already equipped the %s!\n", equippedWeapon.name);
            return;
        }

        equippedWeapon = weapon;

        this.baseAtk += weapon.getAtk();
        this.defense += weapon.getDef();
        this.intelligence += weapon.getIntel();
        this.agility += weapon.getAgil();

        System.out.printf("\n%s equipped %s", this.name, weapon.name);
    }
}