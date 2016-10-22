/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Government;

import java.util.ArrayList;

/**
 *
 * @author Amey
 */
public class CensusDataDirectory {
    private ArrayList<CensusData> censusDataList;
    
    public CensusDataDirectory(){
        censusDataList = new ArrayList<>();
    }

    public ArrayList<CensusData> getCensusDataList() {
        return censusDataList;
    }

    public void setCensusDataList(ArrayList<CensusData> censusDataList) {
        this.censusDataList = censusDataList;
    }
    
    public CensusData addCensusData(){
        CensusData censusData = new CensusData();
//        censusData.setFirstName("Ram");
//        censusData.setLastName("Chand");
//        censusData.setCountry("Kenya");
//        censusData.setRegion("North");
//        censusData.setNationalID("Kenya01");
//        censusData.setAddress("Dahisar");
//        censusData.setIncomeAnually(300);
        this.censusDataList.add(censusData);
        return censusData;
    }
    
    public void removeCensusData(CensusData censusData){
        this.censusDataList.remove(censusData);
    }
    
    public ArrayList<CensusData> addData(){
        CensusData censusData1 = new CensusData();
        censusData1.setFirstName("Ram");
        censusData1.setLastName("Chand");
        censusData1.setCountry("Kenya");
        censusData1.setRegion("North");
        censusData1.setNationalID("Kenya01");
        censusData1.setAddress("Dahisar");
        censusData1.setIncomeAnually(200);
        censusDataList.add(censusData1);
        
        CensusData censusData2 = new CensusData();
        censusData2.setFirstName("Praveen");
        censusData2.setLastName("Kumar");
        censusData2.setCountry("Kenya");
        censusData2.setRegion("South");
        censusData2.setNationalID("Kenya02");
        censusData2.setAddress("Borivali");
        censusData2.setIncomeAnually(200);
        censusDataList.add(censusData2);
        
        CensusData censusData3 = new CensusData();
        censusData3.setFirstName("Suhas");
        censusData3.setLastName("Agrawal");
        censusData3.setCountry("Kenya");
        censusData3.setRegion("West");
        censusData3.setNationalID("Kenya03");
        censusData3.setAddress("Kandivali");
        censusData3.setIncomeAnually(100);
        censusDataList.add(censusData3);
        
        CensusData censusData4 = new CensusData();
        censusData4.setFirstName("Hechen");
        censusData4.setLastName("Gao");
        censusData4.setCountry("Kenya");
        censusData4.setRegion("East");
        censusData4.setNationalID("Kenya04");
        censusData4.setAddress("Malad");
        censusData4.setIncomeAnually(200);
        censusDataList.add(censusData4);
        
        CensusData censusData5 = new CensusData();
        censusData5.setFirstName("Rhea");
        censusData5.setLastName("Kagti");
        censusData5.setCountry("Kenya");
        censusData5.setRegion("North");
        censusData5.setNationalID("Kenya05");
        censusData5.setAddress("Goregoan");
        censusData5.setIncomeAnually(300);
        censusDataList.add(censusData5);
        
        CensusData censusData6 = new CensusData();
        censusData6.setFirstName("Vinod");
        censusData6.setLastName("Sani");
        censusData6.setCountry("Kenya");
        censusData6.setRegion("South");
        censusData6.setNationalID("Kenya06");
        censusData6.setAddress("Andheri");
        censusData6.setIncomeAnually(300);
        censusDataList.add(censusData6);
        
        CensusData censusData7 = new CensusData();
        censusData7.setFirstName("Praneet");
        censusData7.setLastName("Solanki");
        censusData7.setCountry("Kenya");
        censusData7.setRegion("West");
        censusData7.setNationalID("Kenya07");
        censusData7.setAddress("Dadar");
        censusData7.setIncomeAnually(300);
        censusDataList.add(censusData7);
        
        CensusData censusData8 = new CensusData();
        censusData8.setFirstName("Vijay");
        censusData8.setLastName("Dinanath");
        censusData8.setCountry("Kenya");
        censusData8.setRegion("East");
        censusData8.setNationalID("Kenya08");
        censusData8.setAddress("Mahim");
        censusData8.setIncomeAnually(300);
        censusDataList.add(censusData8);
        
        return censusDataList;
    }
}
