package Personajes;

public class VictorVonDoom extends Personaje{

    private String specialAttack;
    private String hability;
    private int magicQuantity;
    private String defenseHability;

    public VictorVonDoom(String name, int health, String specialAttack, String hability, int magicQuantity, String defenseHability) {
        super(name, health);
        this.specialAttack = specialAttack;
        this.hability = hability;
        this.magicQuantity = magicQuantity;
        this.defenseHability = defenseHability;
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
