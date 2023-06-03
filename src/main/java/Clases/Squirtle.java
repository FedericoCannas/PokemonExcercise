package Clases;

import Interfaces.Iagua;

public class Squirtle extends Pokemon implements Iagua {

    public Squirtle() {
    }

    public Squirtle(String nombre, String tipo, int nivel, int experiencia, int numeroDex, int salud, int ataque, int ataqueEspecial, int defensa, int defensaEspecial, int velocidad, int[] nivelesEvolucion) {
        super(nombre, tipo, nivel, experiencia, numeroDex, salud, ataque, ataqueEspecial, defensa, defensaEspecial, velocidad, nivelesEvolucion);
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
    public void araniazo() {
        System.out.println("Squirtle usa arañazo!");
    }

    @Override
    public void cabezazo() {
        System.out.println("Squirtle usa cabezazo!");
    }

    @Override
    public void velocidad() {
        System.out.println("Squirtle usa velocidad!");
    }

    @Override
    public void evolucion() {
        System.out.println("Oh!...Charmander esta evolucionando!");
    }

    @Override
    public void burbuja() {
        System.out.println("Squirtle usa ataque burbuja");
    }

    @Override
    public void hidrobomba() {
        System.out.println("Squirtle usa ataque hidro bomba");
    }

    @Override
    public void surfeo() {
        System.out.println("Squirtle usa ataque hidro bomba");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
