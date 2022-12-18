package org.example.armor.medium;

public class RandomMediumArmorFactory implements MediumArmorFactory{
    @Override
    public MediumArmor createMediumArmor() {
        return new RandomMediumArmor();
    }
}
