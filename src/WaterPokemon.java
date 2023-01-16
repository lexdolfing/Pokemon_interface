import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

    //    private final;
//    private final;

    List<String> attacks = Arrays.asList("surf","hydropump","hydrocanon","raindance");
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "Water");
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with surf");
        determineHpLoss(pokemon, gymPokemon);
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with HydroPump");
        determineHpLoss(pokemon, gymPokemon);
    }

    public void hydroCannon(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with HydroCannon");
        determineHpLoss(pokemon, gymPokemon);
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with RainDance");
        if(gymPokemon.getType() == "Electric"){
            System.out.println("raindance has no effect on Electric type Pokemon");
        } else if (gymPokemon.getType() == "Grass") {
            System.out.println("This move gives an HP boost  of 5 to grass type " + gymPokemon.getName());
            gymPokemon.setHp(gymPokemon.getHp() + 5);
            System.out.println(gymPokemon.getName() + " now has an HP of: " + gymPokemon.getHp());
        } else{
            determineHpLoss(pokemon, gymPokemon);
        }
    }

    public void determineHpLoss (Pokemon pokemon, Pokemon gymPokemon){


        if (gymPokemon.getType() == "Fire") {
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 20 HP");
            gymPokemon.setHp(currentHp-20);
        }
        else if (gymPokemon.getType() == "Water"){
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 5 HP");
            gymPokemon.setHp(currentHp-5);

        }
        else if (gymPokemon.getType() == "Grass"){
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 1 HP");
            gymPokemon.setHp(currentHp-1);
        }
        else if (gymPokemon.getType() == "Electric"){
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 5 HP");
            gymPokemon.setHp(currentHp-5);
        }

    }

}
