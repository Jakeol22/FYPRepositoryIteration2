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

//This code has been adapted from Bill Emersons "Sample Product Viewer" sample project, (2023).
public class PaymentToManagerModel {
    
    
     //Local Date taken from website: Baeldung
    private long PaymentToManagerID;
    private long PlayerID;
    private long ManagerID;
    private String PaymentToManagerStatus;
    private long PaymentToManagerAmount;
    private LocalDate DateOfPaymentToManager;

    /**
     * @return the PaymentToManagerID
     */
    
        public PaymentToManagerModel(long PaymentToManagerID, long PlayerID, long ManagerID, String PaymentToManagerStatus, long PaymentToManagerAmount, LocalDate DateOfPaymentToManager) {
        
        this.PaymentToManagerID= PaymentToManagerID;
        this.PlayerID = PlayerID;
        this.ManagerID = ManagerID;
        this.PaymentToManagerStatus = PaymentToManagerStatus;
        this.PaymentToManagerAmount = PaymentToManagerAmount;
        this.DateOfPaymentToManager = DateOfPaymentToManager;
    }


    public long getPaymentToManagerID() {
        return PaymentToManagerID;
    }
    public void setPaymentToManagerID(){
        this.PaymentToManagerID=PaymentToManagerID;
    }

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


//Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project. Available on canvas.

//Palaniappan, V. (2023) Creating a LocalDate with values in Java, Baeldung. Available at: https://www.baeldung.com/java-creating-localdate-with-values (Accessed: 20 November 2023). 