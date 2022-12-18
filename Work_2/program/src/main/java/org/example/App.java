package org.example;

import org.example.heroes.Archer;
import org.example.heroes.Knight;

public class App 
{
    public static void main( String[] args )
    {
        Archer.getArcher().printInfo();
        Knight.getKnight().printInfo();
    }
}
