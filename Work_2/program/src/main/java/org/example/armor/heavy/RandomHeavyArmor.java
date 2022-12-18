package org.example.armor.heavy;

public class RandomHeavyArmor implements HeavyArmor{
    private static String name = "Plate armor";
    private static double durability = 1;
    private static double durabilityModifier = 5;

    public RandomHeavyArmor() {
        int i = (int)(Math.random() * 2);

        if (i > 0) {
            this.name = "Monolith armor";
            this.durabilityModifier = 10;
        }
    }
    @Override
    public double getDurability() {
        return this.durability * (int)((Math.random() * 5) + this.durabilityModifier);
    }

    @Override
    public void printInfo() {
        System.out.println(this.name + " with durability: " + this.durabilityModifier + "..." + (this.durabilityModifier + 5) + ".");
    }
}
