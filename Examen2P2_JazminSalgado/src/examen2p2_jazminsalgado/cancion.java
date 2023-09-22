/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_jazminsalgado;

import java.util.ArrayList;

/**
 *
 * @author evaja
 */
public class cancion {
    private String titulo;
    private double tiempo;
    private String albumosingle;

    public cancion() {
    }

    public cancion(String titulo, double tiempo, String albumosingle) {
        this.titulo = titulo;
        this.tiempo = tiempo;
        this.albumosingle = albumosingle;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public String getAlbumosingle() {
        return albumosingle;
    }

    public void setAlbumosingle(String albumosingle) {
        this.albumosingle = albumosingle;
    }

    @Override
    public String toString() {
        return "cancion{" + "titulo=" + titulo + ", tiempo=" + tiempo + ", albumosingle=" + albumosingle + '}';
    }
    
    
    
}
