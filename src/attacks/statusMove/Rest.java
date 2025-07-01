package attacks.statusMove;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Rest extends StatusMove{

    public Rest(Type type, Integer power, double accuracy) {
        super(type, power, accuracy);
    }

    public String describe() {
        return "Rest used!";
    }
}
