/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Organization.GiveDirectly.FieldTeamOrganization;
import Business.Organization.GiveDirectly.FinanceOrganization;
import Business.Organization.GiveDirectly.IdentificationTeamOrganization;
import Business.Organization.GiveDirectly.SupervisorOrganization;
import Business.Organization.MobileMoneyTransfer.VendorOrganization;
import Business.Organization.Organization;
import Business.Person.Recepient.HouseType;
import java.util.ArrayList;

/**
 *
 * @author Amey
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public Person createPerson(String name){
        Person person = new Person();
        person.setFirstName(name);
        personList.add(person);
        return person;
    }
    
    public Person createAndAddDonor(String firstName, String lastName, String gender,
            int age, String address, float phoneNumber, int pincode, String emailId){
         Donor donor = new Donor(); 
         donor.setFirstName(firstName);
         donor.setLastName(lastName);
         donor.setGender(gender);
         donor.setAge(age);
         donor.setAddress(address);
         donor.setPhoneNumber(phoneNumber);
         donor.setPincode(pincode);
         donor.setEmailId(emailId);
         personList.add(donor);
         return donor;
    }
    
    public Person createAndAddRecipient(String firstName, String lastNamne, String gender,
            int age, String address, int phoneNumber, int pincode,  
            float accountBalance, int lattitude, int longitude, HouseType houseType, String nationalId,String region,
            String country,float income){
        Recepient recepient = new Recepient(); 
        recepient.setFirstName(firstName);
        recepient.setLastName(lastNamne);
        recepient.setGender(gender);
        recepient.setAddress(address);
        recepient.setPhoneNumber(phoneNumber);
        recepient.setPincode(pincode);
        recepient.setHouseType(houseType);
        recepient.setAccountBalance(accountBalance);
        recepient.setLattitude(lattitude);
        recepient.setLongitude(longitude);
        recepient.setNationalId(nationalId);
        recepient.setRegion(region);
        recepient.setCountry(country);
        recepient.setIncome(income);
        personList.add(recepient);
        return recepient;
   }
    
    public Person createAndAddPerson(String firstName, String lastName, String email, 
            Organization organization, String address, int pincode, String gender, int phoneNumber, int age )
    {
        if (organization instanceof FieldTeamOrganization){  
            FieldTeamPerson fieldPerson = new FieldTeamPerson();
         
            fieldPerson.setFirstName(firstName);
            fieldPerson.setLastName(lastName);
            fieldPerson.setEmailId(email);
            fieldPerson.setAddress(address);
            fieldPerson.setAge(age);
            fieldPerson.setPhoneNumber(phoneNumber);
            fieldPerson.setPincode(pincode);
            fieldPerson.setGender(gender);
            personList.add(fieldPerson);
            return fieldPerson;
        }
        else if(organization instanceof SupervisorOrganization){
            Supervisor supervisor= new Supervisor();
            supervisor.setFirstName(firstName);
            supervisor.setLastName(lastName);
            supervisor.setEmailId(email);
            supervisor.setAddress(address);
            supervisor.setAge(age);
            supervisor.setPhoneNumber(phoneNumber);
            supervisor.setPincode(pincode);
            supervisor.setGender(gender);
            personList.add(supervisor);
            return supervisor;
        }
        else if(organization instanceof IdentificationTeamOrganization){
            IdentificationTeamPerson identificationTeamPerson= new IdentificationTeamPerson();
            identificationTeamPerson.setFirstName(firstName);
            identificationTeamPerson.setLastName(lastName);
            identificationTeamPerson.setEmailId(email);
            identificationTeamPerson.setAddress(address);
            identificationTeamPerson.setAge(age);
            identificationTeamPerson.setPhoneNumber(phoneNumber);
            identificationTeamPerson.setPincode(pincode);
            identificationTeamPerson.setGender(gender);
            personList.add(identificationTeamPerson);
            return identificationTeamPerson;
        }   
        else if(organization instanceof FinanceOrganization){
            FinancePerson financePerson= new FinancePerson();
            financePerson.setFirstName(firstName);
            financePerson.setLastName(lastName);
            financePerson.setEmailId(email);
            financePerson.setAddress(address);
            financePerson.setAge(age);
            financePerson.setPhoneNumber(pincode);
            financePerson.setPincode(pincode);
            financePerson.setGender(gender);
            personList.add(financePerson);
            return financePerson;
        }  
        else if(organization instanceof VendorOrganization){
            Vendor vendor= new Vendor();
            vendor.setFirstName(firstName);
            vendor.setLastName(lastName);
            vendor.setEmailId(email);
            vendor.setAddress(address);
            vendor.setAge(age);
            vendor.setPhoneNumber(pincode);
            vendor.setPincode(pincode);
            vendor.setGender(gender);
            personList.add(vendor);
            return vendor;
        }  
        return null; 
    }
}
