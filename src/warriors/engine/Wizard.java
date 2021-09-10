package warriors.engine;

public class Wizard extends LocalHero{
    public static final int MAXLIFE = 6;
    public static final int MAXATTACK = 15;

    public Wizard(String heroName, int lifeLevel, int attackLevel){
        super(heroName, lifeLevel, attackLevel);
    }

    @Override
    public int getMaxLife() { return MAXLIFE;}

    @Override
    public int getMaxAttack() { return MAXATTACK;}
}