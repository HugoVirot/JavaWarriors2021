package warriors.engine;

public class Potion extends Event{

    public Potion (String name, int lifeLevel){
        super(name, lifeLevel, 0, "potion");
    }

    public String toString(){
        return "C'est une " + name + ", elle vous fait gagner + " + lifeLevel + " points de vie";
    }
}
