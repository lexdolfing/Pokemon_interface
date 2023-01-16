import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

//    private final;
//    private final;

    List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "volttackle");
    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "Electric");

    }
    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with Thunderpunch");
        determineHpLoss(pokemon, gymPokemon);
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with ElectroBall");
        determineHpLoss(pokemon, gymPokemon);
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with Thunder");
        if(gymPokemon.getType() == "Electric"){
            gymPokemon.setHp(gymPokemon.getHp()+10);
            System.out.println("Thunder gives a boost of 10 HP to Electric type Pokemon, " + gymPokemon.getName() + "now has an HP of " + gymPokemon.getHp());

        } else{
        determineHpLoss(pokemon, gymPokemon);
        }
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() +" with Volttackle");
        determineHpLoss(pokemon, gymPokemon);
    }

    public void determineHpLoss (Pokemon pokemon, Pokemon gymPokemon){


        if (gymPokemon.getType() == "Fire") {
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 10 HP");
            gymPokemon.setHp(currentHp-10);
        }
        else if (gymPokemon.getType() == "Water"){
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 20 HP");
            gymPokemon.setHp(currentHp-20);

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
