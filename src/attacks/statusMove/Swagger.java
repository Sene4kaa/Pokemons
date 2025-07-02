package attacks.statusMove;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;

public class Swagger extends StatusMove{

    public Swagger(Type type, Integer power, double accuracy) {
        super(type, power, accuracy);
    }

    public String describe() {
        return "Swagger used!";
    }

    public void applyOppEffects(Pokemon p) {

        Effect.confuse(p);
    }
}
