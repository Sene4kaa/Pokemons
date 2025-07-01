package attacks.statusMove;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends StatusMove{

    public Swagger(Type type, Integer power, double accuracy) {
        super(type, power, accuracy);
    }

    public String describe() {
        return "Swagger used!";
    }
}
