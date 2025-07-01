package attacks.physicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class ShadowClaw extends PhysicalMove {

    public ShadowClaw(Type type, Integer power, float accuracy){
        super(type, power, accuracy);
    }

    public String describe() {
        return "использует Shadow Claw!";
    }
}
