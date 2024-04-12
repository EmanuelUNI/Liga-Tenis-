/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.league;

import core.person.Juez;
import core.person.Jugador;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author eduar
 */
public class LigaTenis {
    
    private ArrayList<Campeonato> campeonatos;
    private ArrayList<Juez> jueces;
    private ArrayList<Jugador> jugadores;

    public LigaTenis() {
        this.campeonatos = new ArrayList<>();
        this.jueces = new ArrayList<>();
        this.jugadores = new ArrayList<>();
    }
    
    public boolean addCampeonato(Campeonato campeonato) {
        if (!this.campeonatos.contains(campeonato)) {
            this.campeonatos.add(campeonato);
            return true;
        }
        return false;
    }
    
    public boolean addJuez(Juez juez) {
        if (!this.jueces.contains(juez)) {
            this.jueces.add(juez);
            return true;
        }
        return false;
    }
    
    public boolean addJugador(Jugador jugador) {
        if (!this.jugadores.contains(jugador)) {
            this.jugadores.add(jugador);
            return true;
        }
        return false;
    }
    
    public Campeonato getCampeonato(int index) {
        return this.campeonatos.get(index);
    }
    
    public Juez getJuez(int index) {
        return this.jueces.get(index);
    }
    
    public Jugador getJugador(int index) {
        return this.jugadores.get(index);
    }
    
    public void calcSetsGanadosJugadoresCampeonato(int index) {
        HashMap<Jugador, Integer> frecuenciaJugadoresSets = this.campeonatos.get(index).getFrecuenciaJugadoresSets();
        for (Jugador jugador : this.jugadores) {
            System.out.println("El jugador: " + jugador.getNombre() + " gano " + frecuenciaJugadoresSets.get(jugador) + " sets en el campeonato");
        }
    }
    
}
