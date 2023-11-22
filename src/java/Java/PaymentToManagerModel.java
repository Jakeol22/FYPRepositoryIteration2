/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.security.Timestamp;

import java.time.LocalDate;

/**
 *
 * @author My PC
 */
public class PaymentToManagerModel {
    
    
    
    
    private long PlayerID;
    private long ManagerID;
    private String PaymentToManagerStatus;
    private long PaymentToManagerAmount;
    private LocalDate DateOfPaymentToManager;

    /**
     * @return the PaymentToManagerID
     */
    
        public PaymentToManagerModel(long PlayerID, long ManagerID, String PaymentToManagerStatus, long PaymentToManagerAmount, LocalDate DateOfPaymentToManager) {
        
        this.PlayerID = PlayerID;
        this.ManagerID = ManagerID;
        this.PaymentToManagerStatus = PaymentToManagerStatus;
        this.PaymentToManagerAmount = PaymentToManagerAmount;
        this.DateOfPaymentToManager = DateOfPaymentToManager;
    }


    /**
     * @param PaymentToManagerID the PaymentToManagerID to set
     */


    /**
     * @return the PlayerID
     */
    public long getPlayerID() {
        return PlayerID;
    }

    /**
     * @param PlayerID the PlayerID to set
     */
    public void setPlayerID(long PlayerID) {
        this.PlayerID = PlayerID;
    }

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
     * @return the PaymentToManagerStatus
     */
    public String getPaymentToManagerStatus() {
        return PaymentToManagerStatus;
    }

    /**
     * @param PaymentToManagerStatus the PaymentToManagerStatus to set
     */
    public void setPaymentToManagerStatus(String PaymentToManagerStatus) {
        this.PaymentToManagerStatus = PaymentToManagerStatus;
    }

    /**
     * @return the PaymentToManagerAmount
     */
    public long getPaymentToManagerAmount() {
        return PaymentToManagerAmount;
    }

    /**
     * @param PaymentToManagerAmount the PaymentToManagerAmount to set
     */
    public void setPaymentToManagerAmount(long PaymentToManagerAmount) {
        this.PaymentToManagerAmount = PaymentToManagerAmount;
    }

    /**
     * @return the DateOfPaymentToManager
     */
    public LocalDate getDateOfPaymentToManager() {
        return DateOfPaymentToManager;
    }

    /**
     * @param DateOfPaymentToManager the DateOfPaymentToManager to set
     */
    public void setDateOfPaymentToManager(LocalDate DateOfPaymentToManager) {
        this.DateOfPaymentToManager = DateOfPaymentToManager;
    }


    
    
}
