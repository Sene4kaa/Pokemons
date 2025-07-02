package attacks.statusMove;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;


public class Recover extends StatusMove{

    public Recover(Type type, Integer power, double accuracy) {
        super(type, power, accuracy);
    }

    public String describe() {
        return "Recover used!";
    }

    public void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, (int)(p.getHP() * (-0.5)));
    }
}
