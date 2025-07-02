package pokemons;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import attacks.physicalMove.Facade;
import attacks.statusMove.Rest;


public class Axew extends Pokemon{

    public Axew(String name, int level){

        super(name, level);
        setType(Type.DRAGON);
        setMove(
                new Facade(Type.NORMAL, 70, 1),
                new Rest(Type.PSYCHIC, 0, 0)
        );
    }
}
