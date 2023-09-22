/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_jazminsalgado;

/**
 *
 * @author evaja
 */
public class Single extends lanzamiento{
    private cancion c;

    public Single() {
    }

    public Single(cancion c) {
        this.c = c;
    }

    public cancion getC() {
        return c;
    }

    public void setC(cancion c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Single{" + "c=" + c + '}';
    }
    
    
}
