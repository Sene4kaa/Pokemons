package attacks.specialMove;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;


public class DreamEater extends SpecialMove{

    public DreamEater(Type type, Integer power, double accuracy) { super(type, power, accuracy); }

    public String describe() {
        return "использует Dream eater";
    }
}
