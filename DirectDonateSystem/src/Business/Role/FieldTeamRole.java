/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.GiveDirectly.FieldTeamOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.GiveDirectly.FieldTeamRole.FieldTeamJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Amey
 */
public class FieldTeamRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        return new FieldTeamJPanel(userProcessContainer, enterprise,
            organization, account);
    }
    
}
