package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import attacks.specialMove.DreamEater;
import attacks.physicalMove.ShadowClaw;
import attacks.physicalMove.DoubleSlap;
import attacks.statusMove.ThunderWave;
import ru.ifmo.se.pokemon.Type;


public class Latias extends Pokemon {

    public Latias(String name, int level) {
        super(name, level);
        setType(Type.DRAGON, Type.PSYCHIC);
        setMove(new DreamEater(Type.PSYCHIC, 100, 1),
                new ShadowClaw(Type.GHOST, 70, 1),
                new ThunderWave(Type.ELECTRIC, 50, 1),
                new DoubleSlap(Type.NORMAL, 15, 0.85)
        );
    }
}