package warriors.engine;

import java.util.ArrayList;
import java.util.List;

public class Map implements warriors.contracts.Map {
    private String name;
    private int numberOfSquares;
    private List<Square> mapSquares;

    public Map(String name, int numberOfSquares) {
        this.name = name;
        this.numberOfSquares = numberOfSquares;
        this.mapSquares = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumberOfSquares() {
        return numberOfSquares;
    }

}
