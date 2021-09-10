package warriors.engine;

public class Enemy extends Event{
    public Enemy(String name, int lifeLevel, int attackLevel){
        super(name, lifeLevel, attackLevel, "ennemi");
    }

    public String toString(){
        return "C'est un " + name + ", il a " + attackLevel + " points d'attaque et " + lifeLevel + " points de vie";
    }
}
