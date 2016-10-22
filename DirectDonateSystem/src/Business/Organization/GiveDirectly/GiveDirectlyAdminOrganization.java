/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.GiveDirectly;

import Business.Organization.Organization;
import Business.Role.GiveDirectlyAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Amey
 */
public class GiveDirectlyAdminOrganization extends Organization{
    public GiveDirectlyAdminOrganization() {
        super(Organization.Type.GiveDirectlyAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GiveDirectlyAdminRole());
        return roles;
    }
}
