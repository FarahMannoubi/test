/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetpiv1;

import Model.CoutEvenement;
import Model.DemandeEvenement;
import Services.ServiceCoutEvenement;
import Services.ServiceDemandeEvenement;
import static java.lang.String.format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author manou
 */
public class ProjetPiV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
ServiceDemandeEvenement sde=new ServiceDemandeEvenement();
        System.out.println("la liste"+sde.GetDemandeEvenement());

     DemandeEvenement de =  new DemandeEvenement(77,2, 1,"1998-12-22","statu", "ds","1230-10-22","1230-10-22", "00:00:00","00:00:00","gvhgvjg",121, "libelleEvenement","image");

//sde.addDemandeEvenement(de);
//sde.updateDemandeEvenement(de);
//sde.deleteDemandeEvenement(41);
ServiceCoutEvenement sce=new ServiceCoutEvenement();
System.out.println(sce.GetCoutEvenement());
       // CoutEvenement ce=new CoutEvenement(1, 44, 100, 222);
CoutEvenement ce=new CoutEvenement(31,1, 44, 100, 222);
//sce.addCoutEvenement(ce);
//sce.updateCoutEvenement(ce);
//sce.deleteCoutEvenement(25);

    }
    
}
