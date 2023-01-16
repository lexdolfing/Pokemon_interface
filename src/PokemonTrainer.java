import java.util.List;

public class PokemonTrainer {
    protected String name;
    protected List<Pokemon> pokemons;


    public PokemonTrainer(String name, List<Pokemon> pokemons){
        this.name = name;
        this.pokemons = pokemons;
    }



    //getters en setters


    public String getName() {
        return name;
    }


    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setName(String ownerName) {
        this.name = name;
    }


    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
