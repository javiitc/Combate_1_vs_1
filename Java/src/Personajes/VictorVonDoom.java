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

    @Override
    public int attack (){
        if (Math.random() > 0.3) {
            System.out.println(this.getName() + " uses " + this.getSpecialAttack());
            return 25;
        } else {
            System.out.println(this.getName() + "uses Magic Punch");
            return 10;
        }
    }

    @Override
    public void defend (int incomingDmg) {
        System.out.println("Magic Guard! Doom blocked the attack. No damage received.");
    }

    @Override
    public String winMessage() {
        return "DOOM is eternal. There was never any doubt. BattleWorld endures!";
    }
}
