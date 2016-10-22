/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Amey
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    
    public static EcoSystem getInstance(){
        if (business == null){
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList= new ArrayList<>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SystemAdminRole());
        return roles;
    }
    
    public Network createAndAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    } 

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    } 
    
//    public boolean isUserNamePresent(String name)
//    {
//        System.out.println("System is: "+business);
//        if(business.getUserAccountDirectory().userNameIsPresent(name)){
//            return true;
//        }
//        for(Network network: business.getNetworkList()){
//            System.out.println("Network: "+network);
//            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList())
//            {
//                if(enterprise.getUserAccountDirectory().userNameIsPresent(name) ){
//                    return true; 
//                }  
//                for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
//                    if(organization.getUserAccountDirectory().userNameIsPresent(name)){
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
}