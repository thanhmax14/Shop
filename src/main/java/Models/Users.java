/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.Date;

/**
 *
 * @author Pham Quang Thanh - CE171732
 */
public class Users {

    private String Username;
    private String Fullname;
    private String Email;
    private int Phone;
    private String UserType;
    private String Gender;
    private Date Birthday;
    private String Address;
    private String Password;
    private int UserStatus;
    private String ResetToken;
    private String image;

    public Users() {
    }

    public Users(String Username, String Fullname, String Email, int Phone, String UserType, String Gender, Date Birthday, String Address, String Password, int UserStatus, String ResetToken, String image) {
        this.Username = Username;
        this.Fullname = Fullname;
        this.Email = Email;
        this.Phone = Phone;
        this.UserType = UserType;
        this.Gender = Gender;
        this.Birthday = Birthday;
        this.Address = Address;
        this.Password = Password;
        this.UserStatus = UserStatus;
        this.ResetToken = ResetToken;
        this.image = image;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date Birthday) {
        this.Birthday = Birthday;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getUserStatus() {
        return UserStatus;
    }

    public void setUserStatus(int UserStatus) {
        this.UserStatus = UserStatus;
    }

    public String getResetToken() {
        return ResetToken;
    }

    public void setResetToken(String ResetToken) {
        this.ResetToken = ResetToken;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
