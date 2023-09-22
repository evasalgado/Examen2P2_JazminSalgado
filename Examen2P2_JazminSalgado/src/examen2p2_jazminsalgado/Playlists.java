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
public class Playlists {
    private String name;
    private int likes;
    ArrayList<cancion> s_list;

    public Playlists() {
    }

    public Playlists(String name, int likes, ArrayList<cancion> s_list) {
        this.name = name;
        this.likes = likes;
        this.s_list = s_list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<cancion> getS_list() {
        return s_list;
    }

    public void setS_list(ArrayList<cancion> s_list) {
        this.s_list = s_list;
    }

    @Override
    public String toString() {
        return "Playlists{" + "name=" + name + ", likes=" + likes + ", s_list=" + s_list + '}';
    }
    
    
}
