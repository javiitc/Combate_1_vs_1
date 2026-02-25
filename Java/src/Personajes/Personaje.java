package Personajes;

public class Personaje {
    private String name;
    private int health;
    private int maxHealth;

    public Personaje(String name, int health) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
        if (this.health < 0) this.health = 0;
        System.out.println(name + " now has " + health + " HP.");
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public int getHealth() { return health; }

    public void setHealth(int health) {
        // makes sure health doesn't exceed max or drop below 0
        if (health > maxHealth) {
            this.health = maxHealth;
        } else {
            this.health = Math.max(0, health);
        }
    }

    public String getName() { return name; }
}