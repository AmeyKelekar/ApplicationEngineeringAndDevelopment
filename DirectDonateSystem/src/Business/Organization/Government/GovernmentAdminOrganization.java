/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Government;

import Business.Organization.Organization;
import Business.Role.GovernmentAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Amey
 */
public class GovernmentAdminOrganization extends Organization{
    public GovernmentAdminOrganization() {
        super(Organization.Type.GovernmentAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GovernmentAdminRole());
        return roles;
    }
}
