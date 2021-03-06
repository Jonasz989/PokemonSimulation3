package Simulation.Pokemon.FromPokemon;

import Simulation.Pokemon.Pokemon;

public class PokemonWater extends Pokemon {

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //VARIABLES
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static int howManyWaterPokemonsOnTheMap = 6;
    final private String pokemonType;

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //CONSTRUCTOR
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public PokemonWater(int level, int currentX, int currentY, String pokemonType) {
        super(level, currentX, currentY);
        this.pokemonType = pokemonType;
        Pokemon.setCountOfPokemonsOnTheMap(getCountOfPokemonsOnTheMap() + 1);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //GETTERS AND SETTERS
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static int getHowManyWaterPokemonsOnTheMap() {
        return howManyWaterPokemonsOnTheMap;
    }
    public static void setHowManyWaterPokemonsOnTheMap(int howManyWaterPokemonsOnTheMap) {PokemonWater.howManyWaterPokemonsOnTheMap = howManyWaterPokemonsOnTheMap;}


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //METHODS
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public String getPokemonType() {
        return pokemonType;
    }
}

