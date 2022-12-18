package org.example.armor.heavy;

public class RandomHeavyArmorFactory implements HeavyArmorFactory{
    @Override
    public HeavyArmor createHeavyArmor() {
        return new RandomHeavyArmor();
    }
}
