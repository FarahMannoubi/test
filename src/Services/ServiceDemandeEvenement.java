/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Interfaces.IServiceDemandeEvenement;
import Model.DemandeEvenement;
import Util.MaConnexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manou
 */
public class ServiceDemandeEvenement implements IServiceDemandeEvenement{
 MaConnexion instance = MaConnexion.getInstance();
    Connection cnx = instance.getCnx();

public List<DemandeEvenement> GetDemandeEvenement(){
ArrayList<DemandeEvenement> demandeEvenements = new ArrayList();
        
        try {
            Statement st = cnx.createStatement();
            String req = "SELECT * FROM `demande_evenement`";
            ResultSet rs = st.executeQuery(req);
            
            while (rs.next()) {                
     
                demandeEvenements.add(new DemandeEvenement(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10), rs.getInt(12),rs.getString(11),rs.getString(13)));
                
            }
            
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        
        return demandeEvenements ;
}

public List<DemandeEvenement> GetDemandeEvenementById(){ 
 ArrayList<DemandeEvenement> demandeEvenements = new ArrayList();
        
        try {
            Statement st = cnx.createStatement();
            String req = "SELECT * FROM `demande_evenement`";
            ResultSet rs = st.executeQuery(req);
            
            while (rs.next()) {                
     
                demandeEvenements.add(new DemandeEvenement(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10), rs.getInt(12),rs.getString(11),rs.getString(13)));
                
            }
            
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        
        return demandeEvenements ;
}
public List<DemandeEvenement> GetDemandeEvenementByIdUtilisateur(){ 
 ArrayList<DemandeEvenement> demandeEvenements = new ArrayList();
        
        try {
            Statement st = cnx.createStatement();
            String req = "SELECT * FROM `demande_evenement`";
            ResultSet rs = st.executeQuery(req);
            
            while (rs.next()) {                
     
                demandeEvenements.add(new DemandeEvenement(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10), rs.getInt(12),rs.getString(11),rs.getString(13)));
                
            }
            
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        
        return demandeEvenements ;
}
public List<DemandeEvenement> GetDemandeEvenementByDateDedutEvenement(){ 
 ArrayList<DemandeEvenement> demandeEvenements = new ArrayList();
        
        try {
            Statement st = cnx.createStatement();
            String req = "SELECT * FROM `demande_evenement`";
            ResultSet rs = st.executeQuery(req);
            
            while (rs.next()) {                
     
                demandeEvenements.add(new DemandeEvenement(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10), rs.getInt(12),rs.getString(11),rs.getString(13)));
                
            }
            
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        
        return demandeEvenements ;
}
public List<DemandeEvenement> GetDemandeEvenementByIdDestination(){ 
 ArrayList<DemandeEvenement> demandeEvenements = new ArrayList();
        
        try {
            Statement st = cnx.createStatement();
            String req = "SELECT * FROM `demande_evenement`";
            ResultSet rs = st.executeQuery(req);
            
            while (rs.next()) {                
     
                demandeEvenements.add(new DemandeEvenement(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10), rs.getInt(12),rs.getString(11),rs.getString(13)));
                
            }
            
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        
        return demandeEvenements ;
}





public void addDemandeEvenement(DemandeEvenement de){

  String req = "INSERT INTO `demande_evenement` (`id`, `destination_id`, `utilisateur_id`, `date_demande`, "
 + "`statut`, `description_demande`, `date_debut_event`, `date_fin_event`, `heure_debut_event`, `heure_fin_event`,"
 + " `description_event`, `capacite`, `libelle_evenement`, `image`)"
 + " VALUES (NULL, '"+de.getDestination()+"','"+de.getUtilisateur()+"','"+de.getDate_demande()+"', '"+de.getStatut()+"','"+de.getDescription_demande()+"',"
 + " '"+de.getDate_debutEvent()+"','"+de.getDate_finEvent()+"', '"+de.getHeure_debutEvent()+"', '"+de.getHeure_finEvent()+"',"
 + " '"+de.getDescription_event()+"','"+de.getCapacite()+"','"+de.getLibelleEvenement()+"','"+de.getImage()+"' );";
       
  try {
Statement st = cnx.createStatement();
           
            st.executeUpdate(req);
            System.out.println("Demande Evenemet ajoutée avec succes.");
            
        } catch (SQLException ex) {
            
            ex.printStackTrace();
        }
}



public void updateDemandeEvenement(DemandeEvenement de){


           String  req="UPDATE `demande_evenement` SET `destination_id` = '"+de.getDestination()+"', `utilisateur_id` = '"+de.getUtilisateur()+"',"
 + " `date_demande` = '"+de.getDate_demande()+"', `statut` = '"+de.getStatut()+"', `description_demande` = '"+de.getDescription_demande()+"',"
 + " `date_debut_event` = '"+de.getDate_debutEvent()+"', `date_fin_event` = '"+de.getDate_finEvent()+"', `heure_debut_event` = '"+de.getHeure_debutEvent()+"',"
 + " `heure_fin_event` ='"+de.getHeure_finEvent()+"', `description_event` = '"+de.getDescription_event()+"', `capacite` = '"+de.getCapacite()+"', `libelle_evenement` = '"+de.getLibelleEvenement()+"', "
 + "`image` = '"+de.getImage()+"' WHERE `demande_evenement`.`id` ='"+de.getId()+"';";
                  
           try {
             Statement st = cnx.createStatement();
         
                 
                  st.executeUpdate(req);
            System.out.println("Demande Evenemet modifier avec succes.");
            
        } catch (SQLException ex) {
            
            ex.printStackTrace();
        }
}


public void deleteDemandeEvenement(int id){

      try {

          String req ="DELETE FROM `demande_evenement` WHERE `demande_evenement`.`id` ="+id;
         Statement st = cnx.createStatement();
         st.executeUpdate(req);
          System.out.println(" Demande Evenement bien supprimer");
      }
      catch(SQLException e){
        System.out.println(e.getMessage());}
   }










}





    

