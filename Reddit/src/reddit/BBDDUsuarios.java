/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class BBDDUsuarios implements Serializable{
    
    private List <Usuarios> ListaUsuarios = new LinkedList<>();

    public BBDDUsuarios(List<Usuarios> Usuarios) {
        this.ListaUsuarios=Usuarios;
    }
   
    public void CargarBBDD(File f) throws IOException{
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        
    }
    
    public void EscribirBBDD(File f)throws IOException{
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
       
    }
    
}
