import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{
    List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "Fire");
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with Inferno");
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with PyroBall");
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with fireLash");
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with FlameThrower");
    }
}
