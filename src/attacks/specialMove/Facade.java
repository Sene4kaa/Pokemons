package attacks.specialMove;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;


public class Facade extends SpecialMove{

    Facade(Type type, Integer power, float accuracy){
        super(type, power, accuracy);
    }
}
