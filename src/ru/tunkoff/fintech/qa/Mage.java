package ru.tunkoff.fintech.qa;

public class Mage extends Elf implements MagicStaff {

    public Mage(String heroName, String heroClass) {
        super(heroName, heroClass);
    }

    @Override
    public void run() {
        System.out.println(getHeroClass() + " " + getHeroName() + " призывает портал и ныряет в него. Главное - не ошибиться измерением...");
    }

    @Override
    public void lightningArrow() {
        System.out.println(getHeroClass() + " " + getHeroName() + " выпускает заряд молнии");
    }

    @Override
    public void fireball() {
        System.out.println(getHeroClass() + " " + getHeroName() + " обрушивает на противника огненный шар");
    }

    @Override
    public void magicShield() {
        System.out.println(getHeroClass() + " " + getHeroName() + " призывает магический барьер");
    }
}
