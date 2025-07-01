package attacks.statusMove;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;

public class ThunderWave extends StatusMove{

    public ThunderWave(Type type, Integer power, double accuracy) {
        super(type, power, accuracy);
    }

    public String describe() {
        return "использует Thunder Wave";
    }

    public void applyOppEffects(Pokemon p){

        Effect.paralyze(p);
    }
}
