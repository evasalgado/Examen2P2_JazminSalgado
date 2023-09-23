/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_jazminsalgado;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author evaja
 */
public class AdminLanz {
    private ArrayList<lanzamiento> l = new ArrayList<>();
    private File save = null;

    public AdminLanz(String ruta) {
        save =  new File(ruta);
    }

    public ArrayList<lanzamiento> getL() {
        return l;
    }

    public void setL(ArrayList<lanzamiento> l) {
        this.l = l;
    }

    public File getSave() {
        return save;
    }

    public void setSave(File save) {
        this.save = save;
    }
    
    public void setLanzamiento(lanzamiento lanz){
        l.add(lanz);
    }
    public void cargar(){
        try {
            l = new ArrayList();
            lanzamiento guardar; 
            if (save.exists()) {
                FileInputStream e = new FileInputStream(save);
                ObjectInputStream o = new ObjectInputStream(e);
                try {
                    while ((guardar = (lanzamiento)o.readObject())!=null) {                        
                        l.add(guardar);
                    }
 
                } catch (EOFException ex) {
                    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void escribir(){
       FileOutputStream fos = null;
       ObjectOutputStream oos = null;
       try {
           fos = new FileOutputStream(save);
           oos = new ObjectOutputStream(fos);
           for (lanzamiento re : l) {
               oos.writeObject(re);
           }
       } catch (Exception e) {
       } finally {
           try {
               oos.close();
               fos.close();
           } catch (Exception e) {
           }
           
       } 
    }
}
