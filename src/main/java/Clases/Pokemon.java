package Clases;

import java.util.ArrayList;

public abstract class Pokemon {

    protected String nombre;
    protected String tipo;
    protected int nivel;
    protected int experiencia;
    protected int numeroDex;
    protected int salud;
    protected int ataque;
    protected int ataqueEspecial;
    protected int defensa;
    protected int defensaEspecial;
    protected int velocidad;
    protected int[] nivelesEvolucion;// 15-36

    public abstract void araniazo();

    public abstract void cabezazo();

    public abstract void velocidad();

    public abstract void evolucion();

    public Pokemon() {
    }

    public Pokemon(String nombre, String tipo, int nivel, int experiencia, int numeroDex, int salud, int ataque, int ataqueEspecial, int defensa, int defensaEspecial, int velocidad, int[] nivelesEvolucion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.numeroDex = numeroDex;
        this.salud = salud;
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.defensa = defensa;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.nivelesEvolucion = nivelesEvolucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getNumeroDex() {
        return numeroDex;
    }

    public void setNumeroDex(int numeroDex) {
        this.numeroDex = numeroDex;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int[] getNivelesEvolucion() {
        return nivelesEvolucion;
    }

    public void setNivelesEvolucion(int[] nivelesEvolucion) {
        this.nivelesEvolucion = nivelesEvolucion;
    }

    @Override
    public String toString() {
        return " Pokemon nombre=" + nombre +
                "\n Tipo:" + tipo +
                "\n Nivel:" + nivel +
                "\n Experiencia:" + experiencia +
                "\n Numero Pokedex:" + numeroDex +
                "\n Salud:" + salud +
                "\n Ataque:" + ataque +
                "\n Ataque Especial:" + ataqueEspecial +
                "\n Defensa:" + defensa +
                "\n Defensa Especial:" + defensaEspecial +
                "\n Velocidad:" + velocidad +
                "\n Niveles Evolucion:" + nivelesEvolucion + '}';
    }
}
