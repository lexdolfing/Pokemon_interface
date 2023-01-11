public class PokemonTrainer {
    private String ownerName;
    private String town;
    private List<Pokemon> pokemons;






    //getters en setters


    public String getOwnerName() {
        return ownerName;
    }

    public String getTown() {
        return town;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
