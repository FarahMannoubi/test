/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Model.CoutEvenement;
import java.util.List;

/**
 *
 * @author manou
 */
public interface IServiceCoutEvenement {
public List<CoutEvenement> GetCoutEvenement();
public void addCoutEvenement(CoutEvenement ce);
public void updateCoutEvenement(CoutEvenement ce);
public void deleteCoutEvenement(int id);
    
}
