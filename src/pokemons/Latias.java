package pokemons;

import ru.ifmo.se.pokemon.Pokemon;


public class Latias extends Pokemon{

    String type;

    public Latias(String name, Integer power, String type) {

        super(name, power);
        this.type = type;
    }
}
