/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.util.List;
import java.util.Random;

//DTO nueva

/**
 * Los detalles generales de una ficha en Rummy.
 *
 * @author Equipo 06
 */
public class FichaDTO {
    //Atributos de clase.
    private int puntos;

    /**
     * Constructor por defecto de la clase.
     */
    public FichaDTO() {
    }

    /**
     * Construye una ficha e inicializa los atributos de clase con los valores
     * dados en el parámetro.
     *
     * @param puntos Puntaje de la ficha.
     */
    public FichaDTO(int puntos) {
        this.puntos = puntos;
    }

    /**
     * Selecciona una ficha al azar de un mazo de fichas, siempre y cuando haya
     * fichas en el mazo.
     *
     * @param mazo Mazo del que se sacará una ficha.
     * @return Ficha seleccionada.
     */
    public FichaDTO seleccionarFicha(List<FichaDTO> mazo) {
        if (!mazo.isEmpty()) {
            Random random = new Random();
            int index = random.nextInt(mazo.size());
            return mazo.remove(index);  // Extrae y remueve la ficha
        } else {
            return null;  // Si no hay más fichas en el mazo
        }
    }

    /**
     * Obtiene los puntos que vale la ficha.
     *
     * @return
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * Asigna el valor en puntos de una ficha.
     *
     * @param puntos
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * Regresa una cadena con los valores de los atributos de la clase.
     *
     * @return Cadena con valores.
     */
    @Override
    public String toString() {
        return "FichaDTO{" + "puntos=" + puntos + '}';
    }

}
