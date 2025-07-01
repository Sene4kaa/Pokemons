import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import pokemons.*;
import ru.ifmo.se.pokemon.Type;

import java.util.Arrays;


public class Program {
    public static void main(String[] args) {

        Battle b = new Battle();
        Venonat p1 = new Venonat("Галина Петровна", 4);
        Latias p2 = new Latias("Етить колотить", 3);

        b.addAlly(p1);
        b.addFoe(p2);
        b.go();

        System.out.println(Arrays.toString(p2.getTypes()));
    }
}