/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.time.LocalDate;

/**
 *
 * @author My PC
 */
public class ManagerModel {
    private long ManagerID;
    private String ManagerFname;
    private String ManagerLname;
     private String ManagerEmail;
      private String ManagerPassword;
       private String ManagerClub;
        private String ManagerTeam;
        private LocalDate ManagerDob;
        private long ManagerPhoneNumber;
        private String ManagerAddress;
        private long ManagerCardNumber;

    /**
     * @return the ManagerID
     */
    public long getManagerID() {
        return ManagerID;
    }

    /**
     * @param ManagerID the ManagerID to set
     */
    public void setManagerID(long ManagerID) {
        this.ManagerID = ManagerID;
    }

    /**
     * @return the ManagerFname
     */
    public String getManagerFname() {
        return ManagerFname;
    }

    /**
     * @param ManagerFname the ManagerFname to set
     */
    public void setManagerFname(String ManagerFname) {
        this.ManagerFname = ManagerFname;
    }

    /**
     * @return the ManagerLname
     */
    public String getManagerLname() {
        return ManagerLname;
    }

    /**
     * @param ManagerLname the ManagerLname to set
     */
    public void setManagerLname(String ManagerLname) {
        this.ManagerLname = ManagerLname;
    }

    /**
     * @return the ManagerEmail
     */
    public String getManagerEmail() {
        return ManagerEmail;
    }

    /**
     * @param ManagerEmail the ManagerEmail to set
     */
    public void setManagerEmail(String ManagerEmail) {
        this.ManagerEmail = ManagerEmail;
    }

    /**
     * @return the ManagerPassword
     */
    public String getManagerPassword() {
        return ManagerPassword;
    }

    /**
     * @param ManagerPassword the ManagerPassword to set
     */
    public void setManagerPassword(String ManagerPassword) {
        this.ManagerPassword = ManagerPassword;
    }

    /**
     * @return the ManagerClub
     */
    public String getManagerClub() {
        return ManagerClub;
    }

    /**
     * @param ManagerClub the ManagerClub to set
     */
    public void setManagerClub(String ManagerClub) {
        this.ManagerClub = ManagerClub;
    }

    /**
     * @return the ManagerTeam
     */
    public String getManagerTeam() {
        return ManagerTeam;
    }

    /**
     * @param ManagerTeam the ManagerTeam to set
     */
    public void setManagerTeam(String ManagerTeam) {
        this.ManagerTeam = ManagerTeam;
    }

    /**
     * @return the ManagerDob
     */
    public LocalDate getManagerDob() {
        return ManagerDob;
    }

    /**
     * @param ManagerDob the ManagerDob to set
     */
    public void setManagerDob(LocalDate ManagerDob) {
        this.ManagerDob = ManagerDob;
    }

    /**
     * @return the ManagerPhoneNumber
     */
    public long getManagerPhoneNumber() {
        return ManagerPhoneNumber;
    }

    /**
     * @param ManagerPhoneNumber the ManagerPhoneNumber to set
     */
    public void setManagerPhoneNumber(long ManagerPhoneNumber) {
        this.ManagerPhoneNumber = ManagerPhoneNumber;
    }

    /**
     * @return the ManagerAddress
     */
    public String getManagerAddress() {
        return ManagerAddress;
    }

    /**
     * @param ManagerAddress the ManagerAddress to set
     */
    public void setManagerAddress(String ManagerAddress) {
        this.ManagerAddress = ManagerAddress;
    }

    /**
     * @return the ManagerCardNumber
     */
    public long getManagerCardNumber() {
        return ManagerCardNumber;
    }

    /**
     * @param ManagerCardNumber the ManagerCardNumber to set
     */
    public void setManagerCardNumber(long ManagerCardNumber) {
        this.ManagerCardNumber = ManagerCardNumber;
    }

    public ManagerModel(long ManagerID, String ManagerFname, String ManagerLname, String ManagerEmail, String ManagerPassword, String ManagerClub, String ManagerTeam, LocalDate ManagerDob, long ManagerPhoneNumber, String ManagerAddress, long ManagerCardNumber) {
        this.ManagerID = ManagerID;
        this.ManagerFname = ManagerFname;
        this.ManagerLname = ManagerLname;
        this.ManagerEmail = ManagerEmail;
        this.ManagerPassword = ManagerPassword;
        this.ManagerClub = ManagerClub;
        this.ManagerTeam = ManagerTeam;
        this.ManagerDob = ManagerDob;
        this.ManagerPhoneNumber = ManagerPhoneNumber;
        this.ManagerAddress = ManagerAddress;
        this.ManagerCardNumber = ManagerCardNumber;
    }
        
        

}
