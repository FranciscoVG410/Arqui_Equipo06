/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.util.List;

/**
 * Representa un jugador del juego Rummy.
 * @author Equipo 06
 */
public class JugadorDTO {
    private Long id;
    private String nombre;
    private String avatar;
    private List<FichaDTO> fichas;
    private int turno;

    public JugadorDTO() {
    }

    public JugadorDTO(String nombre, String avatar, List<FichaDTO> fichas, int turno) {
        this.nombre = nombre;
        this.avatar = avatar;
        this.fichas = fichas;
        this.turno = turno;
    }
    
    
    
    public void notifyObservers(){
        
    }
    
    public void actualizarEstado(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<FichaDTO> getFichas() {
        return fichas;
    }

    public void setFichas(List<FichaDTO> fichas) {
        this.fichas = fichas;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "JugadorDTO{" + "id=" + id + ", nombre=" + nombre + ", avatar=" + avatar + ", fichas=" + fichas + ", turno=" + turno + '}';
    }
    
    
}
