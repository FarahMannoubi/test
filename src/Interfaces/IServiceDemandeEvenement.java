/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Model.DemandeEvenement;
import java.util.List;

/**
 *
 * @author manou
 */
public interface IServiceDemandeEvenement {
public List<DemandeEvenement> GetDemandeEvenement();
public List<DemandeEvenement> GetDemandeEvenementById();
public List<DemandeEvenement> GetDemandeEvenementByIdUtilisateur();
public List<DemandeEvenement> GetDemandeEvenementByDateDedutEvenement();
public List<DemandeEvenement> GetDemandeEvenementByIdDestination();

public void addDemandeEvenement(DemandeEvenement de);
public void updateDemandeEvenement(DemandeEvenement de);
public void deleteDemandeEvenement(int id);

    
}
