package org.example.weapon.meelee;

public class RandomMeleeWeaponFactory implements MeleeWeaponFactory{
    @Override
    public MeleeWeapon createMeleeWeapon() {
        return new RandomMeleeWeapon();
    }
}
