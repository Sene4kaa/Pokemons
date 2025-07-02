package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.statusMove.DoubleTeam;
import attacks.statusMove.Rest;
import attacks.statusMove.Swagger;
import attacks.statusMove.PlayNice;


public class Venomoth extends Pokemon{

    public Venomoth(String name, int level){
        super(name, level);
        setType(Type.BUG, Type.POISON);
        setMove(
                new DoubleTeam(Type.NORMAL, 0, 0),
                new Rest(Type.PSYCHIC, 0, 0),
                new PlayNice(Type.NORMAL, 0, 0),
                new Swagger(Type.NORMAL, 0, 0.85)
        );
    }
}
