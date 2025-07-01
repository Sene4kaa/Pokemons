package attacks.statusMove;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class PlayNice extends StatusMove{

    public PlayNice(Type type, Integer power, double accuracy) {
        super(type, power, accuracy);
    }

    public String describe() {
        return "Play nice used!";
    }
}
