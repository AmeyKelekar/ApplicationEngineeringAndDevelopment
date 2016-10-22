/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author Amey
 */
public class Recepient extends Person {
    private static int count = 100;
    private static int count1 = 102030405;
    private String recipientId;
    private int lattitude;
    private int longitude;
    private String nationalId;
    private HouseType houseType;
    private float accountBalance;
    private String region;
    private String country;
    private float income;
    private boolean approved;
    private boolean recordUpdated;
    private boolean moneyTransferAccount = false;
    private String accountNumber;
    private String vendorId;
    private float amountRecevied;
    private float amountConsumed;
    
    
    public enum HouseType{
        Temporary("Temporary"),
        Permanent("Permanent");
                
        private String value;
        private HouseType(String value){
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
    
    public Recepient() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("RECIPIENT");
        stringBuffer.append(++count);
        recipientId = stringBuffer.toString();
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public int getLattitude() {
        return lattitude;
    }

    public void setLattitude(int lattitude) {
        this.lattitude = lattitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public boolean isRecordUpdated() {
        return recordUpdated;
    }

    public void setRecordUpdated(boolean recordUpdated) {
        this.recordUpdated = recordUpdated;
    }

    public boolean isMoneyTransferAccount() {
        return moneyTransferAccount;
    }

    public void setMoneyTransferAccount(boolean moneyTransferAccount) {
        this.moneyTransferAccount = moneyTransferAccount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public float getAmountRecevied() {
        return amountRecevied;
    }

    public void setAmountRecevied(float amountRecevied) {
        this.amountRecevied = amountRecevied;
    }

    public float getAmountConsumed() {
        return amountConsumed;
    }

    public void setAmountConsumed(float amountConsumed) {
        this.amountConsumed = amountConsumed;
    }
    
    

    @Override
    public String toString() {
        return getFirstName();
    }   
}