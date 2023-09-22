/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_jazminsalgado;

import java.util.Date;

/**
 *
 * @author evaja
 */
public class lanzamiento {
    protected String titulo;
    protected Date rdate; 
    protected int likes;

    public lanzamiento() {
    }

    public lanzamiento(String titulo, Date rdate, int likes) {
        this.titulo = titulo;
        this.rdate = rdate;
        this.likes = likes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "lanzamiento{" + "titulo=" + titulo + ", rdate=" + rdate + ", likes=" + likes + '}';
    }
    
}
