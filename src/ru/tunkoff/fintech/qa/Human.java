package ru.tunkoff.fintech.qa;

public abstract class Human {

    private String heroName;
    private String heroClass;

    public Human(String heroName, String heroClass) {
        this.heroName = heroName;
        this.heroClass = heroClass;
    }

    public String getHeroName() {
        return this.heroName;
    }
    public String getHeroClass() {
        return this.heroClass;
    }

    public abstract void run();

    public void die() {
        System.out.println(this.heroClass + " " + this.heroName + " из расы людей героически умирает");
    }
}
