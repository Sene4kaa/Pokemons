package attacks.statusMove;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class DoubleTeam extends StatusMove{

    public DoubleTeam(Type type, Integer power, double accuracy) {
        super(type, power, accuracy);
    }

    public String describe() {
        return "Double team used!";
    }

    public void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, 1);
    }
}
