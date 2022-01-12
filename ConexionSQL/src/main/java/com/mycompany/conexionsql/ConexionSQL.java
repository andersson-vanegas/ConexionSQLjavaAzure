/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexionsql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class ConexionSQL {
    
    
    
    public static Connection getConexion(){
        // Variables
        Connection conectar = null;
        String usuario = "DBAnderssonSQL@dbservidorpruebas";
        String contrasenia = "Andersson@12";
        String database = "DBProgramacion2";
        String host = "dbservidorpruebas.database.windows.net";
        String puerto = "1433";
        String cadena = "jdbc:sqlserver://"+ host +":"  + puerto+ ";database=" + database + ";user=" + usuario + ";password=" + contrasenia + ";encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";

        // Entorno Conexión
        try{
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectar a la base de datos:"+e.toString());
            return null;
        }
        return conectar;
    }
}
