package Main;

import Servicio.CentroPokemonServicio;

public class PokemonMain {

    public static void main(String[] args) {
        CentroPokemonServicio c1 = new CentroPokemonServicio();

        c1.agregarPokemon();
        c1.mostrar();
    }
}
