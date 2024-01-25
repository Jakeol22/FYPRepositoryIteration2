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

//Local Date taken from website: Baeldung
public class PaymentToRefereeModel {
    private long ManagerID;
    private long RefereeID;
    private String PaymentToRefereeStatus;
    private long PaymentToRefereeAmount;
    private LocalDate DateOfPaymentToReferee;

    public PaymentToRefereeModel(long ManagerID, long RefereeID, String PaymentToRefereeStatus, long PaymentToRefereeAmount, LocalDate DateOfPaymentToReferee) {
        this.ManagerID = ManagerID;
        this.RefereeID = RefereeID;
        this.PaymentToRefereeStatus = PaymentToRefereeStatus;
        this.PaymentToRefereeAmount = PaymentToRefereeAmount;
        this.DateOfPaymentToReferee = DateOfPaymentToReferee;
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
     * @return the PaymentToRefereeStatus
     */
    public String getPaymentToRefereeStatus() {
        return PaymentToRefereeStatus;
    }

    /**
     * @param PaymentToRefereeStatus the PaymentToRefereeStatus to set
     */
    public void setPaymentToRefereeStatus(String PaymentToRefereeStatus) {
        this.PaymentToRefereeStatus = PaymentToRefereeStatus;
    }

    /**
     * @return the PaymentToRefereeAmount
     */
    public long getPaymentToRefereeAmount() {
        return PaymentToRefereeAmount;
    }

    /**
     * @param PaymentToRefereeAmount the PaymentToRefereeAmount to set
     */
    public void setPaymentToRefereeAmount(long PaymentToRefereeAmount) {
        this.PaymentToRefereeAmount = PaymentToRefereeAmount;
    }

    /**
     * @return the DateOfPaymentToReferee
     */
    public LocalDate getDateOfPaymentToReferee() {
        return DateOfPaymentToReferee;
    }

    /**
     * @param DateOfPaymentToReferee the DateOfPaymentToReferee to set
     */
    public void setDateOfPaymentToReferee(LocalDate DateOfPaymentToReferee) {
        this.DateOfPaymentToReferee = DateOfPaymentToReferee;
    }
    
    
}
//Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project. Available on canvas.

//Palaniappan, V. (2023) Creating a LocalDate with values in Java, Baeldung. Available at: https://www.baeldung.com/java-creating-localdate-with-values (Accessed: 20 November 2023). 