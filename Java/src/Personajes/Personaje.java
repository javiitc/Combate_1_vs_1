package Personajes;

public abstract class Personaje {
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

    public void setName(String name) {
        this.name = name;
    }

    //Usamos la clase abstracta para hacer la plantilla personajes por dos motivos:
    //1. Debido a que en el Main se guarda el personaje en atacante y defensor, así el programa sabe de quién (Wanda o Doom) viene el ataque o defensa.
    //En caso contrario, habría que decirle manualmente que a que objeto hacemos referencia (Wanda o Doom).
    //2. Tanto Wanda como Doom al ser subclases, comparten comportamientos al heredarlas, pero los métodos de ataque y defensa son unicos para cada uno,
    //así que definiendo ambas como abstractas, se obliga a que todos los que hereden la clase Personajes, tengan un ataque y defensa unicos, que hay que definir dentro.
    public abstract void attack(Personaje enemy);
    public abstract void defend(int incomingDamage);
}
