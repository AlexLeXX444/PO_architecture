package org.example;

import org.example.Logers.BattleLogger;
import org.example.armor.heavy.HeavyArmor;
import org.example.armor.heavy.HeavyArmorFactory;
import org.example.armor.heavy.RandomHeavyArmorFactory;
import org.example.armor.medium.MediumArmor;
import org.example.armor.medium.MediumArmorFactory;
import org.example.armor.medium.RandomMediumArmorFactory;
import org.example.heroes.Archer;
import org.example.heroes.Knight;
import org.example.weapon.bow.Bow;
import org.example.weapon.bow.BowFactory;
import org.example.weapon.bow.RandomBowFactory;
import org.example.weapon.meelee.MeleeWeapon;
import org.example.weapon.meelee.MeleeWeaponFactory;
import org.example.weapon.meelee.RandomMeleeWeaponFactory;

public class App
{
    public static void main( String[] args )
    {

        System.out.println("-----===== START BATTLE =====-----");

        Archer.getArcher().printInfo();
        BowFactory bowFactory = new RandomBowFactory();
        Bow bow = bowFactory.createBow();
        System.out.print("\tArmed => ");
        bow.printInfo();
        MediumArmorFactory mediumArmorFactory = new RandomMediumArmorFactory();
        MediumArmor mediumArmor = mediumArmorFactory.createMediumArmor();
        System.out.print("\tWear => ");
        mediumArmor.printInfo();

        Knight.getKnight().printInfo();
        MeleeWeaponFactory meleeWeaponFactory = new RandomMeleeWeaponFactory();
        MeleeWeapon meleeWeapon = meleeWeaponFactory.createMeleeWeapon();
        System.out.print("\tArmed => ");
        meleeWeapon.printInfo();
        HeavyArmorFactory heavyArmorFactory = new RandomHeavyArmorFactory();
        HeavyArmor heavyArmor = heavyArmorFactory.createHeavyArmor();
        System.out.print("\tWear => ");
        heavyArmor.printInfo();
        int turn = (int)(Math.random() * 2);

        System.out.println("\n");
        while(Archer.getArcher().returnState() != false && Knight.getKnight().returnState() != false) {
            if (turn == 0) {
                double damage = Archer.getArcher().dealDamage() + bow.getDamage();
                double armor = damage / 100 * heavyArmor.getDurability();
                Knight.getKnight().getDamage(damage - armor);
                BattleLogger.getBattleLogger().addStringInLog("Archer deal Knight " + (damage - armor) + " damage");
                turn = 1;
            } else if (turn == 1) {
                double damage = Knight.getKnight().dealDamage() + meleeWeapon.getDamage();
                double armor = damage / 100 * mediumArmor.getDurability();
                Archer.getArcher().getDamage(damage - armor);
                BattleLogger.getBattleLogger().addStringInLog("Knight deal Archer " + (damage - armor) + " damage");
                turn = 0;
            }
        }

        BattleLogger.getBattleLogger().showFullLog();

        System.out.println("-----===== FINISH BATTLE =====-----");
        if (Archer.getArcher().returnState()) {
            System.out.println("Archer WIN !!!");
            Archer.getArcher().printInfo();
        } else if (Knight.getKnight().returnState()) {
            System.out.println("Knight WIN !!!");
            Knight.getKnight().printInfo();
        }
    }
}
