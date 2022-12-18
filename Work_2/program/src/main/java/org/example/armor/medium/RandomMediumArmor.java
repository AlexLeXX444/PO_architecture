package org.example.armor.medium;

public class RandomMediumArmor implements MediumArmor{
    private static String name = "Leather armor";
    private static double durability = 1;
    private static double durabilityModifier = 5;

    public RandomMediumArmor() {
        int i = (int)(Math.random() * 2);

        if (i > 0) {
            this.name = "Mail armor";
            this.durabilityModifier = 10;
        }
    }
    @Override
    public double getDurability() {
        return this.durability * (int)((Math.random() * 5) + this.durabilityModifier);
    }

    @Override
    public void printInfo() {
        System.out.println(this.name + " with durability: " + this.durability + "..." + (this.durabilityModifier + 5) + ".");
    }
}
