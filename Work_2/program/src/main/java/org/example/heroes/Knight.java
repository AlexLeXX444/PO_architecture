package org.example.heroes;

public class Knight implements Hero{
    private static Knight knight;

    private static String className = "Knight";
    private static double healPoint = 550;
    private static double attackPower = 18;
    private static double damage = 1;
    private static boolean state = true;

    public static synchronized Knight getKnight() {
        if (knight == null) {
            knight = new Knight();
        }
        return knight;
    }

    private Knight() {

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

    @Override
    public boolean returnState() {
        if (this.healPoint <= 0) {
            this.state = false;
        }

        return this.state;
    }
}
