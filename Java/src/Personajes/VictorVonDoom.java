package Personajes;

public class VictorVonDoom extends Personaje{

    private String specialAttack;
    private String hability;
    private String defenseHability;

    public VictorVonDoom(String name, int health, String specialAttack, String hability, String defenseHability) {
        super(name, health);
        this.specialAttack = specialAttack;
        this.hability = hability;
        this.defenseHability = defenseHability;
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public String getHability() {
        return hability;
    }

    public String getDefenseHability() {
        return defenseHability;
    }

    public void doomAttack (Personaje enemy){
        if (Math.random() > 0.3) {
            System.out.println(this.getName() + "uses " + this.getSpecialAttack());
            enemy.takeDamage(25);
        } else {
            System.out.println(this.getName() + "uses Magic Punch");
            enemy.takeDamage(10);
        }
    }

    @Override
    public void takeDamage(int amount) {
        this.setHealth(this.getHealth() - amount);
        System.out.println("Doctor Doom took " + amount + " damage. Remaining health: " + this.getHealth());
    }

    public void blockAttack (int incomingDmg) {
        incomingDmg = 0;
        this.setHealth(getHealth() - incomingDmg);
        System.out.println("Magic Guard! Doom blocked the attack. No damage received.");
    }
}
