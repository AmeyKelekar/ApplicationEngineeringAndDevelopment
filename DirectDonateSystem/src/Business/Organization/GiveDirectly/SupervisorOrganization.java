/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.GiveDirectly;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SupervisorRole;
import java.util.ArrayList;

/**
 *
 * @author Amey
 */
public class SupervisorOrganization extends Organization {
    public SupervisorOrganization() {
        super(Organization.Type.Supervisor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupervisorRole());
        return roles;
    }
}
