import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

//    private final;
//    private final;
    List<String> attacks = Arrays.asList("inferno", "pyroball", "firelash", "flamethrower");


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "Fire");
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with Inferno");
        determineHpLoss(pokemon, gymPokemon);
    }



    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with PyroBall");
        determineHpLoss(pokemon, gymPokemon);
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with fireLash");
        determineHpLoss(pokemon, gymPokemon);
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with FlameThrower");
        determineHpLoss(pokemon, gymPokemon);
    }

    public void determineHpLoss (Pokemon pokemon, Pokemon gymPokemon){
        String opponentType = gymPokemon.getType();

        if (opponentType == "Fire") {
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 5 HP");
            gymPokemon.setHp(currentHp-5);
        }
        else if (opponentType == "Water"){
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 1 HP");
            gymPokemon.setHp(currentHp-1);

        }
        else if (opponentType == "Grass"){
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 20 HP");
            gymPokemon.setHp(currentHp-20);
        }
        else if (opponentType == "Electric"){
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 10 HP");
            gymPokemon.setHp(currentHp-10);
        }

    }
}
