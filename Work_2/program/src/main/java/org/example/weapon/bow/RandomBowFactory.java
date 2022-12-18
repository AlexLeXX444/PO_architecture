package org.example.weapon.bow;

public class RandomBowFactory implements BowFactory{

    @Override
    public Bow createBow() {
        return new RandomBow();
    }
}
