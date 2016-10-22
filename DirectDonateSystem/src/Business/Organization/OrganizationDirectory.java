/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.GiveDirectly.DonorOrganization;
import Business.Organization.GiveDirectly.FieldTeamOrganization;
import Business.Organization.GiveDirectly.FinanceOrganization;
import Business.Organization.GiveDirectly.GiveDirectlyAdminOrganization;
import Business.Organization.GiveDirectly.IdentificationTeamOrganization;
import Business.Organization.GiveDirectly.RecepientOrganization;
import Business.Organization.GiveDirectly.SupervisorOrganization;
import Business.Organization.Government.GovernmentAdminOrganization;
import Business.Organization.Government.GovernmentEmployeeOrganization;
import Business.Organization.MobileMoneyTransfer.MobileMoneyTransferAdminOrganization;
import Business.Organization.MobileMoneyTransfer.MobileMoneyTransferEmployeeOrganization;
import Business.Organization.MobileMoneyTransfer.VendorOrganization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;
//import java.util.*;

/**
 *
 * @author Amey
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
        //createGovernmentOrganization();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
//    public Organization createGovernmentOrganization()
//    {
//        Organization organization = new GovernmentAdminOrganization();
//        organizationList.add(organization);
//        System.out.println(organization);
//        return organization;
//    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        
//        HashMap<String,List<Organization>> org = new HashMap<String,List<Organization>>(); 
//        
//        List<Organization> donor = new ArrayList<Organization>();
//        donor.add(new DonorOrganization());
//        donor.add(new SupervisorOrganization());
//        donor.add(new FieldTeamOrganization());
//        donor.add(new IdentificationTeamOrganization());
//        donor.add(new FinanceOrganization());
//        
//        List<Organization> govern = new ArrayList<Organization>();
//        govern.add(new GovernmentEmployeeOrganization());
//        
//        List<Organization> mobList = new ArrayList<Organization>();
//        govern.add(new VendorOrganization());
//                 
//                
//        org.put("GiveDirectly", donor);
//        org.put("Government", govern);
//        org.put("MobileMoneyTransfer", mobList);
        
        
        if (type.getValue().equals(Type.Donor.getValue())){
            organization = new DonorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FieldTeam.getValue())){
            organization = new FieldTeamOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Finance.getValue())){
            organization = new FinanceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.GiveDirectlyAdmin.getValue())){
            organization = new GiveDirectlyAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.IdentificationTeam.getValue())){
            organization = new IdentificationTeamOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Supervisor.getValue())){
            organization = new SupervisorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.GovernmentAdmin.getValue())){
            organization = new GovernmentAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.GovernmentEmployee.getValue())){
            organization = new GovernmentEmployeeOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.MobileMoneyTransferAdmin.getValue())){
            organization = new MobileMoneyTransferAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.MobileMoneyTransferEmployee.getValue())){
            organization = new MobileMoneyTransferEmployeeOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Vendor.getValue())){
            organization = new VendorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Recepient.getValue())){
            organization = new RecepientOrganization();
            organizationList.add(organization);
        }
        return organization;
   }
}