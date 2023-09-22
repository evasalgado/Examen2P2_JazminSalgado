/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_jazminsalgado;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author evaja
 */
public class album extends lanzamiento{
    
    private ArrayList<cancion> songs;
    private int cantsong;

    public album() {
    }

    public album(ArrayList<cancion> songs, int cantsong, String titulo, Date rdate, int likes) {
        super(titulo, rdate, likes);
        this.songs = songs;
        this.cantsong = cantsong;
    }

    public ArrayList<cancion> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<cancion> songs) {
        this.songs = songs;
    }

    public int getCantsong() {
        return cantsong;
    }

    public void setCantsong(int cantsong) {
        this.cantsong = cantsong;
    }

    @Override
    public String toString() {
        return "album{" + "songs=" + songs + ", cantsong=" + cantsong + '}';
    }
    
    
}
