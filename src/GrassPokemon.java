import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{

    List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leafBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "Grass");
    }

    @Override
    public List<String> getAttacks() {return attacks;}

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with Leaf Storm");
        determineHpLoss(pokemon, gymPokemon);
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with Solar Beam");
        determineHpLoss(pokemon, gymPokemon);
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with Leech Seed");
        determineHpLoss(pokemon, gymPokemon);
        switch(gymPokemon.getType()){
            case "Fire": pokemon.setHp(pokemon.getHp() + 5);
                System.out.println(pokemon.getName() + " steals 5 HP from enemy and now has an HP of " + pokemon.getHp()) ;
                break;
            default: break;
        }
    }

    public void leafBlade(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with Leaf Blade");
        determineHpLoss(pokemon, gymPokemon);
    }

    public void determineHpLoss (Pokemon pokemon, Pokemon gymPokemon){

        if (gymPokemon.getType() == "Fire") {
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 5 HP");
            gymPokemon.setHp(currentHp-5);
        }
        else if (gymPokemon.getType() == "Water"){
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 1 HP");
            gymPokemon.setHp(currentHp-1);

        }
        else if (gymPokemon.getType() == "Grass"){
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 10 HP");
            gymPokemon.setHp(currentHp-10);
        }
        else if (gymPokemon.getType() == "Electric"){
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 20 HP");
            gymPokemon.setHp(currentHp-20);
        }

    }

}
