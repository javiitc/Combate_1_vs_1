package Personajes;

public class ScarletWitch extends Personaje {

    public ScarletWitch(String name, int health) {
        super(name, health);
    }

    /**
     * attacks enemy.
     * Scarlet Blast (high dmg) | Mind Control (low dmg)
     */
    public void hitEnemy(Personaje enemy) {
        if (Math.random() > 0.3) {
            System.out.println("Scarlet Witch uses Scarlet Blast!");
            enemy.takeDamage(25);
        } else {
            System.out.println("Scarlet Witch uses Mind Control!");
            enemy.takeDamage(10);
        }
    }

    /**
     * takes damage
     */
    @Override
    public void takeDamage(int amount) {
        this.setHealth(this.getHealth() - amount);
        System.out.println("Wanda took " + amount + " damage. Remaining health: " + this.getHealth());
    }

    /**
     * defensive move
     * instead of losing health, she absorbs the energy to heal
     */
    public void absorbAttack(int incomingDamage) {
        int absorbedAmount = incomingDamage / 2;
        this.setHealth(this.getHealth() + absorbedAmount);
        System.out.println("Chaos Magic! Wanda absorbed the attack and healed for " + absorbedAmount);
    }
}
