package Personajes;

public class VictorVonDoom extends Personaje{

    private String specialAttack;
    private String hability;
    private int magicQuantity;
    private String defenseHability;

    public VictorVonDoom(String name, int hp, int attackDmg, int specialAttackDmg, String specialAttack, String hability, int magicQuantity, String defenseHability) {
        super(name, hp, attackDmg, specialAttackDmg);
        setName("Doctor Doom");
        setHp(180);
        setAttackDmg(35);
        setSpecialAttackDmg(70);
        this.specialAttack = "Energy Blast";
        this.hability = "Beyonder Power Absorb";
        this.magicQuantity = 120;
        this.defenseHability = "Magic Guard";
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public String getHability() {
        return hability;
    }

    public int getMagicQuantity() {
        return magicQuantity;
    }

    public String getDefenseHability() {
        return defenseHability;
    }
}
