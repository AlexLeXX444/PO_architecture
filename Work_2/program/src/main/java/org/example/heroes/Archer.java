package org.example.heroes;

public class Archer implements Hero{
    private static Archer archer;

    private static String className = "Archer";
    private static double healPoint = 450;
    private static double attackPower = 22;
    private static double damage = 1;

    public static synchronized Archer getArcher() {
        if (archer == null) {
            archer = new Archer();
        }
        return archer;
    }

    private Archer() {

    }

    @Override
    public double dealDamage() {
        return damage * attackPower;
    }

    @Override
    public void getDamage(double damage) {
        this.healPoint = this.healPoint - damage;
    }

    @Override
    public void printInfo() {
        System.out.println(this.className + " -:- HP: " + this.healPoint + " -:- AP: " + this.attackPower);
    }
}
