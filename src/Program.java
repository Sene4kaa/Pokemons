import ru.ifmo.se.pokemon.Battle;
import pokemons.*;


public class Program {
    public static void main(String[] args) {

        Battle b = new Battle();
        Venonat p1 = new Venonat("", 4);
        Latias p2 = new Latias("", 3);
        Axew p3 = new Axew("", 4);
        Fraxure p4 = new Fraxure("", 2);
        Haxorus p5 = new Haxorus("", 6);
        Venomoth p6 = new Venomoth("", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}