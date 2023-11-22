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
public class RefereeModel {
    private long RefereeID;
    private String RefereeFname;
    private String RefereeLname;
    private String RefereeEmail;
    private String RefereePassword;
    private LocalDate RefereeDOB;
    private long RefereePhoneNumber;
    private String RefereeAddress;
    private long RefereeCardNumber;

    /**
     * @return the RefereeID
     */
    public long getRefereeID() {
        return RefereeID;
    }

    /**
     * @param RefereeID the RefereeID to set
     */
    public void setRefereeID(long RefereeID) {
        this.RefereeID = RefereeID;
    }

    /**
     * @return the RefereeFname
     */
    public String getRefereeFname() {
        return RefereeFname;
    }

    /**
     * @param RefereeFname the RefereeFname to set
     */
    public void setRefereeFname(String RefereeFname) {
        this.RefereeFname = RefereeFname;
    }

    /**
     * @return the RefereeLname
     */
    public String getRefereeLname() {
        return RefereeLname;
    }

    /**
     * @param RefereeLname the RefereeLname to set
     */
    public void setRefereeLname(String RefereeLname) {
        this.RefereeLname = RefereeLname;
    }

    /**
     * @return the RefereeEmail
     */
    public String getRefereeEmail() {
        return RefereeEmail;
    }

    /**
     * @param RefereeEmail the RefereeEmail to set
     */
    public void setRefereeEmail(String RefereeEmail) {
        this.RefereeEmail = RefereeEmail;
    }

    /**
     * @return the RefereePassword
     */
    public String getRefereePassword() {
        return RefereePassword;
    }

    /**
     * @param RefereePassword the RefereePassword to set
     */
    public void setRefereePassword(String RefereePassword) {
        this.RefereePassword = RefereePassword;
    }

    /**
     * @return the RefereeDOB
     */
    public LocalDate getRefereeDOB() {
        return RefereeDOB;
    }

    /**
     * @param RefereeDOB the RefereeDOB to set
     */
    public void setRefereeDOB(LocalDate RefereeDOB) {
        this.RefereeDOB = RefereeDOB;
    }

    /**
     * @return the RefereePhoneNumber
     */
    public long getRefereePhoneNumber() {
        return RefereePhoneNumber;
    }

    /**
     * @param RefereePhoneNumber the RefereePhoneNumber to set
     */
    public void setRefereePhoneNumber(long RefereePhoneNumber) {
        this.RefereePhoneNumber = RefereePhoneNumber;
    }

    /**
     * @return the RefereeAddress
     */
    public String getRefereeAddress() {
        return RefereeAddress;
    }

    /**
     * @param RefereeAddress the RefereeAddress to set
     */
    public void setRefereeAddress(String RefereeAddress) {
        this.RefereeAddress = RefereeAddress;
    }

    /**
     * @return the RefereeCardNumber
     */
    public long getRefereeCardNumber() {
        return RefereeCardNumber;
    }

    /**
     * @param RefereeCardNumber the RefereeCardNumber to set
     */
    public void setRefereeCardNumber(long RefereeCardNumber) {
        this.RefereeCardNumber = RefereeCardNumber;
    }

    public RefereeModel(long RefereeID, String RefereeFname, String RefereeLname, String RefereeEmail, String RefereePassword, LocalDate RefereeDOB, long RefereePhoneNumber, String RefereeAddress, long RefereeCardNumber) {
        this.RefereeID = RefereeID;
        this.RefereeFname = RefereeFname;
        this.RefereeLname = RefereeLname;
        this.RefereeEmail = RefereeEmail;
        this.RefereePassword = RefereePassword;
        this.RefereeDOB = RefereeDOB;
        this.RefereePhoneNumber = RefereePhoneNumber;
        this.RefereeAddress = RefereeAddress;
        this.RefereeCardNumber = RefereeCardNumber;
    }
    
    
}
