/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Interfaces.IServiceCoutEvenement;
import Model.CoutEvenement;
import Util.MaConnexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manou
 */
public class ServiceCoutEvenement implements IServiceCoutEvenement{
 MaConnexion instance = MaConnexion.getInstance();
    Connection cnx = instance.getCnx();

public List<CoutEvenement> GetCoutEvenement(){
ArrayList<CoutEvenement> coutEvenements = new ArrayList();
        
        try {
            Statement st = cnx.createStatement();
            String req = "SELECT * FROM `cout_evenement`";
            ResultSet rs = st.executeQuery(req);
            
            while (rs.next()) {                
     
                coutEvenements.add(new CoutEvenement(rs.getInt(1), rs.getInt(2), rs.getInt(3),rs.getInt(4), rs.getDouble(5)));
                
            }
            
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        
        return coutEvenements ;
}
public void addCoutEvenement(CoutEvenement ce){
String req = "INSERT INTO `cout_evenement` (`coutcategorie_id`, `demande_event_id`, `nb_billet`, `prix`) VALUES ('"+ce.getCoutCtegorie()+"', '"+ce.getDemendeEvenement()+"','"+ce.getNbBillet()+"','"+ce.getPrix()+"' );";

  try {
Statement st = cnx.createStatement();
           
            st.executeUpdate(req);
            System.out.println("Cout Evenemet ajoutée avec succes.");
            
        } catch (SQLException ex) {
            
            ex.printStackTrace();
        }
}
public void updateCoutEvenement(CoutEvenement ce){
String req="UPDATE `cout_evenement` SET `coutcategorie_id` = '"+ce.getCoutCtegorie()+"', `demande_event_id` = '"+ce.getDemendeEvenement()+"', `nb_billet` ='"+ce.getNbBillet()+"', `prix` = '"+ce.getPrix()+"' WHERE `cout_evenement`.`id` = '"+ce.getId()+"'; ";
try {
             Statement st = cnx.createStatement();
         
                 
                  st.executeUpdate(req);
            System.out.println("Cout Evenemet modifier avec succes.");
            
        } catch (SQLException ex) {
            
            ex.printStackTrace();
        }
//
}
public void deleteCoutEvenement(int id){

try {

          String req ="DELETE FROM `cout_evenement` WHERE `cout_evenement`.`id` ="+id;
         Statement st = cnx.createStatement();
         st.executeUpdate(req);
          System.out.println(" cout Evenement bien supprimer");
      }
      catch(SQLException e){
        System.out.println(e.getMessage());}



}
    
}
