package opgave06;

public class Hero {
    public int lifePoints;
    public int damagePoints;
    public double chanceOfHit; // i procent
    public String name;
    public String pronoun;
    public String weapon;

    public void heroAttacks(int roll, Hero hero, Monster monster) {
        System.out.print(hero.name + " attacks with " + hero.pronoun + " " + hero.weapon);
        if (roll <= hero.chanceOfHit) {
            System.out.println(" and hits the " + monster.description + " inflicting " + hero.damagePoints + " damage.");
            monster.lifePoints -= hero.damagePoints;
            if (monster.lifePoints <= 0) {
                System.out.println("Killing the " + monster.description + "!");
            }
        } else {
            System.out.println(" but misses the target.");
        }
    }
}
