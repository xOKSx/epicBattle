package ru.tunkoff.fintech.qa;

import java.util.Random;

public class Battle {

    public void start() {
        int dice;
        int heroTurn;
        int actionCount = 0;
        boolean attack = false;
        boolean nextRound = true;
        Random random = new Random();

        Knight hero_1 = new Knight("Берен", "Рыцарь");
        Mage hero_2 = new Mage("Финрод", "Маг");

        System.out.println("\nВот они и встретились - великие герои и непримиримые враги - "
                + hero_1.getHeroClass() + " " + hero_1.getHeroName() + " и "
                + hero_2.getHeroClass() + " " + hero_2.getHeroName() + ".\n"
                + "Да начнется битва!\n");

        dice = random.nextInt(10) + 1;
        if (dice > 5) {
            heroTurn = 2;
        } else {
            heroTurn = 1;
        }

        while (nextRound) {
            dice = random.nextInt(10) + 1;

            switch (heroTurn) {
                case 1:
                    if (dice == 1 && actionCount > 0 && attack) {
                        hero_1.die();
                        attack = false;
                        nextRound = false;
                    }
                    else if (dice == 10 && actionCount > 0) {
                        hero_1.run();
                        attack = false;
                        nextRound = false;
                    }
                    else if (dice < 5) {
                        hero_1.attack();
                        attack = true;
                    }
                    else if (dice < 7) {
                        hero_1.heavyAttack();
                        attack = true;
                    }
                    else {
                        hero_1.shieldBlock();
                        attack = false;
                    }
                    ++actionCount;
                    ++heroTurn;
                    break;

                case 2:
                    if (dice == 1 && actionCount > 0 && attack) {
                        hero_2.die();
                        attack = false;
                        nextRound = false;
                    }
                    else if (dice == 10 && actionCount > 0) {
                        hero_2.run();
                        attack = false;
                        nextRound = false;
                    }
                    else if (dice < 5) {
                        hero_2.lightningArrow();
                        attack = true;
                    }
                    else if (dice < 7) {
                        hero_2.fireball();
                        attack = true;
                    }
                    else {
                        hero_2.magicShield();
                        attack = false;
                    }
                    ++actionCount;
                    --heroTurn;
                    break;

                default:
                    break;
            }
        }

        switch (heroTurn) {
            case 1:
                System.out.println("\nВ битве победил "
                        + hero_1.getHeroClass() + " " + hero_1.getHeroName() + "!");
                break;
            case 2:
                System.out.println("\nВ битве победил "
                        + hero_2.getHeroClass() + " " + hero_2.getHeroName() + "!");
                break;
            default:
                break;
        }
    }
}
