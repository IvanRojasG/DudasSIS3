/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.uned.introSIS.dao;

import cr.ac.uned.introSIS.dominio.Mascota;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ivan
 */
public class MascotaDB {
    
    private Connection conexion;
    
    public MascotaDB(){
        try {
            ConexionDB conectar=new ConexionDB();
            conexion=conectar.conectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en Conexion", JOptionPane.ERROR_MESSAGE);
            System.getLogger(MascotaDB.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    public void insertarMascota(Mascota nuevaMascota) throws SQLException{
        
        String sentencia="INSERT INTO ADMINSIS.MASCOTAS (NOMBRE, ESPECIE, COLOR, SEXO, EDAD)  VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pst=conexion.prepareStatement(sentencia);
        pst.setString(1, nuevaMascota.getNombre());
        pst.setString(2, nuevaMascota.getEspecie());
        pst.setString(3, nuevaMascota.getColor());
        pst.setString(4, nuevaMascota.getSexo());
        pst.setInt(5, nuevaMascota.getEdad());
        pst.execute();
    }
    
    public ArrayList<Mascota> obtenerMascotas() throws SQLException{
        ArrayList<Mascota> mascotas=new ArrayList<Mascota>();
        
        String sentencia="SELECT * FROM ADMINSIS.MASCOTAS";
        PreparedStatement pst=conexion.prepareStatement(sentencia);
        ResultSet rs=pst.executeQuery();
        
        while(rs.next()){
            Mascota mascotaObtenida=new Mascota();
            mascotaObtenida.setId(rs.getInt("ID"));
            mascotaObtenida.setNombre(rs.getString("NOMBRE"));
            mascotaObtenida.setEspecie(rs.getString("ESPECIE"));
            mascotaObtenida.setColor(rs.getString("COLOR"));
            mascotaObtenida.setSexo(rs.getString("SEXO"));
            mascotaObtenida.setEdad(rs.getInt("EDAD"));
            mascotas.add(mascotaObtenida);
        }
        
        return mascotas;
    }
    
}
