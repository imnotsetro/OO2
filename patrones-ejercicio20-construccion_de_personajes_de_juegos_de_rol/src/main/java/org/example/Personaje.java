package org.example;

import java.util.List;

/*
    El uso del patron Strategy de parte de las
    armas con las armaduras permite facilidad
    al agregar nuevas armas y armaduras.
 */

public class Personaje {
    private String nombre;
    private int vida;
    private Armadura armadura;
    private Arma arma;
    private List<Habilidad> habilidades;

    public Personaje(String nombre, Armadura armadura, Arma arma, List<Habilidad> habilidades) {
        this.nombre = nombre;
        this.vida = 100;
        this.armadura = armadura;
        this.arma = arma;
        this.habilidades = habilidades;
    }

    public Personaje() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public boolean puedeCombatir(){
        return this.vida > 0;
    }

    public void atacar(Personaje personaje){
        if (this.puedeCombatir() && personaje.puedeCombatir()){
            personaje.recibirAtaque(this.arma);
        } else {
            System.out.println("El enemigo no puede combatir");
        }
    }

    public void recibirAtaque(Arma arma){
        this.setVida(this.vida - arma.atacar(this.armadura));
    }
}
