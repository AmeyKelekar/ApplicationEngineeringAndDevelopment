/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.Person;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Amey
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        EcoSystem system = EcoSystem.getInstance();
        
        //Create Network
        //create an enterprise
        //Initialize some Organization
        //have some employee
        //create useraccount of them
        
        Person person = system.getPersonDirectory().createPerson("Amey");
        UserAccount userAccount = system.getUserAccountDirectory().createUserAccount(
                "sysadmin", "sysadmin", person, new SystemAdminRole());
        return system;
    }
}
