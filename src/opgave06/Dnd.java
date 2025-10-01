package opgave06;

public class Dnd {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "Arthur";
        hero.pronoun = "his";
        hero.weapon = "sword";
        hero.lifePoints = 50;
        hero.damagePoints = 10;
        hero.chanceOfHit = 60; // procent chance for at ramme

        Monster monster = new Monster();
        monster.description = "Orc";
        monster.attackDescription = "swings its axe";
        monster.lifePoints = 40;
        monster.damagePoints = 8;
        monster.chanceOfHit = 50; // procent chance for at ramme

        fight(hero, monster);
    }

    public static void fight(Hero hero, Monster monster) {
        while (hero.lifePoints > 0 && monster.lifePoints > 0) {
            int roll = rollD100();
            hero.heroAttacks(roll, hero, monster);
            if (monster.lifePoints > 0) {
                roll = rollD100();
                monster.monsterAttacks(roll, hero, monster);
            }
        }
    }

    public static int rollD100() {
        return (int) (Math.random() * 100 + 1);
    }
}
