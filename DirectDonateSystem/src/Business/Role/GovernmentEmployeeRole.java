/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Government.CensusDataDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Government.EmployeeRole.GovernmentEmployeeJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Amey
 */
public class GovernmentEmployeeRole extends Role{
    private CensusDataDirectory censusDataDirectory;
    
    public GovernmentEmployeeRole(){
        censusDataDirectory = new CensusDataDirectory();
    }

    public CensusDataDirectory getCensusDataDirectory() {
        return censusDataDirectory;
    }

    public void setCensusDataDirectory(CensusDataDirectory censusDataDirectory) {
        this.censusDataDirectory = censusDataDirectory;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        return new GovernmentEmployeeJPanel(userProcessContainer,enterprise,organization,account,censusDataDirectory);
    }
}
