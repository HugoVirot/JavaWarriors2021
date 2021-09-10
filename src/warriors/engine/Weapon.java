package warriors.engine;

public class Weapon extends Event {

    public Weapon(String name, int attackLevel){
        super(name, 0, attackLevel, "arme");
    }

    public String toString(){
        return "L'arme est une " + name + ", elle vous fait gagner " + attackLevel + " points d'attaque";
    }
}
