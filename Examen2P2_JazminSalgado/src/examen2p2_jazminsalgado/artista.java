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
public class artista extends usuario{
    private String n_artist;
    ArrayList<cancion> s_songs;
    ArrayList<album> a;

    public artista() {
        super();
    }

    public artista(String n_artist, ArrayList<cancion> s_songs, ArrayList<album> a, String username, String password, int edad) {
        super(username, password, edad);
        this.n_artist = n_artist;
        this.s_songs = s_songs;
        this.a = a;
    }

    public String getN_artist() {
        return n_artist;
    }

    public void setN_artist(String n_artist) {
        this.n_artist = n_artist;
    }

    public ArrayList<cancion> getS_songs() {
        return s_songs;
    }

    public void setS_songs(ArrayList<cancion> s_songs) {
        this.s_songs = s_songs;
    }

    public ArrayList<album> getA() {
        return a;
    }

    public void setA(ArrayList<album> a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "artista{" + "n_artist=" + n_artist + ", s_songs=" + s_songs + ", a=" + a + '}';
    }
    
}
