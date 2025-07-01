package attacks.statusMove;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove{

    public DoubleTeam(Type type, Integer power, double accuracy) {
        super(type, power, accuracy);
    }

    public String describe() {
        return "Double team used!";
    }
}
