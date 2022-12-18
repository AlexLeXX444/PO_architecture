package org.example.weapon.bow;

public class RandomBow implements Bow{
    private static String name = "Small bow";
    private static double damage = 1;
    private static double damageModifier = 2;

    public RandomBow() {
        int i = (int)(Math.random() * 2);

        if (i > 0) {
            this.name = "Large master bow";
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
