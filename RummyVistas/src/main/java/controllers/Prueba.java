/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dtos.FichaDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PERSONAL
 */
public class Prueba {
    
    private List<FichaDTO> mazoPrueba;

    public Prueba() {
        mazoPrueba = new ArrayList<>();
    }
    
    public void construirMazo (){
        for (int i = 0; i < 108; i++) {
            FichaDTO nueva = new FichaDTO();
            nueva.setPuntos(i);
            mazoPrueba.add(nueva);
        }
    }

    public List<FichaDTO> getMazoPrueba() {
        return mazoPrueba;
    }

    public void setMazoPrueba(List<FichaDTO> mazoPrueba) {
        this.mazoPrueba = mazoPrueba;
    }

    @Override
    public String toString() {
        return "Prueba{" + "mazoPrueba=" + mazoPrueba + '}';
    }
    
}
