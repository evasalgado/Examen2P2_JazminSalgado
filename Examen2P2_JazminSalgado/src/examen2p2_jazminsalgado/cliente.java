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
public class cliente extends usuario{
    ArrayList<cancion> f_Songs;
    ArrayList<Playlists> pl;
    ArrayList<Playlists> lk;

    public cliente() {
        super();
    }

    public cliente(ArrayList<cancion> f_Songs, ArrayList<Playlists> pl, ArrayList<Playlists> lk, String username, String password, int edad) {
        super(username, password, edad);
        this.f_Songs = f_Songs;
        this.pl = pl;
        this.lk = lk;
    }
    
    

    public ArrayList<cancion> getF_Songs() {
        return f_Songs;
    }

    public void setF_Songs(ArrayList<cancion> f_Songs) {
        this.f_Songs = f_Songs;
    }

    public ArrayList<Playlists> getPl() {
        return pl;
    }

    public void setPl(ArrayList<Playlists> pl) {
        this.pl = pl;
    }

    public ArrayList<Playlists> getLk() {
        return lk;
    }

    public void setLk(ArrayList<Playlists> lk) {
        this.lk = lk;
    }

    @Override
    public String toString() {
        return "cliente{" + "f_Songs=" + f_Songs + ", pl=" + pl + ", lk=" + lk + '}';
    }
    
    
}
