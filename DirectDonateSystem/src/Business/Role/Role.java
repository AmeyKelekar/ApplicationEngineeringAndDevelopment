/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Amey
 */
public abstract class Role {
     
     public enum RoleType{
        GiveDirectlyAdmin("GiveDirectly Admin"),
        Donor("Donor"),
        FieldTeam("Field Team"),
        FinanceTeam("Finance Team"),
        Supervisor("Supervisor"),
        IdentificationTeam("Identification Team"),
        GovernmentAdmin("Government Admin"),
        GovernmentEmployee("Government Employee"),
        MobileMoneyTransferAdmin("Mobile Money Transfer Admin"),
        Vendor("Vendor"),
        Recepient("Recepient");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem ecoSystem);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
