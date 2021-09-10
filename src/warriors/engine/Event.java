package warriors.engine;

public class Event {
    protected String name;
    protected int lifeLevel;
    protected int attackLevel;
    protected String type;

    public Event(){
        this.name = "vide";
        this.type = "vide";
    }

    public Event(String name, int lifeLevel, int attackLevel, String type){
        this.name = name;
        this.lifeLevel = lifeLevel;
        this.attackLevel = attackLevel;
        this.type = type;
    }

    public int getAttackLevel(){
        return attackLevel;
    }
    public String getName() {
        return name;
    }
    public int getLifeLevel(){
        return lifeLevel;
    }
    public String getType() {
        return type;
    }

    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }
}
