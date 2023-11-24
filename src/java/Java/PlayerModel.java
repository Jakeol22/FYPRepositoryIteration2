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
public class PlayerModel {
    
     //Local Date taken from website: Baeldung
    private long PlayerID;
    private String PlayerFname;
    private String PlayerLname;
    private String PlayerEmail;
     private String PlayerPassword;
     private String PlayerClub;
     private String PlayerTeam;
     private LocalDate PlayerDob;
     private String PlayerPhoneNumber;
     private String PlayerAddress;
     private String PlayerCardNumber;
     private long ManagerID;

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
     * @return the PlayerFname
     */
    public String getPlayerFname() {
        return PlayerFname;
    }

    /**
     * @param PlayerFname the PlayerFname to set
     */
    public void setPlayerFname(String PlayerFname) {
        this.PlayerFname = PlayerFname;
    }

    /**
     * @return the PlayerLname
     */
    public String getPlayerLname() {
        return PlayerLname;
    }

    /**
     * @param PlayerLname the PlayerLname to set
     */
    public void setPlayerLname(String PlayerLname) {
        this.PlayerLname = PlayerLname;
    }

    /**
     * @return the PlayerEmail
     */
    public String getPlayerEmail() {
        return PlayerEmail;
    }

    /**
     * @param PlayerEmail the PlayerEmail to set
     */
    public void setPlayerEmail(String PlayerEmail) {
        this.PlayerEmail = PlayerEmail;
    }

    /**
     * @return the PlayerPassword
     */
    public String getPlayerPassword() {
        return PlayerPassword;
    }

    /**
     * @param PlayerPassword the PlayerPassword to set
     */
    public void setPlayerPassword(String PlayerPassword) {
        this.PlayerPassword = PlayerPassword;
    }

    /**
     * @return the PlayerClub
     */
    public String getPlayerClub() {
        return PlayerClub;
    }

    /**
     * @param PlayerClub the PlayerClub to set
     */
    public void setPlayerClub(String PlayerClub) {
        this.PlayerClub = PlayerClub;
    }

    /**
     * @return the PlayerTeam
     */
    public String getPlayerTeam() {
        return PlayerTeam;
    }

    /**
     * @param PlayerTeam the PlayerTeam to set
     */
    public void setPlayerTeam(String PlayerTeam) {
        this.PlayerTeam = PlayerTeam;
    }

    /**
     * @return the PlayerDob
     */
    public LocalDate getPlayerDob() {
        return PlayerDob;
    }

    /**
     * @param PlayerDob the PlayerDob to set
     */
    public void setPlayerDob(LocalDate PlayerDob) {
        this.PlayerDob = PlayerDob;
    }

    /**
     * @return the PlayerPhoneNumber
     */
    public String getPlayerPhoneNumber() {
        return PlayerPhoneNumber;
    }

    /**
     * @param PlayerPhoneNumber the PlayerPhoneNumber to set
     */
    public void setPlayerPhoneNumber(String PlayerPhoneNumber) {
        this.PlayerPhoneNumber = PlayerPhoneNumber;
    }

    /**
     * @return the PlayerAddress
     */
    public String getPlayerAddress() {
        return PlayerAddress;
    }

    /**
     * @param PlayerAddress the PlayerAddress to set
     */
    public void setPlayerAddress(String PlayerAddress) {
        this.PlayerAddress = PlayerAddress;
    }

    /**
     * @return the PlayerCardNumber
     */
    public String getPlayerCardNumber() {
        return PlayerCardNumber;
    }

    /**
     * @param PlayerCardNumber the PlayerCardNumber to set
     */
    public void setPlayerCardNumber(String PlayerCardNumber) {
        this.PlayerCardNumber = PlayerCardNumber;
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

    public PlayerModel(long PlayerID, String PlayerFname, String PlayerLname, String PlayerEmail, String PlayerPassword, String PlayerClub, String PlayerTeam, LocalDate PlayerDob, String PlayerPhoneNumber, String PlayerAddress, String PlayerCardNumber, long ManagerID) {
        this.PlayerID = PlayerID;
        this.PlayerFname = PlayerFname;
        this.PlayerLname = PlayerLname;
        this.PlayerEmail = PlayerEmail;
        this.PlayerPassword = PlayerPassword;
        this.PlayerClub = PlayerClub;
        this.PlayerTeam = PlayerTeam;
        this.PlayerDob = PlayerDob;
        this.PlayerPhoneNumber = PlayerPhoneNumber;
        this.PlayerAddress = PlayerAddress;
        this.PlayerCardNumber = PlayerCardNumber;
        this.ManagerID = ManagerID;
    }
            
            
}

//Bill Emerson sample project from IS3312(2023): Sample Product Viewer5 - Sample project. Available on canvas.

//Palaniappan, V. (2023) Creating a LocalDate with values in Java, Baeldung. Available at: https://www.baeldung.com/java-creating-localdate-with-values (Accessed: 20 November 2023). 