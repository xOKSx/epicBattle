package ru.tunkoff.fintech.qa;

public class Knight extends Human implements SwordAndShield {

    public Knight(String heroName, String heroClass) {
        super(heroName, heroClass);
    }

    @Override
    public void run() {
        System.out.println(getHeroClass() + " " + getHeroName() + " убегает прочь, гремя доспехами. Тяжело ему, наверное...");
    }

    @Override
    public void attack() {
        System.out.println(getHeroClass() + " " + getHeroName() + " совершает атаку мечом");
    }

    @Override
    public void heavyAttack() {
        System.out.println(getHeroClass() + " " + getHeroName() + " таранит противника щитом");
    }

    @Override
    public void shieldBlock() {
        System.out.println(getHeroClass() + " " + getHeroName() + " поднимает щит в попытке защититься");
    }


}
