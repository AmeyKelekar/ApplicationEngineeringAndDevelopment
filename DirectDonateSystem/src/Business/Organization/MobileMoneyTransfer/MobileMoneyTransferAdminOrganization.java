/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.MobileMoneyTransfer;

import Business.Organization.Organization;
import Business.Role.MobileMoneyTransferAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Amey
 */
public class MobileMoneyTransferAdminOrganization extends Organization {
    public MobileMoneyTransferAdminOrganization() {
        super(Organization.Type.MobileMoneyTransferAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MobileMoneyTransferAdminRole());
        return roles;
    }
}
