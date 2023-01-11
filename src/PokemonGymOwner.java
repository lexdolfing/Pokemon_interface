public class PokemonGymOwner extends PokemonTrainer{


    public PokemonGymOwner(String ownerName, String town, List<Pokemon> pokemons) {
        super(ownerName, town, pokemons)
        this.ownerName = ownerName;
        this.town = town;
        this.pokemons = pokemons;
    }

    public String getTown(){
        return town;
    }

    public String getName() {
        return ownerName;
    }
}
