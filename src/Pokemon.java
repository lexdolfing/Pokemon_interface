import java.util.List;

public abstract class Pokemon {
    private final String name;
    private final int level;
    private final String type;
    private final String food;
    private final String sound;
    private int hp;

    private List<Pokemon> pokemons;


    public Pokemon(String name, int level, int hp, String food, String sound, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public String getType() {
        return type;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public abstract List<String> getAttacks();


}
