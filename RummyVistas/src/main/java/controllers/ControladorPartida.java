/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dtos.FichaDTO;
import dtos.JugadorDTO;

/**
 *
 * @author Equipo 06
 */
public class ControladorPartida {
    private JugadorDTO jugador;
    private Prueba mazo;

    public ControladorPartida(JugadorDTO jugador, Prueba mazo) {
        this.jugador = jugador;
        this.mazo = mazo;
    }

    // Extraer una ficha del mazo.
    public FichaDTO extraerFicha() {
        FichaDTO ficha = new FichaDTO();
        return ficha.seleccionarFicha(mazo.getMazoPrueba());
    }

    public void darFicha(FichaDTO ficha) {
        jugador.getFichas().add(ficha);  // Agrega una ficha al jugador
    }
    
}
