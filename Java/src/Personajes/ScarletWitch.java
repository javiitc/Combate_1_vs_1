package Personajes;

public class ScarletWitch extends Personaje {

    public ScarletWitch(String name, int health) {
        super(name, health);
    }

    /**
     * attacks enemy.
     * Scarlet Blast (high dmg) | Mind Control (low dmg)
     */
    @Override
    public int attack () {
        if (Math.random() > 0.3) {
            System.out.println("Scarlet Witch uses Scarlet Blast!");
            return 25;
        } else {
            System.out.println("Scarlet Witch uses Mind Control!");
            return 10;
        }
    }

    /**
     * defensive move
     * instead of losing health, she absorbs the energy to heal
     */
    @Override
    public void defend(int incomingDamage) {
        int absorbedAmount = incomingDamage / 2;
        this.setHealth(this.getHealth() + absorbedAmount);
        System.out.println("Chaos Magic! Wanda absorbed the attack and healed for " + absorbedAmount);
    }

    @Override
    public String winMessage () {
        return "The Scarlet Witch rewrites reality once more. The multiverse is restored!";
    }
}
