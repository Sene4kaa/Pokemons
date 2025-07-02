package attacks.statusMove;

import ru.ifmo.se.pokemon.*;


public class PlayNice extends StatusMove{

    public PlayNice(Type type, Integer power, double accuracy) {
        super(type, power, accuracy);
    }

    public String describe() {
        return "Play nice used!";
    }

    public void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }
}
