import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import pokemons.Latias;



public class Program {
    public static void main(String[] args) {

        Battle b = new Battle();
        Pokemon p1 = new Pokemon("Чужой", 1);
        Latias p2 = new Latias("Пика пика", 1, "Желтый");

        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}