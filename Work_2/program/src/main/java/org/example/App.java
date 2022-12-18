package org.example;

import org.example.Logers.BattleLogger;
import org.example.heroes.Archer;
import org.example.heroes.Knight;

import javax.sound.midi.Soundbank;
import java.util.logging.Logger;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("-----===== START BATTLE =====-----");
        Archer.getArcher().printInfo();
        Knight.getKnight().printInfo();
        int turn = (int)(Math.random() * 2);

        System.out.println("\n");
        while(Archer.getArcher().returnState() != false && Knight.getKnight().returnState() != false) {
            if (turn == 0) {
                Knight.getKnight().getDamage(Archer.getArcher().dealDamage());
                BattleLogger.getBattleLogger().addStringInLog("Archer deal Knight " + 22 + " damage");
                turn = 1;
            } else if (turn == 1) {
                Archer.getArcher().getDamage(Knight.getKnight().dealDamage());
                BattleLogger.getBattleLogger().addStringInLog("Knight deal Archer " + 18 + " damage");
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
