package org.example.weapon.meelee;

public class RandomMeleeWeapon implements MeleeWeapon{
    private static String name = "Sword";
    private static double damage = 1;
    private static double damageModifier = 2;

    public RandomMeleeWeapon() {
        int i = (int)(Math.random() * 2);

        if (i > 0) {
            this.name = "Spear";
            this.damageModifier = 5;
        }
    }
    @Override
    public double getDamage() {
        return damage * (int)((Math.random() * 3) + damageModifier);
    }

    @Override
    public void printInfo() {
        System.out.println(this.name + " with damage: " + damageModifier + "..." + (this.damageModifier + 2) + ".");
    }
}
