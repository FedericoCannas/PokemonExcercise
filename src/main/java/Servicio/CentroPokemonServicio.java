package Servicio;

import Clases.Bulbasaur;
import Clases.Charmander;
import Clases.Pikachu;
import Clases.Pokemon;
import Clases.Squirtle;
import java.util.ArrayList;

public class CentroPokemonServicio {

    int[] niveles = {16, 36};

    Pokemon pikachu = new Pikachu("Pikachu", "Electrico", 1, 10, 20, 120, 50, 55, 65, 25, 50, niveles);
    Pokemon bulbasaur = new Bulbasaur("Bulbasaur", "Planta", 2, 13, 1, 130, 38, 45, 55, 45, 30, niveles);
    Pokemon charmander = new Charmander("Charmander", "Fuego", 3, 15, 4, 138, 45, 35, 65, 48, 40, niveles);
    Pokemon squirtle = new Squirtle("Squirtle", "Agua", 5, 18, 7, 120, 48, 60, 65, 48, 35, niveles);

    ArrayList<Pokemon> pokedex = new ArrayList();

    public void agregarPokemon() {

        pokedex.add(pikachu);
        pokedex.add(bulbasaur);
        pokedex.add(charmander);
        pokedex.add(squirtle);

    }

    public void mostrar() {
        for (Pokemon poke : pokedex) {
            poke.araniazo();
            poke.cabezazo();
            poke.velocidad();
            poke.evolucion();
            System.out.println(poke);
            System.out.println("**********************");
        }
    }

}
