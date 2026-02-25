package Personajes;

public class Personaje {

    private String name;
    private int hp;
    private int attackDmg;
    private int specialAttackDmg;

    public Personaje(String name, int hp, int attackDmg, int specialAttackDmg) {
        this.name = name;
        this.hp = hp;
        this.attackDmg = attackDmg;
        this.specialAttackDmg = specialAttackDmg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackDmg() {
        return attackDmg;
    }

    public void setAttackDmg(int attackDmg) {
        this.attackDmg = attackDmg;
    }

    public int getSpecialAttackDmg() {
        return specialAttackDmg;
    }

    public void setSpecialAttackDmg(int specialAttackDmg) {
        this.specialAttackDmg = specialAttackDmg;
    }
}
