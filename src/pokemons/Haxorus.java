package pokemons;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import attacks.physicalMove.Facade;
import attacks.statusMove.Rest;
import attacks.physicalMove.ViseGrip;
import attacks.statusMove.Recover;

public class Haxorus extends Pokemon{

    public Haxorus(String name, int level) {

        super(name, level);
        setType(Type.DRAGON);
        setMove(
                new Facade(Type.NORMAL, 70, 1),
                new Rest(Type.PSYCHIC, 0, 0),
                new ViseGrip(Type.NORMAL, 55, 1),
                new Recover(Type.NORMAL, 0, 0)
        );
    }
}
