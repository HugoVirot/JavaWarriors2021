package warriors.engine;

public class Spell extends Event {

    public Spell(String name, int attackLevel){
        super(name, 0, attackLevel, "sort");
    }

    public String toString(){
        return "Le sort est : " + name + ", il vous fait gagner " + attackLevel + " points d'attaque";
    }
}
