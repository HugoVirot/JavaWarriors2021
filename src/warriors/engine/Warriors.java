package warriors.engine;

import warriors.contracts.*;
import warriors.contracts.GameState;
import warriors.contracts.Hero;
import warriors.contracts.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Warriors implements WarriorsAPI {
    private List<Hero> heroesList;
    private List<Map> mapsList;
    warriors.engine.GameState gameState;
    int diceResult;

    public Warriors(){
        this.heroesList = new ArrayList<>();
        Hero hero1 = new Warrior("Johan", 10, 7);
        Hero hero2 = new Warrior("Alexis", 9, 6);
        Hero hero3 = new Wizard("Merlin", 5, 10);
        Hero hero4 = new Wizard("Steven", 6, 15);
        heroesList.add(hero1);
        heroesList.add(hero2);
        heroesList.add(hero3);
        heroesList.add(hero4);
        ;
        this.mapsList = new ArrayList<>();
        warriors.engine.Map niortMap = new warriors.engine.Map("NiortMap", 64);
        mapsList.add(niortMap);
    }

    @Override
    public List<Hero> getHeroes(){
        return heroesList;
    }

    @Override
    public List<Map> getMaps() {
        return mapsList;
    }

    @Override
    public GameState createGame(String playerName, Hero hero, Map map){
        gameState = new warriors.engine.GameState(playerName, hero, map);
        return gameState;    }

    @Override
    public GameState nextTurn(String gameId){

        diceResult = diceRoll();
        Hero hero = gameState.getHero();
        warriors.engine.Map map = (warriors.engine.Map) gameState.getMap();
        String message = "";

        //déplacer le perso et afficher la case actuelle
        gameState.setCurrentSquare(gameState.getCurrentSquare() + diceResult);

        // fin du plateau
        if (gameState.getCurrentSquare() >= 64) {
            gameState.setCurrentSquare(64);
            message = "Vous avez fait un " + diceResult + " et vous etes sur la case " + gameState.getCurrentSquare() + ", VICTOIRE !!!";
            gameState.setGameStatus(GameStatus.FINISHED);

            // partie toujours en cours
        } else {
            message = "Vous avez fait un " + diceResult + " et vous êtes sur la case " + gameState.getCurrentSquare();
        }
        gameState.setLastLog(message);
        return gameState;
    }

    private int diceRoll(){
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}
