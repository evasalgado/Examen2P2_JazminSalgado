/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_jazminsalgado;

import javax.swing.JOptionPane;

/**
 *
 * @author evaja
 */
public class usuario {
    protected String username;
    protected String password;
    protected int edad;

    public usuario() {
    }

    public usuario(String username, String password, int edad) {
        this.username = username;
        this.password = password;
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void isEdad(int Edad){
        if (edad<=12) {
            JOptionPane.showMessageDialog(null, "Edad muy temprana para crear cuenta");
        } 
    }
    @Override
    public String toString() {
        return "username=" + username + ", password=" + password + ", edad=" + edad ;
    }
    
    
}
