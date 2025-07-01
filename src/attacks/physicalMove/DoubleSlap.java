package attacks.physicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;


public class DoubleSlap extends PhysicalMove {

    public DoubleSlap(Type type, Integer power, double accuracy){
        super(type, power, accuracy);
    }

    public String describe(){
        return "использует Double Slap!";
    }
}
