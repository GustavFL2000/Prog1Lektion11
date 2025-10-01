package opgave06;

public class Monster {
    public int lifePoints;
    public int damagePoints;
    public double chanceOfHit; // i procent
    public String description;
    public String attackDescription;
    public String attribute;

    public void monsterAttacks(int roll, Hero hero, Monster monster) {
        System.out.print("The " + monster.description + " " + monster.attackDescription);
        if (roll <= monster.chanceOfHit) {
            System.out.println(" inflicting " + monster.damagePoints + " damage.");
            hero.lifePoints -= monster.damagePoints;
            if (hero.lifePoints <= 0) {
                System.out.println("Slaying " + hero.name + "!");
            }
        } else {
            System.out.println(" but " + hero.name + " defends heroically.");
        }
    }
}
